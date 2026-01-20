package com.optionalclass;

import java.util.Optional;

public class OptionalClassDemo13 {
	public static void main(String[] args) {
		// isPresent() vs ifPresent()

//		String st = null;
		String st1 = "hello";
//		Optional<String> op = Optional.ofNullable(st);
		Optional<String> op = Optional.ofNullable(st1);
		System.out.println(op);

		if (op.isPresent()) {
			System.out.println(op.get());
		}

		op.ifPresent((in) -> System.out.println(in));

		if (op.isPresent()) {
			System.out.println(op.get().toUpperCase());
		}
		;

		op.ifPresent((in) -> System.out.println(in.toUpperCase()));

	}
}
