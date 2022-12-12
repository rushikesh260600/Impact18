package com.exmaple.demo;

public class Demo {
	
	public  Demo()
	{
		System.out.println("this is constructor");
	}
	static{
		System.out.println("this is static block");
	}
	{
		System.out.println("this is non-static block");
	}
	public void demo()
	{
		System.out.println("This is non-static method");
	}
	public static void demo1()
	{
		System.out.println("This is static method");
	}
	
	public static void main(String[] args) {
		
	}
	
}

