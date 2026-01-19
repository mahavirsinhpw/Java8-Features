package com.functionalinterface;

import java.util.function.Predicate;

public class PredicateInterfaceDemo3 {
	public static void main(String[] args) {
		
		Predicate<String> pre1 = Predicate.isEqual("Hello Guys");
		Boolean b = pre1.test("Hi Guys");
		System.out.println(b);
		b = pre1.test("Hello Guys");
		System.out.println(b);
		System.out.println("-------");
		
		Predicate<Integer> pre2 = Predicate.isEqual(99);
		b = pre2.test(99);
		System.out.println(b);
		b = pre2.test(88);
		System.out.println(b);
		System.out.println("-------");
		
		Predicate<Integer> pre3 = (num)->num%2 ==0;
		Predicate<Integer> pre4 = (num)->num%2 !=0;
		
		b = pre3.test(28);
		System.out.println(b);
		b = pre3.negate().test(28); // reverse the result
		System.out.println(b);
	
		
		b = pre4.test(19);
		System.out.println(b);
		b = pre4.negate().test(19); // reverse the result
		System.out.println(b);
		System.out.println("-------");
		
		
		
		
		
	}
}
