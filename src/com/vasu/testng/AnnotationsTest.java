package com.vasu.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest 
{

	@Test
	public void method1()
	{
		System.out.println("Method1 Executed");
	}
	@Test
	public void method2()
	{
		System.out.println("Method2 Executed");
	}
	@BeforeMethod
	public void before()
	{
		System.out.println("Befrore Method Executed");
	}
	@AfterMethod
	public void after()
	{
		System.out.println("after method Executed");
			}
	@BeforeClass
	public void befofeclass()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
	@BeforeSuite
	public void befofesuite()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite");
	}
}
