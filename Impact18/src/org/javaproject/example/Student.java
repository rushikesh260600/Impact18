package org.javaproject.example;

public class Student {
	private int id;
	private String name;
	private String city;
	private String dept;
	
	public Student()
	{
		System.out.println("Student Class Constructor ");
	}
	
	static void demo()
	{
		System.out.println("static demo method");
	}
	void demo1()
	{
		System.out.println("not-static demo1 method");
	}
	static {
		System.out.println("This is static block");
	}
	
	
	
	{
		System.out.println("non-static block ");
	}

}
