package com.capgemini.dateandtimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Demo2 {

	public static void main(String[] args) {

		LocalDate date=LocalDate.now();
		System.out.println("Current Date is:"+date);
		
		
		
		
		
		LocalTime time=LocalTime.now();
		System.out.println("Current time is:"+time);
		
		
		LocalTime time1=time.minusHours(2);
		System.out.println("Older time is:"+time1);
		
		LocalTime time2=time.plusHours(2);
		System.out.println("Newer time is:"+time2);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("Cuttent Date and time is:"+dt);
		
		//to print in a particular format
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTime=dt.format(format);
		
		System.out.println("Formatted Date and Time is:"+formatedDateTime);
		
		
		
		
	}

}