package com.streamapi;

import java.util.Arrays;
import java.util.List;

class Hello {

	public static int m1(int s) {
		return s % 5;
	}
}

public class StreamAPIDemo3 {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);

		list.stream().map(Hello::m1).forEach(n -> System.out.println(n));
	}
}
