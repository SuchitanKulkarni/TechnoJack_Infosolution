package com.practice.internship;

public class Student {

	int id;
	String name;
	String city;

	void getdata(int id, String name,String city)
	{
		this.id = id;
		this.name = name;
		this.city = city;
	}

	void display()
	{
		System.out.println(" id = " + id);
		System.out.println(" name = " + name);
		System.out.println(" city = " + city);
	}


}
