package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ceoandhra.nic.in/home.aspx");
		driver.manage().window().maximize();
		
		WebElement erg=driver.findElement(By.xpath(".//*[@id='myjquerymenu']/ul/li[5]/a"));
		WebElement asm=driver.findElement(By.xpath(".//*[@id='myjquerymenu']/ul/li[5]/ul/li[1]/a"));
		WebElement kys=driver.findElement(By.xpath(".//*[@id='myjquerymenu']/ul/li[5]/ul/li[1]/ul/li[7]/a"));
		Actions  chain=new Actions(driver);
		chain.moveToElement(erg).moveToElement(asm).pause(3000).moveToElement(kys).click().build().perform();
		/*WebElement sign=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		WebElement list=driver.findElement(By.xpath(".//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span"));
		
		Actions mouse=new Actions(driver);
		
		mouse.moveToElement(sign).moveToElement(list).click().build().perform();*/
		
		
	}

}
