package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/vasu/Downloads/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://Google.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("gb_P")).click();
		driver.findElement(By.xpath("//a[@class='gb_P'][@data-pid='23']")).click();
		
		
	}

}
