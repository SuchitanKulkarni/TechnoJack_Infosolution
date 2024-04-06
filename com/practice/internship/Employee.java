package com.practice.internship;

public class Employee {
	
	private int id;
	private String name;
	private String cityString;
	private String description;
	private float salary;
	
	void getdetils(int id,String name, String cityString,String description,float salary)
	{
		this.id = id;
		this.cityString = cityString;
		this.description = description;
		this.salary = salary;
		
	}
	
	void display()
	{
		System.out.println("id = " + id);
		System.out.println("city = " + cityString);
		System.out.println("description = " + description);
		System.out.println("salary = " + salary);
	}
	
	

}
