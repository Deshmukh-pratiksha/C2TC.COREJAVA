package com.capgemini.client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capgemini.util.DBUtil;

public class Client {

	
	public static void main(String[] args) throws SQLException {
		
		
		Connection connection=DBUtil.getConnection();
		
		if (connection!=null) {
			System.out.println("JDBC: Connection is established");
			}
		else
		{
			System.out.println("JDBC: Connection is not established");
		}
	

		//addBook();
		UpdateBook();
	    SearchBook();
	    DeleteBook();
	    
		
		
	}
	
	//Update
	private static void UpdateBook() throws SQLException
	{
		Connection connection=DBUtil.getConnection();
		Statement stmt=connection.createStatement();
		String sqlUpdate = "update books set price = 4003.00, qty = qty+5 where id = 4001";
	    System.out.println("The SQL statement is: " + sqlUpdate + "\n");  // Echo for debugging
	    int countUpdated = stmt.executeUpdate(sqlUpdate);
	     System.out.println(countUpdated + " records Updated.\n");
	    
	}
	
	//retrieve/Search

	private static void SearchBook() throws SQLException
	{
		Connection connection=DBUtil.getConnection();
		Statement stmt=connection.createStatement();
		 String strSelect = "select title, price, qty from books";
         System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging
 
         ResultSet rset = stmt.executeQuery(strSelect);
         System.out.println("The records selected are:");
         int rowCount = 0;
         
                       
         while(rset.next()) {   // Repeatedly process each row
            String title = rset.getString("title");  // retrieve a 'String'-cell in the row
            double price = rset.getDouble("price");  // retrieve a 'double'-cell in the row
            int    qty   = rset.getInt("qty");       // retrieve a 'int'-cell in the row
            System.out.println(title + ", " + price + ", " + qty);
            ++rowCount;
         }
         System.out.println("Total number of records = " + rowCount);
 
      }
	
	//Delete
		private static void DeleteBook() throws SQLException
		{
			Connection connection=DBUtil.getConnection();
			Statement stmt=connection.createStatement();
			  String sqlDelete = "DELETE from books where id >= 3000 and id < 4008";
		         System.out.println("The SQL statement is: " + sqlDelete + "\n");  // Echo for debugging
		         int countDeleted = stmt.executeUpdate(sqlDelete);
		         System.out.println(countDeleted + " records deleted.\n");
		}

	}