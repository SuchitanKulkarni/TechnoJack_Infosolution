package com.practice.internship;



public class Product {



	private int pid;
	private String pname;
	private String pdescription;
	private int pprice;
	private  String pcategory;


	void getdata(int pid,String pname,String pdescription,int pprice,String pcategory)
	{
		this.pid = pid;
		this.pname = pname;
		this.pdescription = pdescription;
		this.pprice = pprice;
		this.pcategory = pcategory;
	}

	void display()
	{
		System.out.println("Product id : " + pid);
		System.out.println("Product name : " + pname);
		System.out.println("Product description : " + pdescription);
		System.out.println("Product price : " + pprice);
		System.out.println("Product category : " + pcategory);

	}

}
