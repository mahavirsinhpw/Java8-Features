package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo5 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		list.stream().filter(n -> n % 2 != 0).map(n -> n * n).forEach(System.out::println);

		System.out.println("*****\n");
		System.out.println(list);
		System.out.println("*****\n");

		list.stream().skip(10).limit(5).forEach(System.out::println);
		System.out.println("*****\n");
		list.stream().skip(9).filter(n -> n % 2 == 0).map(n -> n * n).map(n -> n / 10).forEach(System.out::println);
		System.out.println("*****\n");
		list.stream().skip(3).limit(5).peek(System.out::println).forEach(System.out::println);

		System.out.println("*****\n");

		List<Integer> list2 = Arrays.asList(1, 2, 3, 5, 4, 5, 5, 6, 7, 8, 8, 13, 9, 10, 10, 11, 12, 13, 14, 14, 15, 15,
				16, 12, 17, 18, 19, 20);

		list2.stream().skip(2).limit(10).distinct().filter(n -> n % 2 != 0).map(n -> n * n).sorted()
				.forEach(n -> System.out.println(n));

	}
}
