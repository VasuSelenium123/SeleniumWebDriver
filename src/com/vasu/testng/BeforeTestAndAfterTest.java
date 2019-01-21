package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAndAfterTest
{
	public FirefoxDriver driver;
	@BeforeTest
	public void appLaunch()
	{
		 driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		//validation
	}
	@Test
	public void appLogin()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Admin");
	driver.findElement(By.id("btnLogin")).click();
		
	}
	@AfterTest
	public void appClose()
	{
		driver.close();
	}
}
