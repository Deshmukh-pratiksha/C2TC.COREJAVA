package com.capgemini.dateandtimedemo;

import java.time.LocalDate;
import java.time.Month;

public class DateDemo1 {

	public static void main(String[] args) {
    LocalDate date=LocalDate.now();
    System.out.println(date);
    
  LocalDate datenew=LocalDate.of(2013, Month.AUGUST, 5);
  System.out.println("new date:"+datenew);
    
    LocalDate yesterday=date.minusDays(1);
    System.out.println(yesterday);
    
    LocalDate tomorrow=date.plusDays(1);
    System.out.println(tomorrow);

    LocalDate tomorrow1=yesterday.plusDays(2);
    System.out.println(tomorrow);
    
	}

}