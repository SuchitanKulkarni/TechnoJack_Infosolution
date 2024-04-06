package com.practice.internship;

public class Newchild extends Parent {

	public Newchild() {
		super(10);
	    
		System.out.println("This is child default constructor");
	}
	
	public Newchild(int x) {
		this();	    
		System.out.println("This is child parametrized constructor");
	}
	
	

	
}
