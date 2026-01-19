package com.functionalinterface;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {
	public static void main(String[] args) {

		Supplier<String> sup = () -> "Hello guys how are you ?";
		String st = sup.get();
		System.out.println(st);
		System.out.println(sup.get());

		Supplier<Integer> day = () -> LocalDate.now().getDayOfMonth();
		Integer in = day.get();
		System.out.println(in);
		System.out.println(day.get());

		Supplier<DayOfWeek> dayofWeek = () -> LocalDate.now().getDayOfWeek(); // gives object of DayOfWeek
		DayOfWeek dow = dayofWeek.get(); // get the obj of DayOfWeek
		System.out.println(dow);
		System.out.println(dow.getValue()); // gives number of day Mon to Sun from -> 1 to 7
		System.out.println(dayofWeek.get());

	}
}
