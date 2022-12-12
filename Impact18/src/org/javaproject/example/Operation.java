package org.javaproject.example;

import java.util.Scanner;

public class Operation {
	private  int  bookid;
	private String bookname;
	private String author;
	private float price;
	Book b1=new Book();
	public void bookdata() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book id");
		bookid = sc.nextInt();
		System.out.println("Enter book name");
		bookname = sc.next();
		System.out.println("Enter Author name");
		author = sc.next();
		System.out.println("Enter price of book");
		price = sc.nextFloat();
		b1.setBookid(bookid);
		b1.setBookname(bookname);
		b1.setAuthor(author);
		b1.setPrice(price);


	}
	public void displaydata() {

		System.out.println(b1.getBookid());
		System.out.println(b1.getBookname());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPrice());
	}

}
