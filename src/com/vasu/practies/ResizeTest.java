package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		//frames count
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		driver.switchTo().frame(0);
		
		Actions rs=new Actions(driver);
		WebElement resize=driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		rs.clickAndHold(resize).moveByOffset(100, 90).release(resize).build().perform();

	}

}
