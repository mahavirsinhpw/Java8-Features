package com.functionalinterface;

import java.util.function.BiFunction;

public class BiFuncationInterface {
	public static void main(String[] args) {
		BiFunction<String, String, String> bifun1 = (in1, in2)-> in1+in2;
		String op1 =bifun1.apply("hello", "guys");
		System.out.println(op1);
//		System.out.println(bifun1.apply("hello", "guys"));
		
		BiFunction<Integer, Integer, Integer> bifun2 = (num1, num2)->num1*num2;
		System.out.println(bifun2.apply(10, 20));
		
		BiFunction<Integer, Integer, String> bifun3 =(num1, num2)->{
			int x= num1*num2;
			String st = "result is "+x;
			return st;
		};
		String s = bifun3.apply(10, 20);
		System.out.println(s);
		
		
		
	}
}
