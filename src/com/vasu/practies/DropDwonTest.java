package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDwonTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		driver.findElement(By.className("nav-input")).click();
		
		
	}

}
