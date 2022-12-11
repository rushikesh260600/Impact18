package com.banking.service;

public class Test {
	
	static{
		System.out.println("This static block1");
	}
	static{
		System.out.println("This static block2");
	}
	static{
		System.out.println("This static block3");
	}
	{
		System.out.println("This is non-static block1");
	}
	{
		System.out.println("This is non-static block2");
	}
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
		System.out.println("main method ");

	}

}
