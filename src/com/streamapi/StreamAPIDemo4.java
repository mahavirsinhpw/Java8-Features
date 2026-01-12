package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo4 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
		list.stream().forEach(System.out::println);

		System.out.println("*****\n");
		list.parallelStream().forEach(System.out::println);
	}
}
