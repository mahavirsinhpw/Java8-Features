package com.streamapi2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo15 {
	public static void main(String[] args) {
		
		System.out.println("-------");
		Stream<Integer> st = Stream.empty();
		st.forEach((n)->System.out.println(n));
		
		Stream<String> st2 = Stream.empty();
		st2.forEach((n)->System.out.println(n));
		
		System.out.println("-------");
		Stream<Integer> st3 = Stream.of(11,12,13);
		st3.forEach((n)->System.out.println(n));
		
		List<Integer> numList = Arrays.asList(11,12,13,14,15);
		
		System.out.println("----------");
		Stream<Integer> st4 = numList.stream();
		st4.forEach((n)->System.out.println(n));
		
		System.out.println("----------");
		Stream<Integer> st5 = numList.parallelStream(); // order is not guaranteed
		st5.forEach((n)->System.out.println(n));
		
		
		
		
	}
}
