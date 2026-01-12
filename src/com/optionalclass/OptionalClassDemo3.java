package com.optionalclass;

import java.util.Optional;

public class OptionalClassDemo3 {
	public static void main(String[] args) {
		// ofNullable Method
		
		Optional<String> op = Optional.ofNullable(null);
		System.out.println(op); // if present then gives value, if not present then gives empty object
		
		System.out.println(op.orElse("hello mahavirsinh"));
		
		System.out.println(op); // no modification in existing object
		
		System.out.println(op.isPresent());
		
		System.out.println(op.isEmpty());
		
//		System.out.println(op.get()); // do not use until you 100% sure that value is present
		
		Optional<String> op2 = Optional.ofNullable("Power");
		System.out.println(op2.get());
	}
}
