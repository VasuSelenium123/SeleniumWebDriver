package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationTest 
{
	public static void main(String[] args) throws IOException, Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		//reading data
		File srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(srcFile);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rcnt=ws.getLastRowNum();
		for (int i = 1; i <=rcnt; i++) 
		{
			String branchName=ws.getRow(i).getCell(0).getStringCellValue();
			String address1=ws.getRow(i).getCell(1).getStringCellValue();
			
			driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
			
			driver.findElement(By.id("BtnNewBR")).click();
			driver.findElement(By.id("txtbName")).sendKeys(branchName);
			driver.findElement(By.id("txtAdd1")).sendKeys(address1);
			driver.findElement(By.id("txtZip")).sendKeys("44444");
			
			Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
			country.selectByIndex(1);
			Thread.sleep(2000);
			Select state=new Select(driver.findElement(By.id("lst_stateI")));
			state.selectByIndex(1);
			Thread.sleep(2000);
			Select city=new Select(driver.findElement(By.id("lst_cityI")));
			city.selectByIndex(1);
			
			driver.findElement(By.id("btn_insert")).click();
			
			Alert alt=driver.switchTo().alert();
			String msg=alt.getText();
			alt.accept();
			//validation
			if (msg.contains("created Sucessfully")) 
			{
				//System.out.println("BranchCreation Successfully");
				ws.getRow(i).createCell(2).setCellValue("Pass");
			}else if(msg.contains("already Exist"))
			{
				//System.out.println("BranchCreation Failed");
				ws.getRow(i).createCell(2).setCellValue("Fail");
			}else if(msg.contains("Please fill in"))
			{
				//System.out.println("Warning Message");
				ws.getRow(i).createCell(2).setCellValue("Warning");
			}
			driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
			
			FileOutputStream fos=new FileOutputStream(srcFile);
			wb.write(fos);
			
		}
wb.close();
	}

}
