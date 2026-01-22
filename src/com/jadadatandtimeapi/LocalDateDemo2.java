package com.jadadatandtimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;

public class LocalDateDemo2 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate nextWedDate = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println("next wed date " + nextWedDate);

		LocalDate previousWedDate = date.with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));
		LocalDate lastWedDate2 = date.with(TemporalAdjusters.lastInMonth(DayOfWeek.WEDNESDAY));
		System.out.println("pre wed date :" + previousWedDate);
		System.out.println("last wed date :" + lastWedDate2);
		System.out.println("-2 year " + date.minusYears(2));
		System.out.println("-2 months " + date.minusMonths(2));
		System.out.println("-2 week " + date.minusWeeks(2));
		System.out.println("-2 day " + date.minusDays(2));

		System.out.println("--------------");
		System.out.println(date);
		System.out.println("+2 year " + date.plusYears(2));
		System.out.println("+2 months " + date.plusMonths(2));
		System.out.println("+2 week " + date.plusWeeks(2));
		System.out.println("+2 day " + date.plusDays(2));
		System.out.println(date);
		System.out.println("--------------");
		System.out.println(LocalDate.MAX);
		System.out.println(LocalDate.MIN);
		System.out.println("--------------");

		LocalDate currentDateInLosAngeles = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		LocalDate currentDateInLocalSystem = LocalDate.now(ZoneId.systemDefault());
		System.out.println(currentDateInLosAngeles);
		System.out.println(currentDateInLocalSystem);
	}
}
