package com.regular.practice.java.internship;

public class Test1 {

	public static void main(String[] args) {
		
		
		I1 i1 = new Child1();
		I2 i2 = new Child1();
		
		i1.demo();
		i2.demo(); // here the I1,I2 is taken as reference.
		
	

	}

}
