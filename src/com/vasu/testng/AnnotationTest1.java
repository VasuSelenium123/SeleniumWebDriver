package com.vasu.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest1 
{
	@Test
	public void method3()
	{
		System.out.println("Method3 Executed");
	}
	@Test
	public void method4()
	{
		System.out.println("Method4 Executed");
	}
	
	@BeforeTest
	public void before()
	{
		System.out.println("Befrore test Executed");
	}
	@AfterTest
	public void after()
	{
		System.out.println("after test Executed");
			}
}
