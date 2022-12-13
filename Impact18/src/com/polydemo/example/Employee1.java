package com.polydemo.example;

public class Employee1 {
	private int id;
	private String name;
	private String dept;
	private String city;
	private float salary;
	public Employee1() {
		System.out.println("Default constructor");
	}
	public	Employee1(int id)
	{
		this.id=id;
		System.out.println("Id Of employee: "+id);
	}

	public	Employee1(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("Id Of employee: "+id);
		System.out.println("name Of employee: "+name);
	}
	public	Employee1(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		
		System.out.println("Id Of employee: "+id);
		System.out.println("name Of employee: "+name);
		System.out.println("dept Of employee: "+dept);
	}
	public	Employee1(int id,String name,String dept,String city)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.city=city;
		System.out.println("Id Of employee: "+id);
		System.out.println("name Of employee: "+name);
		System.out.println("dept Of employee: "+dept);
		System.out.println("city Of employee: "+city);
		
	}
	public Employee1(int id, String name, String dept, String city, float salary) {
	
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.city = city;
		this.salary = salary;
		System.out.println("Id Of employee: "+id);
		System.out.println("name Of employee: "+name);
		System.out.println("dept Of employee: "+dept);
		System.out.println("city Of employee: "+city);
		System.out.println("salary Of employee: "+salary);
		
	}






}
