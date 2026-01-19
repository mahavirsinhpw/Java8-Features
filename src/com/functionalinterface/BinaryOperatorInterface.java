package com.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> bifun1 = (in1, in2)-> in1*in2;
//		Integer op = bifun1.apply(10, 20);
//		System.out.println(op);
		System.out.println(bifun1.apply(10, 20));
		
		BinaryOperator<Integer> bop = (in1, in2)-> in1 * in2;
//		Integer iop = bop.apply(10, 20);
//		System.out.println(iop);
		System.out.println(bop.apply(10, 20));
		
		BiFunction<String, String, String> bifun2 = (in1, in2)-> in1 + in2;
		System.out.println(bifun2.apply("hello", "guys"));
		
		BinaryOperator<String> bop2 = (in1, in2)->in1+in2;
		System.out.println(bop2.apply("hello", "guys"));
		
		
		
		
	}
}
