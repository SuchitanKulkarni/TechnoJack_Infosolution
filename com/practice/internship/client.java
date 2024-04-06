package com.practice.internship;



public class client {
	
	String name = "pune"; //declation and initilization
	int roll = 1;
	float percentage = 82.34f;
	String dept = "admin";
	
	/*void add() {
		
		System.out.print("Name is : " + name);
		System.out.print("roll is : " + roll);
		System.out.print("percentage is : " + percentage);
		System.out.print("Name is : " + dept);
		
	}
	*/

	public static void main(String[] args) {
		
		client c = new client(); 
		
		System.out.println("Name is : " + c.name);
		System.out.println("roll is : " + c.roll);
		System.out.println("percentage is : " + c.percentage);
		System.out.println("Name is : " + c.dept);
		
	}

}
