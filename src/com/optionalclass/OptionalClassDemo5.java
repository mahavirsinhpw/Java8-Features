package com.optionalclass;

import java.util.Optional;

public class OptionalClassDemo5 {
	public static void main(String[] args) {
		
		// filter() method
		
		
		Optional<String> op = Optional.ofNullable("Hello");
//		Optional<String> op = Optional.ofNullable(null);
		Optional op2 = op.filter(input->input.contains("ll")); // returns optional object(with value)
//		Optional op2 = op.filter(input->input.contains("ko")); // returns empty optional object
		System.out.println(op2);
		
		
		
	}
}
