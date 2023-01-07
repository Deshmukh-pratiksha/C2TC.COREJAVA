package com.capgemini.lambdademo;

interface Lambda{
	public void demo();
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambda obj=()->
		{
			System.out.println("I am from Akola batch");
			System.out.println("I am from Amravti batch");
			System.out.println("I am from Dehradun batch");
			System.out.println("I am from Chandrapur batch");
			System.out.println("I am from Delhi batch");

		};
		obj.demo();

	}

}