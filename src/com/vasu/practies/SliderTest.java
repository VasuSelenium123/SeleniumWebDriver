package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		//frames count
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		driver.switchTo().frame(0);
		
		Actions sl=new Actions(driver);
		WebElement slider=driver.findElement(By.xpath(".//*[@id='slider']/span"));
		sl.clickAndHold(slider).moveByOffset(200, 0).release(slider).build().perform();
		Thread.sleep(3000);
		sl.clickAndHold(slider).moveByOffset(-200, 0).release(slider).build().perform();
	}

}
