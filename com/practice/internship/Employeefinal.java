package com.practice.internship;

public class Employeefinal {
	
	public static void main(String[] args) {
		
		Employee1a e = new Employee1a();
		Address ad = new Address() ;
		
		
		e.setAddress(ad);
		ad.setFlatno(301);
		ad.setAreaString("Kalashankarnagar");
		ad.setCityString("Pune");
		ad.setCountyString("India");
		ad.setPincode(411032);
		ad.setStateString("Maharastra");
		e.setEid(4567);
		e.setEnameString("Suchita");
		e.setDesignationString("Java Dev");
		
		/*System.out.println("Employee is : " + e.getEid());
		System.out.println("Employee name : "+e.getEnameString());
		System.out.println("Employee Designation " + e.getDesignationString());
		System.out.println("Address : " + ad.getFlatno() + " ," +ad.getAreaString() + " , "+ ad.getCityString() + " ," + ad.getCountyString() + "," + ad.getPincode() + " ," + ad.getStateString());
*/
		
		System.out.println("Employee is : " + e.getEid());
		System.out.println("Employee name : "+e.getEnameString());
		System.out.println("Employee Designation " + e.getDesignationString());
		System.out.println(e.getAddress());
		

		
	}

}
