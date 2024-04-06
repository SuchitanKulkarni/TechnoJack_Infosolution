package com.regular.practice.java.internship;


public class Pchild extends Parent1{
	
	@Override // here without using this over-ride the both the demo functions are behaving two different method so by this we are doing over-ride.
	void demo()
	{
		System.out.println("In child");
	}

}
