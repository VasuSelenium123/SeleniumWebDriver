package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Primusbank.qedgetech.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).click();
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();// click Ok
		//al.dismiss();//click Cancel
		//al.getText();// capture the text present on alert
		//al.sendKeys("This Is vasu");// Send text in Prompt area
		
	}

}
