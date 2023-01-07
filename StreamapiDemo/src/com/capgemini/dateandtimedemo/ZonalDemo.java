package com.capgemini.dateandtimedemo;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class ZonalDemo {

	public static void main(String[] args) {

		
//		for(String i:ZoneId.getAvailableZoneIds())
//		{
//			System.out.println(i);
//		}
		
		ZoneId zone1=ZoneId.of("Asia/Kolkata");
		LocalTime zone1time=LocalTime.now(zone1);
		System.out.println(zone1time);
		
		
		
		ZoneId zone2=ZoneId.of("Asia/Tokyo");
		LocalTime zone2time=LocalTime.now(zone2);
		System.out.println(zone2time);
		
		long hours=ChronoUnit.HOURS.between(zone1time, zone2time);
		System.out.println(hours);
		
		long minutes=ChronoUnit.MINUTES.between(zone1time, zone2time);
		System.out.println(minutes);
		
		
				
		
	}

}