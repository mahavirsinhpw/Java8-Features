package com.optionalclass;

import java.util.Optional;

public class OptionalClassDemo4 {

	public static void main(String[] args) {
		// isPresent() and ifPresent() methods
		
//		Optional<String> op = Optional.ofNullable(null);
		Optional<String> op = Optional.ofNullable("Kem chho");
//		System.out.println(op.get());
		System.out.println();
		if (op.isPresent()) {
			System.out.println(op.get().toUpperCase());
		} else {
			System.out.println("value not present");
		}
		
//		Optional<String> op2 = Optional.ofNullable(null);
		Optional<String> op2 = Optional.ofNullable("How are you guys");
		op2.ifPresent(x->System.out.println(x.toUpperCase()));
		
		
		// Note : Prefer ifPresent() over isPresent() with get().
		// isPresent() : checks value is present or not
		// ifPresent() : executes only when value present
		
	}

}
