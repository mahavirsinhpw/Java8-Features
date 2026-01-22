package com.jadadatandtimeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {
	public static void main(String[] args) {

		LocalDateTime today = LocalDateTime.now();
		LocalDateTime birthDay = LocalDateTime.of(1994, Month.JANUARY, 3, 9, 00, 00);

		Duration gap = Duration.between(birthDay, today);
		System.out.println(gap.toDays());

		LocalDateTime today1 = LocalDateTime.now();
		LocalDateTime birthDay2 = LocalDateTime.of(1999, Month.NOVEMBER, 19, 12, 00, 00);

		Duration gap2 = Duration.between(birthDay2, today);
		System.out.println(gap2.toDays());

		LocalDate today3 = LocalDate.now();
		LocalDate birthDay3 = LocalDate.of(1988, Month.FEBRUARY, 8);
		Period p1 = Period.between(birthDay3, today3);
		Long days1 = ChronoUnit.DAYS.between(birthDay3, today3);

		System.out.println("you are " + p1.getYears() + " years " + p1.getMonths() + " months and " + p1.getDays()
				+ " days old. (" + days1 + " days total)");

	}
}
