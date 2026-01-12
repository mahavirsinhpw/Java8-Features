package com.optionalclass;

import java.util.Optional;

public class OptionalClassDemo2 {
	public static void main(String[] args) {
		
//		Optional<String> op = Optional.of(null);
		Optional<String> op = Optional.of("mahavir");
		System.out.println(op);
		System.out.println(op.orElse("dp"));
		
		String st = "hello";
//		String st1 = null;
		Optional<String> op1 = Optional.of(st);
//		Optional<String> op1 = Optional.of(st1);
		System.out.println(op1.orElse("pavan"));
		
//		Optional<String> opt = Optional.of(null);
//		System.out.println(opt);
		
		String str = "hello";
//		Optional<String> op2 = Optional.ofNullable(str);
		Optional<String> op2 = Optional.ofNullable(null);
		System.out.println(op2.orElse("pavan"));
		
		
	}
}
