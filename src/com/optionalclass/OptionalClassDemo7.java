package com.optionalclass;

import java.util.Optional;
import java.util.function.Function;

public class OptionalClassDemo7 {
	public static void main(String[] args) {
		
		Optional<String> op = Optional.ofNullable("Mahavir");
		System.out.println(op);
		
		Function fn = input -> input;
		fn.apply("hi");
		
		
		System.out.println(op.map(input -> input));
		System.out.println(fn.apply("hi"));
		System.out.println("********\n");
		Optional<Optional<String>> opt = Optional.of(Optional.ofNullable("Mahavir"));
		System.out.println(opt);
		System.out.println(opt.map(input -> input));
		System.out.println(opt.flatMap(n->n));
		
		Optional<Optional<String>> os=  opt.map(m->m.map(i->i.toUpperCase()));
		System.out.println(os);
		
		
	}
}
