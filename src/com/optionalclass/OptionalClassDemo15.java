package com.optionalclass;

import java.util.Optional;

public class OptionalClassDemo15 {
	public static void main(String[] args) {
		// map()
		
		String st = "mahavir sinh";
//		String st = null;
		Optional<String> op = Optional.ofNullable(st);
		System.out.println("1. "+op);
		
		Optional<String> ops = op.map(n -> n);
		System.out.println("2. "+ops);
		
		Optional<String> ops2 = op.map(n->n.toUpperCase());
		System.out.println("3. "+ops2);
		
		Optional<String> ops3 = ops2.map(n-> new StringBuilder(n).reverse().toString());
		System.out.println("4. "+ops3);
		
		
		String str = null;
		Optional<String> opt = Optional.ofNullable(str);
		System.out.println("5. "+opt);
		Optional<String> opt2 = opt.map(n->n.toUpperCase());
		System.out.println("6. "+opt2);
	}
}
