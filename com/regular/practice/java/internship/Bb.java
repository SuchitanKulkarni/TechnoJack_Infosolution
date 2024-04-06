package com.regular.practice.java.internship;

import java.util.Scanner;



public abstract class Bb implements B1,B2 {
	
	private int roll;
	private String name;

	public void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll no : ");
		setRoll(sc.nextInt());
		System.out.println("Enetr the name : ");
		setName(sc.next());

	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showdata()
	{
		System.out.println(getRoll());
		System.out.println(getName());
	}
	
	abstract void  data();

}
