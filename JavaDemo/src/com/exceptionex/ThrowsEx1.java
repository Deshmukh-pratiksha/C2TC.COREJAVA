package com.exceptionex;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsEx1 {
	//dev 1
	
	
	void m1() throws ArithmeticException
	{
		try {
			throw new ArithmeticException("Condition is not accepted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("method 1 is created");
	}
	
		//dev 2
	void m2() throws IOException
	{
		System.out.println("method 2 is created");

	}
	
	//dev 3
	void m3() throws SQLException
	{
		System.out.println("method 3 is created");

	}
	
	
	

	public static void main(String[] args) throws Exception {
		
		ThrowsEx1 obj=new ThrowsEx1();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
