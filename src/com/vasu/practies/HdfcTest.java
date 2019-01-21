package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HdfcTest
{
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://hdfcbank.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginsubmit")).click();
		
		//driver.close();
		driver.quit();

	}

}
