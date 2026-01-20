package com.optionalclass;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClassDemo18 {
	public static void main(String[] args) {

		String st = "mahavirsinh";
		Optional<String> op = Optional.ofNullable(st);
		System.out.println("1. " + op);
		System.out.println("2. " + op.orElse("Hello guys"));
		System.out.println("3. " + op.orElseGet(() -> "ok guys"));
		System.out.println("4. " + op.orElseThrow(NoSuchElementException::new));

		System.out.println("--------");
		String st2 = null;
		op = Optional.ofNullable(st2);
		System.out.println("1. " + op);
		System.out.println("2. " + op.orElse("Hello guys"));
		System.out.println("3. " + op.orElseGet(() -> "ok guys"));
		System.out.println("4. " + op.orElseThrow(NoSuchElementException::new));
		
		

	}
}
