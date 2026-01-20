package com.optionalclass;

import java.util.Optional;

public class OptionalClassDemo17 {
	public static void main(String[] args) {
		String st = "Jtc";
		Optional<Optional<Optional<String>>> op1 =  Optional.of(Optional.of(Optional.ofNullable(st)));
		System.out.println("1. "+op1);
		
		
		System.out.println("---------------");
		
		Optional<Optional<Optional<String>>> op2= op1.map(input -> input.map(input2->input2.map(input3 -> input3.toUpperCase())));
		System.out.println("op2 "+op2);
		
		Optional<Optional<String>> op3= op1.flatMap(input1 -> input1.map(input2->input2.map(input3 -> input3.toUpperCase())));
		System.out.println("op3 "+op3);
		
		Optional<String> op4= op1.flatMap(input1 -> input1.flatMap(input2->input2.map(input3 -> input3.toUpperCase())));
		System.out.println("op4 "+op4);
		System.out.println("----------");
		
		
		
	
	}
}
