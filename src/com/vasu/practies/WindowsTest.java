package com.vasu.practies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsTest 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Set<String> windows=driver.getWindowHandles();
		/*System.out.println(windows.size());
		for(String child:windows)
		{
			//System.out.println(child);
			//driver.switchTo().window(child);
			//driver.close();
			driver.switchTo().window(child);
			//System.out.println(driver.getTitle());
			if (!driver.getTitle().equals("Sykes"))
			{
				driver.close();
			}
		}*/
		/*Iterator<String> it=windows.iterator();
		while (it.hasNext())
		{
			//System.out.println(it.next().toString());
			String child=it.next().toString();
			driver.switchTo().window(child);
			driver.close();
		}
		*/
		List<String> tabs=new ArrayList<>(windows);
		driver.switchTo().window(tabs.get(0));
		driver.close();

	}

}
