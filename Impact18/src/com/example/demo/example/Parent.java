package com.example.demo.example;

public class Parent {

	public	Parent()
	{
		System.out.println("Parent class Default Constructor");
	}

	public Parent(int a)
	{
		
		this();
		System.out.println("Parent class parameterized Constructor");
	}

}
