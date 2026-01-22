package com.streamapi2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPIDemo21 {
	public static void main(String[] args) {
		
//		max() , min(), count()
		
		List<Integer> list = Arrays.asList(2,3,6,4,5,7,9,8,5);
		list.stream()
		.filter(num->num%2 !=0)
		.map(num->num*num)
		.forEach(System.out::println);
		
		long count = list.stream()
		.filter(num->num%2 !=0)
		.map(num->num*num)
		.count(); // terminal operation
//		.forEach(System.out::println); // two terminal operation not allowed 
		System.out.println(count);
		
		System.out.println("---------");
		
		Optional<Integer> max = list.stream()
				.filter(num->num%2 !=0)
				.map(num->num*num)
				.max((num1, num2)->num1.compareTo(num2));
		System.out.println(max);
		max.ifPresent(System.out::println);
		
		System.out.println("---------");
		
		Optional<Integer> min = list.stream()
				.filter(num->num%2 !=0)
				.map(num->num*num)
				.min((num1, num2)->num1.compareTo(num2));
		System.out.println(min);
		min.ifPresent(System.out::println);
		
		
		
		
		
		
				
		
	}
}
