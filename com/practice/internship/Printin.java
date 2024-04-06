package com.practice.internship;

public class Printin {

	public static void main(String[] args) {
		
		Fulltimeemp f = new Fulltimeemp();
		Parttimeemp p = new Parttimeemp();
		
		f.setCity("pune");
		f.setDesignation("Dev");
		f.setEid(32);
		f.setEnameString("Suchita");
		f.setMonthsalary(890000);
		
		p.setCity("pune");
		p.setDesignation("Dev");
		p.setEid(33);
		p.setEnameString("priya");
		p.setHrsalary(20000);
		
		System.out.println("FulltimeEmp");
		
		System.out.println(f.getEid());
		System.out.println(f.getEnameString());
		System.out.println(f.getDesignation());
		System.out.println(f.getCity());
		System.out.println(f.getMonthsalary());
		
		System.out.println("ParttimeEmp");
		
		System.out.println(p.getEid());
		System.out.println(p.getEnameString());
		System.out.println(p.getDesignation());
		System.out.println(p.getCity());
		System.out.println(p.getHrsalary());
		
	}

}
