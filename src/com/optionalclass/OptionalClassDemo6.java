package com.optionalclass;

import java.util.Optional;

public class OptionalClassDemo6 {

	public static void main(String[] args) {
		
		// map() method of Optional class
		
		String st = "Mahavirsinh";
		Optional<String> op = Optional.ofNullable(st);
		Optional op1 = op.map(n->n); // takes Function interface as input and returns optional object of type of input
		System.out.println(op1);
		
//		Optional<String> op = Optional.ofNullable(null);
//		Optional op1 = op.map(n->n); // takes Function interface as input and returns empty optional object 
//		System.out.println(op1);
		
		String st1 = "Mahavirsinh";
		Optional<String> op3 = Optional.ofNullable(st1);
		Optional op4 = op.map((n)-> {return n.concat(" Parmar");}); // takes Function interface as input and returns optional object of type of input
//		Optional op4 = op.map(n->n);
		Optional op5 = op.map(n->n.concat(" Parmar"));
		System.out.println(op4);
		System.out.println(op5);
		
		Integer it = 12;
		Optional<Integer> opi  = Optional.ofNullable(it);
		Optional opi1 = opi.map(n -> { return n*n;}); // takes Function interface as input and returns optional object of type of input
//		Optional opi2 = op.map(n->n);
		Optional opi2 = opi.map(n->n*n);
		System.out.println(opi1);
		System.out.println(opi2);
		
	}

}
