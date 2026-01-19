package com.functionalinterface;

import java.util.function.Function;

public class FunctionInterfaceDemo {
	public static void main(String[] args) {
		Function<String, String> fun1 = (input) -> input.toUpperCase();
		String op1 = fun1.apply("Mahavir");
		System.out.println(op1);
		
		Function<String, Integer> fun2 = (ip2)-> Integer.parseInt(ip2);
		Integer op2 = fun2.apply("99");
		System.out.println(op2);
		
		Function<Integer, String> fun3 = (ip3)->String.valueOf(ip3);
		String op3 = fun3.apply(99);
		System.out.println(op3);
		
		Function<String, String> fun4 = (ip4) -> ip4;
		String op4 = fun4.apply("Hello");
		System.out.println(op4);
		
		Function<String, String> fun5 = Function.identity(); // returns the same object as input
		String op5 = fun5.apply("hello guys");
		System.out.println(op5);
		
		
	}
}
