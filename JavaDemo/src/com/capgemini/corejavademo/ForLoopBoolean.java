//If else condition by using boolean primitive datatype in java


package com.capgemini.corejavademo;

public class ForLoopBoolean {
	public static void main(String[] args) 
	{	
		int number = 1;
		boolean Prime = true;
		for(int i = 2; i<number/2; i++)
		{
			if(number % i == 0)
			{
				 Prime = false;
			}
		}
		if( Prime == true)
		{
System.out.println("The number is a prime number");
		}
		else
		{
System.out.println("The number is not a prime number");
		}
		

	}



}