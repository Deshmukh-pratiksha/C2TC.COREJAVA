//Switch case in java by using int data type
package com.capgemini.corejavademo;

public class SwitchCase {
	public static void main(String[] args) 
	{
		int firstNumber = 1;

		
		switch (firstNumber) 
		{
		case 1: 
			System.out.println("The value of firstNumber is 1");
			break;
		case 2:
			System.out.println("The value of firstNumber is 2");
			break;
		case 3:
			System.out.println("The value of firstNumber is 3");
			break;
		default:
		System.out.println("The value of firstNumber is other than 1,2,3");
			break;

		}

	}


}
