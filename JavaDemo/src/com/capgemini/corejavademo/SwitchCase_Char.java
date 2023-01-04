//Switch case by using char datatype


package com.capgemini.corejavademo;

public class SwitchCase_Char {
	public static void main(String[] args) 
	{
		char alphabet = 'a';
		switch (alphabet) 
		{
		case'a' : 
		case'A' : 
			System.out.println("The value of alphabet is a");
			break;
		case'b':
		case'B' :
			System.out.println("The value of alphabet is b");
			break;
		case'c':
		case'C' :	
			System.out.println("The value of alphabet is c");
			break;
		default:
	System.out.println("The value of alphabet is other than a,b,c");
			break;
		}
	}


}