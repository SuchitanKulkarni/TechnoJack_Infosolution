package com.jdbc.database;

import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Delete {

	void delete() throws ClassNotFoundException , SQLException
	{
		String delete = "delete from tblstudent where id = 101";

		java.sql.Statement st = Dbconnection.getconnection().createStatement();

		((java.sql.Statement) st).executeUpdate(delete);

		System.out.println("data deleted");
	}
}


