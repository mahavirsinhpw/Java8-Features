package com.optionalclass;

import java.util.Optional;

public class OptionalClassDemo1 {
	public static void main(String[] args) {
		
//		Optional op = new Optional();
		
		Optional<String> op = Optional.empty();
		System.out.println(op);
		
		Optional<String> op1 = Optional.empty();
		System.out.println(op1.toString());
		
		Optional<String> op2 = Optional.empty();
		System.out.println(op2.toString());
		System.out.println(op2.hashCode());
		System.out.println(op1.hashCode());
		
		Optional<String> op3 = Optional.empty();
		System.out.println(op3);
		System.out.println(op3.orElse("Jtc"));
		System.out.println(op3);
		System.out.println(op3.isEmpty());
//		System.out.println(op3.get());
		if (op3.isPresent()) {
			System.out.println(op3.get());
		}else {
			System.out.println("value not present");
		}
		
	}
}
