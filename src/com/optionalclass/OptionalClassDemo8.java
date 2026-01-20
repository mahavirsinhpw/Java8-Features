package com.optionalclass;

import java.util.Optional;

public class OptionalClassDemo8 {
	public static void main(String[] args) {

//		Optional<String> op = new Optional<String>();

		Optional<String> op1 = Optional.empty();
		System.out.println("1 " + op1);
		System.out.println("2 " + op1.orElse("hello guys"));
		System.out.println("3 " + op1);
		System.out.println("4 " + op1.isPresent());
//		System.out.println("5 "+op1.get());

		if (op1.isPresent()) {
			System.out.println("5 " + op1.get());
		} else {
			System.out.println("6 no value found");
		}

	}
}
