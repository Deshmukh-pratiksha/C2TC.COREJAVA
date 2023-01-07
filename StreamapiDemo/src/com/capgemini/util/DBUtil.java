package com.capgemini.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="Sanavi@05";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/ebookshop";
	private static Connection con;
	static {
	try {
		Class.forName(DB_DRIVER_CLASS);
		con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		
	} 
	catch (ClassNotFoundException | SQLException e) {

	((Throwable) e).printStackTrace();
	}
	}
	
	public static Connection getConnection()
	{
		return con;
	}
}