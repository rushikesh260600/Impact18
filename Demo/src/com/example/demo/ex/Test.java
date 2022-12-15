package com.example.demo.ex;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Test {
	int a,b,c;
	public static void main(String[] args) {
		Test t1=new Test();
		Scanner s1=new Scanner(System.in);
		try
		{
			System.out.println("Enter 1st number");
			t1.a=s1.nextInt();
			System.out.println("Enter 2nd Number");
			t1.b=s1.nextInt();
			t1.c=t1.a/t1.b;
			System.out.println("Result is :"+t1.c);


		}
		//System.out.println("Hello");
		catch (InputMismatchException e) {
			System.out.println("please enter value greate than 0 ");
		}

		catch (ArithmeticException e) {
			System.out.println("divide by zero exception ");
		}
		catch (Exception e) {
			System.out.println("Error");
		}
		System.out.println("End of main method");

	}

}
