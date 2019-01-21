package com.vasu.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsTest
{
@Test(priority=1)
public void launchUrl()
{
	System.out.println("Launch url");
	Assert.fail();
}
@Test(priority=2,dependsOnMethods="launchUrl",alwaysRun=true)
public void userCredentials()
{
	System.out.println("user details");
}
@Test(priority=3,dependsOnMethods="userCredentials")
public void login()
{
	System.out.println("login");
}
}
