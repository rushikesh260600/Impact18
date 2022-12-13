package com.modifies.examples;



public class P1 {
	protected int id;
	protected String name;
	protected void demo()
	{
		System.out.println(id);
	}
	public static void main(String[] args) {
		P1 p1=new P1();
		System.out.println(p1.id);
		p1.demo();
	}

}
