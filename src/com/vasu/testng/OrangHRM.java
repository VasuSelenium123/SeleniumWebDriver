package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangHRM 
{
	public FirefoxDriver driver;
	@BeforeSuite
	public void appLaunch()
	{
		/* driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();*/
		//validation
		System.out.println("AppLaunch");
	}
	@BeforeTest
	public void appLogin()
	{
		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Admin");
	driver.findElement(By.id("btnLogin")).click();*/
		System.out.println("AppLogin");
		
	}
	@AfterTest
	public void appLogout()
	{
		//appLogout
		System.out.println("AppLogout");
	}
	@AfterSuite
	public void appClose()
	{
		//driver.close();
		System.out.println("AppClose");
	}
}
