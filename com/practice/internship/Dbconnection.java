package com.practice.internship;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {

	final static String driver = "com.mysql.cj.jdbc.Driver";
	final static String url= "jdbc:mysql://localhost:3306/registration";
	final static String user = "root";
	final static String password = "Such@123";

	public static void main(String[] args) throws ClassNotFoundException,SQLException{

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("Connected to database");


	}

}
