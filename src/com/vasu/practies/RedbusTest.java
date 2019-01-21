package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedbusTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("H");
		
		Thread.sleep(3000);
		
		List<WebElement> list=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		System.out.println(list.size());
		for (WebElement cities : list) 
		{
			System.out.println(cities.getText());
		}
		

	}

}
