package com.jadadatandtimeapi;

import java.time.LocalDate;

public class LocalDateDemo {
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2025, 1, 20);
		System.out.println("year : " + date.getYear());
		System.out.println("Month : " + date.getMonth());
		System.out.println("Month value : " + date.getMonthValue());
		System.out.println("date : " + date.getDayOfMonth());
		System.out.println("day of week : " + date.getDayOfWeek());
		System.out.println("day of week value : " + date.getDayOfWeek().getValue());
		System.out.println("day of year : " + date.getDayOfYear());
		System.out.println("len of mon : " + date.lengthOfMonth());
		System.out.println("len of year : " + date.lengthOfYear());

		System.out.println("-----------");

		LocalDate date1 = LocalDate.now();
		System.out.println("year : " + date1.getYear());
		System.out.println("Month : " + date1.getMonth());
		System.out.println("Month value : " + date1.getMonthValue());
		System.out.println("date : " + date1.getDayOfMonth());
		System.out.println("day of week : " + date1.getDayOfWeek());
		System.out.println("day of week value : " + date1.getDayOfWeek().getValue());
		System.out.println("day of year : " + date1.getDayOfYear());
		System.out.println("len of mon : " + date1.lengthOfMonth());
		System.out.println("len of year : " + date1.lengthOfYear());
		
		System.out.println("-----------");
		
		LocalDate date3 = LocalDate.ofYearDay(2015, 24);
		System.out.println("year : " + date3.getYear());
		System.out.println("Month : " + date3.getMonth());
		System.out.println("Month value : " + date3.getMonthValue());
		System.out.println("date : " + date3.getDayOfMonth());
		System.out.println("day of week : " + date3.getDayOfWeek());
		System.out.println("day of week value : " + date3.getDayOfWeek().getValue());
		System.out.println("day of year : " + date3.getDayOfYear());
		System.out.println("len of mon : " + date3.lengthOfMonth());
		System.out.println("len of year : " + date3.lengthOfYear());
	}
}
