package com.optionalclass;

import java.util.Optional;

public class OptionalClassDemo12 {
	public static void main(String[] args) {

//		Optional.ofNullable() with value

		String st = "Hello";
		Optional<String> op = Optional.ofNullable(st);
		System.out.println("1. " + op);
		System.out.println("2. " + op.orElse("mahavir"));
		System.out.println("3. " + op);
		System.out.println("4. " + op.isPresent());
		System.out.println("5. " + op.get());

		if (op.isPresent()) {
			System.out.println("5. " + op.get());
		} else {
			System.out.println("6. No value found");
		}
	}
}
