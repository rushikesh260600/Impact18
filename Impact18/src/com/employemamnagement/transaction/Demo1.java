package com.employemamnagement.transaction;

public class Demo1 {
	static {
		System.out.println("Static block of demo1 class");
	}
	
	
//static	Demo d1=new Demo();
	public static void main(String[] args) {
		System.out.println("main method of Demo1 class");
		Demo d1=new Demo();
		//d1;
	}

}
