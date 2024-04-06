package com.practice.internship;

public class Productfinal {

	public static void main(String[] args) {
		
		Product1a a = new Product1a();
		
		a.setPid(402);
		a.setPname("phone");
		a.setPdesc("It is a smart phone");
		a.setPcate("Smart phone");
		a.setPprice(720000);
		
		System.out.println(a.getPid());
		System.out.println(a.getPname());
		System.out.println(a.getPdesc());
		System.out.println(a.getPcate());
		System.out.println(a.getPprice());
	}

}
