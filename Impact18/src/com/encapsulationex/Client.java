package com.encapsulationex;

import java.awt.Choice;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Order od= new Order();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			
		
		System.out.println("Order details");
		System.out.println("1 : Get product details");
		System.out.println("2 : Display product details");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
	
		switch (choice) {
		case 1: {
			od.getProductDetails();
			break;
		}
		case 2:{
			od.displayProductDetails();
			break;

		}
		default :{
			System.out.println("Please Enter valid input");
		
		}
	}
	}
	}
}

