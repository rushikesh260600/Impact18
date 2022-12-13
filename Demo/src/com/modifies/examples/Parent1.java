package com.modifies.examples;

public class Parent1 {
	int id;
	String  name;
	void demo()
	{
		System.out.println(id);
	}
	public static void main(String[] args) {
		Parent1 parent1 =new Parent1();
		System.out.println(parent1.name);
		parent1.demo();
	}

}
