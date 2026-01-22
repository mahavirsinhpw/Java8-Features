package com.streamapi2;

import java.util.Random;
import java.util.stream.Stream;

public class StreamAPIDemo19 {
	public static void main(String[] args) {
		
		// generate() method
		
		Stream.generate(()-> new Random().nextInt(100)).limit(10).forEach(System.out::println);
		
		System.out.println("---------");
		
		Stream.generate(()-> {return new Random().nextInt(100);}).limit(10).forEach(System.out::println);
		
		System.out.println("---------");
		
		Stream.generate(()-> new Random().nextInt(100))
		.limit(10)
		.filter(num->num%2 !=0)
		.map(num->num*num)
		.forEach(System.out::println);
		
		System.out.println("---------");
		
		Stream.generate(()-> new Random().nextInt(100))
		.limit(10)
		.filter(num->num%2 ==0)
		.map(num->num*num)
		.forEach(System.out::println);
		
		
		
		
		
		
		
	}
}
