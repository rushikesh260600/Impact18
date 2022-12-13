package com.example.demo.example;

public class Child extends Parent {
	public Child() {
		//super(10);
		System.out.println("Child class Default Constructor");
	}

	public	Child(int a)
	{
		super(10);
		//this();
		System.out.println("Child class Parameterized Constructor");
	}
}
