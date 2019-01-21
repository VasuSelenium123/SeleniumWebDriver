package com.vasu.java;

public class Vasu 
{
//method without return type without parameters
	public void add()
	{
		int a=40;
		int b=30;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Vasu v=new Vasu();
		v.add();//calling method with method name  // it won't return any value
		/*int res=v.add();//calling a method with variable  //it will give retun values
		System.out.println(res);*/
	}

}
