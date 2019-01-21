package com.vasu.practies;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadTest 
{
	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		Thread.sleep(2000);
		
		//Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\FileDn.exe");
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rt.keyPress(KeyEvent.VK_ENTER);
		

	}

}
