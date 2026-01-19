package com.functionalinterface;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {
	public static void main(String[] args) {
		Predicate<Integer> pre = (num)->{
			System.out.println(num);
			return num%2 ==0;
		};
		Boolean b = pre.test(10);
		System.out.println(b);
		
		 b = pre.test(27);
		System.out.println(b);
		
		Predicate<Integer> pred = (num)->num%2 != 0;
		b= pred.test(10);
		System.out.println(b);
		b= pred.test(27);
		System.out.println(b);
		
		
	}
}
