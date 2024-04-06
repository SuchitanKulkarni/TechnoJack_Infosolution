package com.jdbc.database;

import java.sql.SQLException;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Student n = new Student();
		
		//n.add();
		
		Delete cDelete = new Delete();
		
		cDelete.delete();
	}

}
