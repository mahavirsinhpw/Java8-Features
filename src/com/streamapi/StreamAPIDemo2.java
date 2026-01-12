package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo2 {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
		Stream<Integer> even = list.stream().filter(n -> n % 2 == 0);
		Stream<Integer> sqOfEven = even.map(n -> n * n);
		sqOfEven.forEach(n -> System.out.println(n));

		System.out.println("*******\n");
		list.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(n -> System.out.println(n));

	}
}
