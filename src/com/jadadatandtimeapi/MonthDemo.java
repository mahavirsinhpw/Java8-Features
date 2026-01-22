package com.jadadatandtimeapi;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthDemo {
	public static void main(String[] args) {

		Month june = Month.JUNE;
		System.out.println("month :" + june);
		System.out.println("value :" + june.getValue());
		System.out.println("max :" + june.maxLength());
		System.out.println("min : " + june.minLength());

		Locale loc = Locale.getDefault();
		System.out.println("full :" + june.getDisplayName(TextStyle.FULL, loc));
		System.out.println("short :" + june.getDisplayName(TextStyle.SHORT, loc));
		System.out.println("narrow :" + june.getDisplayName(TextStyle.NARROW, loc));
		System.out.println("-------------");

		System.out.println("-2 " + june.minus(2));
		System.out.println("+2 " + june.plus(2));
		System.out.println("no of days " + june.length(false));
		System.out.println("no of days(leap) " + june.length(true));
		System.out.println("-------------");

		System.out.println("\n Day of year :" + Month.JANUARY.firstDayOfYear(false));
		System.out.println("\n Day of year(leap) :" + Month.JANUARY.firstDayOfYear(true));
		System.out.println("\n Day of year :" + Month.MARCH.firstDayOfYear(false));
		System.out.println("\n Day of year :" + Month.MARCH.firstDayOfYear(true));

		System.out.println("\n Month of Quarter :" + Month.JANUARY.firstMonthOfQuarter());
		System.out.println("\n Month of Quarter :" + Month.MAY.firstMonthOfQuarter());
		System.out.println("\n Month of Quarter :" + Month.DECEMBER.firstMonthOfQuarter());

	}
}
