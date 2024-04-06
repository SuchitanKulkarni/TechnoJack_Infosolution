package com.practice.internship;


public class Demo2 {

	Demo2() {

		System.out.println("This is an Explicit constructor");
	}
	
	Demo2(int x)
	{
		System.out.println("This is parameterized constructor");
	}
	
	public static void main(String[] args) {
		
		Demo2 n = new Demo2();
		Demo2 p = new Demo2(34);
	}


}
