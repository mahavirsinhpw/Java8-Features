package com.optionalclass;

import java.lang.Thread.Builder.OfPlatform;
import java.util.Optional;

public class OptionalClassDemo16 {
	public static void main(String[] args) {
		String st = "Mahavir sinh";
		Optional<Optional<String>> op1 =  Optional.of(Optional.ofNullable(st));
		System.out.println("1. "+op1);
		System.out.println("1. "+op1.map(n->n));
		System.out.println("1. "+op1.flatMap(n->n));
		
		System.out.println("---------------");
		
		Optional<Optional<String>> op2= op1.map(input -> input.map(input2 -> input2.toUpperCase()));
		System.out.println("op2 "+op2);
		
		Optional<String> op3= op1.flatMap(input -> input.map(input2 -> input2.toUpperCase()));
		System.out.println("op3 "+op3);
		System.out.println("----------");
		
		String str = "jtc";
		Optional<Optional<Optional<String>>> op4 = Optional.of(Optional.of(Optional.ofNullable(str)));
		
		Optional<Optional<Optional<String>>> op5 = op4.map(input -> input);
		Optional<String> op6 = op4.flatMap(in->in.flatMap(input -> input));
		Optional<Optional<String>> op7 = op4.flatMap(in->in.map(input->input));
		System.out.println("op5 "+op5);
		System.out.println("op6 "+op6);
		System.out.println("op7 "+op7);
		
		
	}
}
