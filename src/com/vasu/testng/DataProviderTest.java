package com.vasu.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest
{
@DataProvider
public Object[][] testdata()
{
	Object[][] data=new Object[3][3];
	
	data[0][0]="Sel";
	data[0][1]="Sel1";
	data[0][2]="sel2";
	data[1][0]="vasu";
	data[1][1]="vasu1";
	data[1][2]="vasu2";
	data[2][0]="vamsi";
	data[2][1]="vasmi1";
	data[2][2]="vamsi2";
	return data;
	
}
@Test(dataProvider="testdata")
public void test(String s1, String s2,String s3)
{
	System.out.println(s1+"---"+s2+"--"+s3);
}
}
