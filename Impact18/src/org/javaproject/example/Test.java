package org.javaproject.example;

public class Test {

	public static void main(String[] args) {
//		Employee e1=new Employee();
//		e1.id(55);
//		System.out.println(e1.getdata());

		Employee  e1=new  Employee();
		e1.seteId(55);
		e1.setname("Aakash");
		//e1.setcity("Pune");
		//e1.setsalary(1000f);
		
		System.out.println(e1.geteId());
		System.out.println(e1.getname());
		//System.out.println(e1.getcity());
		//System.out.println(e1.getsalary());
	}

}
