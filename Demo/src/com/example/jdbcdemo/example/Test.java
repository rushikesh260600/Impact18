package com.example.jdbcdemo.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.tree.AbstractLayoutCache;


public class Test {
	final static String	driver="com.mysql.jdbc.Driver";
	final static String conString="jdbc:mysql://localhost:3306/Impact18";
	final static String User="root";
	final static String passwordString="4321";
	static Connection con=null;
	final static String INSERT_STRING="Insert into tblemployee values(5,'viraj','hyd','cse')";
	public static void main(String[] args)  {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(conString,User,passwordString);
			System.out.println("Connection done");

			Statement statement=con.createStatement();
			statement.execute(INSERT_STRING);
			System.out.println("Data Inserted ");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");

		}
		catch (SQLException e) {
			System.out.println("Sql Exception");
		}

		finally {
			try {
				
				con.close();
				
				
				try {
					
				} catch (Exception e2) {
				try {
					
				} catch (Exception e3) {
					// TODO: handle exception
				}
				}
				
			} catch (Exception e2) {
				System.out.println("sql exception");
			}
			finally {
				System.out.println("finnaly with in finally");
			}
			System.out.println("Connection closed");
		}



	}

}
