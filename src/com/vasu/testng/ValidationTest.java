package com.vasu.testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ValidationTest 
{
@Test
public void validation()
{
	String exp="Vasu";
	String act="Vasu";
	/*if (exp.equals(act))
	{
	System.out.println("Pass");	
	}else
	{
		System.out.println("Fail");
	}*/
	Assert.assertEquals(exp, act);
}
}
