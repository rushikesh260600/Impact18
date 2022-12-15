package com.example.demo.ex;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Example {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter 1st number");
	int a=s1.nextInt();
	System.out.println("Enter 2nd number");
	int b=s1.nextInt();
	int c=a/b;
	System.out.println("Division is "+c);
	System.out.println("End of the main method");
	

	}

}
