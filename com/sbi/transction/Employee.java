package com.sbi.transction;

import java.util.Scanner;

public class Employee {

	int id;
	String name;
	String city;
	String designation ;
	float salary;
	
	void getDetails()
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter employee id : ");
		id = s1.nextInt();
		System.out.println("Enter employee name : ");
		name = s1.next();
		System.out.println("Enter employee city : ");
		city = s1.next();
		System.out.println("Enter employee salary : ");
		salary = s1.nextFloat();
		System.out.println("Enter employee designation : ");
		designation = s1.next();
		
		
		
	}
	
	void display()
	{
		System.out.println("Employee id : " + id);
		System.out.println("Employee name : " + name);
		System.out.println("Employee city : " + city);
		System.out.println("Employee salary : " + salary);
		System.out.println("Employee designation : " + designation);
		
	}

}
