package com.modifies.examples;
public class Parent {
	
	private int id;
	private String name;
	private String city;
	 private void demo()
	 {
		 System.out.println(id);
	 }
	 public static void main(String[] args) {
		Parent p1=new Parent();
		System.out.println(p1.id);
		p1.demo();
	}

}
