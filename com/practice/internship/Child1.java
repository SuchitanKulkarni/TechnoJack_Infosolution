package com.practice.internship;

import java.util.Scanner;

public class Child1 extends Parent1 {
	
	void getdata()
	{
		Scanner s = new Scanner(System.in);
		
		setId(s.nextInt());
		setNameString(s.next());
		setCityString(s.next());
		setSalary(s.nextFloat());
		
	
	}
	
	void display()
	{
		System.err.println(getId());
		System.err.println(getNameString());
		System.out.println(getCityString());
		System.out.println(getSalary());
	}

}
