package com.vasu.testng;

import org.testng.annotations.Test;

public class FirstTestNgTest
{
@Test(priority=1)
public void appLaunch()
{
	System.out.println("AppLaunch");
	
}
@Test(enabled=false)
public void appLogin()
{
	System.out.println("AppLogin");
	
}
@Test()
public void appClose()
{
	System.out.println("AppClose");
	
}
}
