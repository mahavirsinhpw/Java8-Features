package com.jadadatandtimeapi;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		System.out.println("year : "+dateTime.getYear());
		System.out.println("month : "+dateTime.getMonth());
		System.out.println("month value : "+dateTime.getMonthValue());
		System.out.println("day od month : "+dateTime.getDayOfMonth());
		System.out.println("hour : "+dateTime.getHour());
		System.out.println("min : "+dateTime.getMinute());
		System.out.println("sec : "+dateTime.getSecond());
		System.out.println("nano sec : "+dateTime.getNano());
		
		System.out.println("-----------------");
		
		System.out.println("-2 hour : "+dateTime.minusHours(2));
		System.out.println("-2 min : "+dateTime.minusMinutes(2));
		System.out.println("-2 sec : "+dateTime.minusSeconds(2));
		System.out.println("+2 hour : "+dateTime.plusHours(2));
		System.out.println("+2 hour : "+dateTime.plusMinutes(2));
		System.out.println("+2 hour : "+dateTime.plusSeconds(2));
		System.out.println(dateTime);
		
		System.out.println("-----------------");
		
		System.out.println("with hour-12 : "+dateTime.withHour(12));
		System.out.println("with year-2019 :"+dateTime.withYear(2019));
		
		System.out.println("-----------------");
		
		LocalDateTime currentDateTimeInLosAngeles = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		LocalDateTime currentDateTimeInLocalSystem = LocalDateTime.now(ZoneId.systemDefault());
		System.out.println(currentDateTimeInLosAngeles);
		System.out.println(currentDateTimeInLocalSystem);
		
	}
}
