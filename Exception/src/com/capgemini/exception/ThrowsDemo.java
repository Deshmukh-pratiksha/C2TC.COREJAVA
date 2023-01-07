package com.capgemini.exception;


	import java.io.IOException;

	public class ThrowsDemo  {
		
		void m1()
		{
			System.out.println("No exception in this method");
		}

		//Arithmetic Exception	
		void m2() throws ArithmeticException
		{
			throw new ArithmeticException("Arithmetic exception in this method");

		}
		
		//IO Exception	
		void m3() throws IOException,ArithmeticException
		{		
			System.out.println("IO Exception in this method");
			throw new ArithmeticException("Arithmetic exception in this method");


		}
		
		
		public static void main(String[] args) throws IOException {
			ThrowsDemo  obj1=new ThrowsDemo ();
			obj1.m1();
			obj1.m2();
			obj1.m3();
			
		}

	}