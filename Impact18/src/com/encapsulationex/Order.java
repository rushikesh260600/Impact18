package com.encapsulationex;

import java.util.Scanner;

public class Order {

	private int id;
	private String productType;
	private String productName;
	private float productPrice;
	private String desc;
	Product p1 =new Product();
	public  void  getProductDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product Id: ");
		id= sc.nextInt();

		System.out.println("Enter product type");
		productType  = sc.next();

		System.out.println("Enter product name: ");
		productName  = sc.next();

		System.out.println("Enter product price: ");                                            
		productPrice = sc.nextFloat();

		System.out.println("Enter product desc: ");
		desc = sc.next();

		p1.setId(id);
		p1.setProductType(productType);
		p1.setProductName(productName);
		p1.setProductPrice(productPrice);
		p1.setDesc(desc); 
	}
	public void displayProductDetails() {
		System.out.println(p1.getId());
		System.out.println(p1.getProductType());
		System.out.println(p1.getProductName());
		System.out.println(p1.getProductPrice());
		System.out.println(p1.getDesc());
	}

}
