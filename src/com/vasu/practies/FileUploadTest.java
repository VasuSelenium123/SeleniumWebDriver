package com.vasu.practies;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("VasuDeva");
		driver.findElement(By.id("lastName")).sendKeys("Selenium");
		
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys("1994");
		driver.findElement(By.id("photofile")).click();
		//AutoIt
		Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\fileUpload.exe");
		Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		//validation
		if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed())
		{
			System.out.println("Employee Creation Successfully");
		}else
		{
			System.out.println("Employee Creation Failed");
		}
		

	}

}
