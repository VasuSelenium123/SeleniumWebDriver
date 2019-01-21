package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://yahoo.com");
		
		driver.findElement(By.id("uh-search-box")).sendKeys("Admin");
		
		driver.findElement(By.id("uh-search-button")).click();
		

	}

}
