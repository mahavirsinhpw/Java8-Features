package com.streamapi2;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo14 {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(7, 5, 6, 9, 1, 2, 3, 4, 5, 13, 11, 15, 6, 7, 8, 9, 10, 11, 12, 13);

		System.out.println("--------");

		list.stream()
		.limit(15)
		.filter(num -> num % 2 != 0)
		.map(num -> num * num)
		.sorted()
		.forEach(System.out::println);

		System.out.println("--------");

		list.stream()
		.limit(15)
		.distinct()
		.filter(num -> num % 2 != 0)
		.map(num -> num * num)
		.sorted()
		.forEach(System.out::println);
		
		
		

	}
}
