package com.abstractdemo.example;

public class Client extends Child {
	public void test()
	{
		System.out.println("this test class method");
	}
	public static void main(String[] args) {


		Client c1=new Client();
		c1.demo();
		c1.test();

		Demo d1=new Client();
		d1.test();


	}
}
