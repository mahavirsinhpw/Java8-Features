package com.streamapi2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo16 {
	public static void main(String[] args) {
		
		Stream<Integer> stream1 = Stream.of(11,12,13);
		
		List<Integer> list = Arrays.asList(21,22,23);
		Stream<Integer> stream2 = list.stream();
		
		Stream<Integer> stream3 = Stream.concat(stream1, stream2);
		stream3.forEach(System.out::println);
		
	}
}
