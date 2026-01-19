package com.functionalinterface;

import java.util.function.BiPredicate;

public class BiPredicateInterfaceDemo {
	public static void main(String[] args) {

		BiPredicate<Integer, Integer> pre1 = (num1, num2) -> num1 > num2;

		Boolean b = pre1.test(10, 20);
		System.out.println(b);

		BiPredicate<Integer, Integer> pre2 = (num1, num2) -> num1 < num2;

		b = pre2.test(10, 20);
		System.out.println(b);
		
		System.out.println("------");
		
		BiPredicate<String, Integer> isEligible = (name, age)->{
			 return name.startsWith("s") && name.length()>3 && age>30;
		};
		Boolean boo = isEligible.test("shiv", 32);
		System.out.println(boo);
		boo = isEligible.test("mahesh", 19);
		System.out.println(boo);
		

	}
}
