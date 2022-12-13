package com.example.abstractdemo;

public abstract class Demo {
	public Demo()
	{
		System.out.println("This Demo class Constructor");
	}
	public Demo(int a)
	{this();
		System.out.println("This Demo class parameterized Constructor");
	}

}
