package com.streamapi2;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo12 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
		
		list.stream()
		.skip(3)
		.limit(5)
		.peek(System.out::println)
		.filter(n->n%2 !=0)
		.peek(System.out::println)
		.map(n->n*n)
		.forEach((n)->System.out.println(n));
		
	}
}
