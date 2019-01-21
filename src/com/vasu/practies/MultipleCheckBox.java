package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleCheckBox {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> checkList=table.findElements(By.tagName("input"));
		System.out.println(checkList.size());
		for (int i = 0; i < checkList.size(); i++) 
		{
			checkList.get(i).click();
			//System.out.println(checkList.get(i).getAttribute("checked")+"    "+checkList.get(i).getAttribute("value"));
		/*if (checkList.get(i).getAttribute("value").equals("Cheese"))
		{
			checkList.get(i).click();
		}*/
			for (int j = 0; j < checkList.size(); j++)
			{
				System.out.println(checkList.get(j).getAttribute("checked")+"    "+checkList.get(j).getAttribute("value"));
			}
			System.out.println("#########");
		}

	}

}
