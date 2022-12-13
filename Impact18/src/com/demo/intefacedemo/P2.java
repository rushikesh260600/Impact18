package com.demo.intefacedemo;

public  abstract interface P2 {

	public abstract void demo();
	public void demo1();

	//static void demo5();
	default void demo3()
	{
		System.out.println("default method demo3");
	}
	static void demo4()
	{

	}
}
