package com.jadadatandtimeapi;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.time.temporal.TemporalField;
import java.util.Locale;

public class DayOfWeekDemo {
	public static void main(String[] args) {
		
		DayOfWeek monday = DayOfWeek.MONDAY;
		System.out.println("day "+monday);
		System.out.println("day "+monday.getValue());
		
		Locale loc = Locale.getDefault();
		System.out.println("full "+monday.getDisplayName(TextStyle.FULL, loc));
		System.out.println("short "+monday.getDisplayName(TextStyle.SHORT, loc));
		System.out.println("narrow "+monday.getDisplayName(TextStyle.NARROW, loc));
		System.out.println("------------");
		
		DayOfWeek sunday = DayOfWeek.SUNDAY;
		System.out.println("day : "+sunday);
		System.out.println("day :"+sunday.getValue());
		
		System.out.println(DayOfWeek.TUESDAY.compareTo(monday));
		System.out.println(sunday.compareTo(monday));
		System.out.println(monday.compareTo(sunday));
		System.out.println("------------");
		
		System.out.println("day "+monday);
		System.out.println("-2 "+monday.minus(2));
		System.out.println("+2"+monday.plus(2));
		System.out.println("------------");
		
		
		System.out.println(monday.describeConstable());;
		System.out.println(monday.name());
		System.out.println(monday.getDeclaringClass());
		System.out.println(monday.FRIDAY.plus(3));
		System.out.println(monday.of(3));	
	}
}
