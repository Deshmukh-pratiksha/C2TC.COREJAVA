package com.exceptionex;

public class ThrowEx{
	void validate(int age)
	{
		try {
			if(age>16)
			{
				System.out.println("Student is eligible");
			}
			else
			{
				throw new ArithmeticException("Student can not appear for exam");
				//System.out.println("Student is not Eligible");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[]args) {
		
		ThrowEx obj=new ThrowEx();
		obj.validate(18);
		System.out.println("Hello");
	}
}