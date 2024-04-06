package com.jdbc.database;

import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Student {
	
	void add() throws ClassNotFoundException, SQLException
	{
		String insert = "insert into tblstudent values(501,'akansha','pune','2344')";
		
		java.sql.Statement st = Dbconnection.getconnection().createStatement();
		
		((java.sql.Statement) st).executeUpdate(insert);
		
		System.out.println("Data inserteds");
	}

}
