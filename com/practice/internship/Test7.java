package com.practice.internship;

public class Test7 {

	public static void main(String[] args) {
		
		Demo4 v = new Demo4();
		
		v.display();
		
		Demo4.Client2 c = v.new Client2();    // this is the way to access the inner class object
		
		c.data();
		
	}
}
