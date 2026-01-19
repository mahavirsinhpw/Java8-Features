package com.functionalinterface;

import java.util.function.Predicate;

public class PredicateInterfaceDemo4 {
	public static void main(String[] args) {
		Predicate<Integer> pre1 = (num) -> {
			System.out.println("pre1");
			return num % 2 == 0;
		};

		Predicate<Integer> pre2 = (num) -> {
			System.out.println("pre2");
			return num % 2 != 0;
		};

		Predicate<Integer> pre3 = (num) -> {
			System.out.println("pre3");
			return num >= 25 && num <= 50;
		};

		// checking whether the number is even AND between 25 and 50
		Boolean b = pre1.and(pre3).test(28);
		System.out.println(b);

		b = pre1.and(pre3).test(19);// if 1st condition gets false then it will not checks 2nd condition. directly
									// gives false. so prints only pre1
		System.out.println(b);

		b = pre1.and(pre3).test(34);
		System.out.println(b);
		
		b = pre1.and(pre3).test(14);
		System.out.println(b);
		System.out.println("------");

		// checking whether the number is Odd AND between 25 and 50
		b = pre2.and(pre3).test(29);
		System.out.println(b);

		b = pre2.and(pre3).test(18);
		System.out.println(b);
		System.out.println("------");

		// checking whether the number is even OR between 25 and 50
		b = pre1.or(pre3).test(18); // it checks only one condition from both. if any one of them gets true it gives true.
		System.out.println(b);

		b = pre1.or(pre3).test(16);
		System.out.println(b);
		
		b = pre1.or(pre3).test(51); 
		System.out.println(b);
		System.out.println("------");
		
		b = pre2.or(pre3).test(29);
		System.out.println(b);

		b = pre2.or(pre3).test(18);
		System.out.println(b);
		System.out.println("------");

	}
}
