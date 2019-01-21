package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationTest 
{
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys("VasuKrishna344");
		driver.findElement(By.id("txtAdd1")).sendKeys("QedgeTech");
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
			System.out.println("BranchCreation Successfully");
		}else if(msg.contains("already Exist"))
		{
			System.out.println("BranchCreation Failed");
		}else if(msg.contains("Please fill in"))
		{
			System.out.println("Warning Message");
		}
		
		
		
		
		
	}

}
