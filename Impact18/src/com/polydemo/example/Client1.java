package com.polydemo.example;

public class Client1 {

	public static void main(String[] args) {
	Child c1=new Child();
	c1.demo();
	c1.demo(10);
	Parent p1=new Parent();
	p1.demo();
	
	Parent p2=new Child();
	p2.demo();
	
	}

}
