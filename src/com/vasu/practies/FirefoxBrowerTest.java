package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowerTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vasu\\Downloads\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("Http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("Selenium");

	}

}
