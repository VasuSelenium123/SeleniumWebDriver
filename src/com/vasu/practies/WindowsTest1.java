package com.vasu.practies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsTest1 {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		String parentPage=driver.getWindowHandle();
		//System.out.println(parentPage);
		
		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String> windows=driver.getWindowHandles();
		for (String child : windows) 
		{
			//System.out.println(child);
			//driver.switchTo().window(child);
			//driver.close();
			/*if (!parentPage.equals(child))
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			}*/
			driver.switchTo().window(child);
			if (!driver.getTitle().equals("NetBanking")) 
			{
				driver.close();
			}
		}
		

	}

}
