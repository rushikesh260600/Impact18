package com.inheritance.example;

public class Test {

	public static void main(String[] args) {
	Employee e1=new Employee();
	e1.setName("joe");
	e1.setCity("hyd");
	e1.setMobile(1324564);
	e1.setEmail("joe@gmail.com");
	System.out.println(e1.getName());
	System.out.println(e1.getCity());
	System.out.println(e1.getMobile());
	System.out.println(e1.getEmail());

	}

}