package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminLoginTest 
{
@Test
public void adminLogin()
{
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("Http://Primusbank.qedgetech.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();
	//validation
	//Assert.assertEquals(driver.getTitle(), "Primus BANK");
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed());
}
}
