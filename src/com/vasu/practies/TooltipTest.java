package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		//frames count
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		driver.switchTo().frame(0);	
		
		Actions action=new Actions(driver);
		WebElement toolTip=driver.findElement(By.xpath(".//*[@id='age']"));
		action.moveToElement(toolTip).click().build().perform();
		action.moveToElement(driver.findElement(By.className("ui-tooltip ui-corner-all ui-widget-shadow ui-widget ui-widget-content"))).build().perform();
		System.out.println(driver.findElement(By.className("ui-tooltip ui-corner-all ui-widget-shadow ui-widget ui-widget-content")).getText());

	}

}
