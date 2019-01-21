package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarTest 
{
	public static void main(String[] args)
	{
		String expDate="14/june/2019";
		String[] dateSlipt=expDate.split("/");
		
		String day=dateSlipt[0];
		String month=dateSlipt[1];
		String year=dateSlipt[2];
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("DepartDate")).click();
		//year selection
		String calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while (!calYear.equals(year)) 
		{
			driver.findElement(By.className("nextMonth")).click();
			calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		//month
		String calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calMonth.equalsIgnoreCase(month)) 
		{
			driver.findElement(By.className("nextMonth")).click();
			calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		//day
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));
		System.out.println(rows.size());
		//coloumn count
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
			System.out.println(col.size());
			for (int j = 0; j < col.size(); j++) 
			{
				String calDay=col.get(j).getText();
				if (calDay.equals(day)) 
				{
					col.get(j).click();
				}
			}
		}

	}

}
