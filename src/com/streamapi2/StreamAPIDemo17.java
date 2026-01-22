package com.streamapi2;

import java.util.stream.Stream;

public class StreamAPIDemo17 {
	public static void main(String[] args) {

		Stream.iterate(11, n -> n + 1)
		.limit(10)
		.forEach(System.out::println);

		System.out.println("----------");
		Stream.iterate(21, n -> n % 2 != 0, n -> n + 1)
		.limit(5)
		.forEach(System.out::println);

		System.out.println("-----------");
		Stream.iterate(11, n -> n + 1)
		.limit(10).filter(num -> num % 2 == 0)
		.forEach(System.out::println);

		System.out.println("-----------");
		Stream.iterate(11, n -> n + 1)
		.limit(10)
		.filter(num -> num % 2 != 0)
		.forEach(System.out::println);

	}
}
