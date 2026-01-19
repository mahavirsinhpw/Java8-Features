package com.functionalinterface;

import java.util.function.Function;

public class FunctionInterfaceDemo1 {
	public static void main(String[] args) {
		
		Function<Integer, Integer> fun1 = (num)-> {
			System.out.println("multiply by 2");
			return num*2;
		};
		
		Function<Integer, Integer> fun2 = (num)-> {
			System.out.println("multiply by 3");
			return num*3;
		};
		
		System.out.println(fun1.apply(5));
		System.out.println(fun2.apply(5));
		
		int result1 = fun1.andThen(fun2).apply(10);   // first multiply with 2 and then multiply with 3
		System.out.println(result1);
//		fun1.apply(10) => 10 *2 = 20
//		fun2.apply(20) => 20 *3 = 60
		
		int result2 = fun1.compose(fun2).apply(5); // before multiply 2 it multiply with 3
		System.out.println(result2);
//		fun2.apply(20) => 5 *3 = 15
//		fun1.apply(15) => 15 *2 = 30
		
		
	}
}
