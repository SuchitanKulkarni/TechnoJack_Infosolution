package com.student.detail;

import java.util.Scanner;
import java.util.jar.Attributes.Name;



public class Student {
	
	String name;
	int roll;
	String std;
	String city;
	int e,m,s,s1,m1,h,s3;
	
	  void getdetails()
	{
		Scanner p = new Scanner(System.in) ;
		
		Student n = new Student();
		
		System.out.println(" Enter the Student roll : ");
		roll = p.nextInt();
		System.out.println(" Enter the Student name : ");
		name = p.next();
		System.out.println(" Enter the Student's  city : ");
		city = p.next();
		System.out.println(" Enter the Student's English marks : ");
		e = p.nextInt();
		System.out.println(" Enter the Student's Marathi marks : ");
		m = p.nextInt();
		System.out.println(" Enter the Student's Social science marks : ");
		s = p.nextInt();
		System.out.println(" Enter the Student's Science marks : ");
		s1 = p.nextInt();
		System.out.println(" Enter the Student's Maths marks : ");
		m1 = p.nextInt();
		System.out.println(" Enter the Student's Hindi marks : ");
		h = p.nextInt();
		System.out.println(" Enter the Student's Sanskrit marks : ");
		s3 = p.nextInt();
		
	}
	
	 void displaydetails()
	{
		
		System.out.println(" Student's Roll is  : " + roll);
		System.out.println(" Student's name is  : " + name);
		System.out.println(" Student's city is  : " + city);
		System.out.println(" Student's English marks is  : " + e);
		System.out.println(" Student's Marathi marks is  : " + m);
		System.out.println(" Student's Social science marks is  : " + s);
		System.out.println(" Student's Science marks is  : " + s1);
		System.out.println(" Student's Maths marks is  : " + m1);
		System.out.println(" Student's Hindi marks is  : " + h);
		System.out.println(" Student's Sanskrit marks is  : " + s3);
		
		
	}
	
	  void avg()
	{
		Student c = new Student();
		
		float Avg = (e + h + m + m1 + s + s1 + s3)/7;
		
		
		System.out.println("The percentage is  : " + Avg + " %" );
	}
	

}
