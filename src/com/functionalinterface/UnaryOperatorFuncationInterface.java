package com.functionalinterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorFuncationInterface {
	public static void main(String[] args) {
		Function<String, String> fun1 = (input)->input.toUpperCase();
		System.out.println(fun1.apply("hello"));
		
		UnaryOperator<String> uo = (input)->input.toUpperCase(); // sub type of Function functional interface. which takes only one type for both parameters
		System.out.println(uo.apply("hello"));
		
		Function<Integer, Integer> fun2 = num->num*2;
		System.out.println(fun2.apply(50));
		
		UnaryOperator<Integer> uo2 = num ->num*2;
		System.out.println(uo2.apply(50));
		
	}
}
