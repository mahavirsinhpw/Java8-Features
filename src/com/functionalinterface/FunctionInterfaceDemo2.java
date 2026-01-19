package com.functionalinterface;

import java.util.function.Function;

public class FunctionInterfaceDemo2 {
	public static void main(String[] args) {
		Function<String, Integer> fun1 = (ip1)->{
			System.out.println("converting string into int");
			return Integer.parseInt(ip1);
		};
		Integer op1 = fun1.apply("10");
		System.out.println(op1);
		
		Function<Integer, Integer> fun2 = (num)->{
			System.out.println("add 10 to that "+num);
			return num+10;
		};
		Integer op2 = fun2.apply(20);
		System.out.println(op2);
		
		int result1 = fun1.andThen(fun2).apply("10");
		System.out.println(result1);
		
		int result2 = fun2.compose(fun1).apply("10");
		System.out.println(result2);
		
//		int result3 = fun1.compose(fun2).apply(10);
//		System.out.println(result3);
		
		
		
	}
}
