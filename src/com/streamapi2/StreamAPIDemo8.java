package com.streamapi2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo8 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println(list);
		
		System.out.println("------------");
		
		list.stream().forEach(System.out::println);
		System.out.println("-----------");
		
		list.parallelStream().forEach(System.out::println); // order is not guaranteed
		
		
		
		
		
	}
}
