package com.streamapi2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo7 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		
		
		System.out.println("------------");
		
		Stream<Integer> strm = list.stream();
		strm.forEach(System.out::println);
		//strm.forEach(System.out::println); // java.lang.IllegalStateException: stream has already been operated upon or closed
		
		System.out.println("------------");
		
		Stream<Integer> strm2 = list.stream();
		strm2.forEach(System.out::println);
		
		System.out.println("-------------");
		Stream<Integer> strm3 = list.stream();
		strm3.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
	}
}
