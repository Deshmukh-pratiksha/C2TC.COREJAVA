//Making decision by using if-else statement

package com.capgemini.corejavademo;

public class DecisionStatement {
	public static void main(String[] args) {
		int firstNumber = 4;

		
		if (firstNumber == 5) 
		  { 
		if (firstNumber>= 5) 
		  {
			System.out.println("firstNumber is greater than 5"); 
		   }
		else
		  {
		  System.out.println("firstNumber is smaller than 5"); 
		  } 
		 }
		
		if(firstNumber == 5)
		{
			System.out.println("firstNumberequals to 5");
		}
		else if(firstNumber> 5)
		{
			System.out.println("XfirstNumberis greater to 5");		
		}
		else
		{
			System.out.println("firstNumber is smaller than 5");
		}
		
	}


}
