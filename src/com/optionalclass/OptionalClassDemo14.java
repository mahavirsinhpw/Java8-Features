package com.optionalclass;

import java.util.Optional;

public class OptionalClassDemo14 {
	public static void main(String[] args) {
		
		// filter()
		
		Optional<String> op = Optional.ofNullable(null);
		Optional<String> op1 = op.filter(n->n.contains("som"));
		System.out.println("1. "+op1);
		
		Optional<String> op2 = Optional.ofNullable("Hello");
		Optional<String> op3 = op2.filter(n->n.contains("lo"));
		System.out.println("2. "+op3);
		
		Optional<String> op4 = Optional.ofNullable("Hello Guys");
		Optional<String> op5 = op4.filter(n->n.contains("som"));
		System.out.println("3. "+op5);
		
		
	}
}
