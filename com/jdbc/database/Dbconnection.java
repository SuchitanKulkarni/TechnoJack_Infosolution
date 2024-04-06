package com.jdbc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Dbconnection {

	static final String driver = "com.mysql.cj.jdbc.Driver" ;
	static final String url = "jdbc:mysql://localhost:3306/demo";
	static final String user = "root";
	static final String pass = "Such@123";
	
	static Connection getconnection () throws ClassNotFoundException , SQLException
	{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,user,pass);
		
		System.out.println("Database is Connected");
		
		return conn;
		
	}
}
