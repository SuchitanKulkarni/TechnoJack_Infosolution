package com.practice.internship;



public class Datatest {

	public static void main(String[] args) {
		
		Electronicproducts e = new Electronicproducts();
		Fashionproducts f = new Fashionproducts();
		Cosmaticsproducts c = new Cosmaticsproducts();
		
		e.setId(102);
		e.setName("Mobile");
		e.setPrice(560000);
		e.setDes("Smart");
		e.setWaranty("one month");
		
		f.setId(103);
		f.setName("kurti");
		f.setPrice(5000);
		f.setDes("multi color");
		f.setQuality("Best");
		
		c.setId(104);
		c.setName("Lakme");
		c.setPrice(5600);
		c.setDes("high pigmented");
		c.setDate("one month");
		
		System.out.println("--------------------------------------------");
		
		System.out.println(" Electronics Products");
		
		System.out.println("Electronic id : " + e.getId());
		System.out.println("Electronic name : " + e.getName());
		System.out.println("Electronic Description : " + e.getDes());
		System.out.println("Electronic price : " + e.getPrice());
		System.out.println("Electronic Waranty : " + e.getWaranty());
		
		System.out.println("--------------------------------------------");
		
		System.out.println(" Fashion Products");
		
		
		System.out.println("Fashion id : " + f.getId());
		System.out.println("Fashion name : " + f.getName());
		System.out.println("Fashion Description : " + f.getDes());
		System.out.println("Fashion price : " + f.getPrice());
		System.out.println("Fashion Quality : " + f.getQuality());
		
		System.out.println("--------------------------------------------");
		
		System.out.println(" Cosmatics Products");
		
		
		System.out.println("Cosmatics id : " + c.getId());
		System.out.println("Cosmatics name : " + c.getName());
		System.out.println("Cosmatics Description : " + c.getDes());
		System.out.println("Cosmatics price : " + c.getPrice());
		System.out.println("Cosmatics Expireydate : " + c.getDate());
		
		System.out.println("--------------------------------------------");
		
		
		
		
	}

}
