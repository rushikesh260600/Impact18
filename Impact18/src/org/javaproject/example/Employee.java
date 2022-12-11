package org.javaproject.example;

public class Employee {
	private int eId;
	private String  name;
	private String city;
	private float salary;

	public void seteId(int eId)
	{
		this.eId=eId;
	}


	public int geteId() {
		return this.eId;

	}
	
	public void setname(String name)
	{
	this.name = name;
	}
	
	public String getname()
	{
	return this.name;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public String getcity()
	{
		return this.city;
	}
	public void setsalary(float salary)
	
	{
	this.salary=salary;
	}
	public float getsalary()
	{
		return this.salary;
	}
	
	
}
