package com.capgemini.dateandtimedemo;

import java.time.LocalDate;

public class Demo3 {

	public static void main(String[] args) {
		
		LocalDate date1=LocalDate.of(2022, 2, 28);
		System.out.println(date1);
		
		LocalDate date2=LocalDate.of(2020, 2, 28);
		System.out.println(date1);
		
		System.out.println(date1.isLeapYear());
		System.out.println(date2.isLeapYear());
		
		
	}

}