package com.streamapi2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo6 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println(list);
		
		System.out.println("------------");
		
		Stream<Integer> strm = list.stream();
		Stream<Integer> odd = strm.filter(n->n%2 !=0);
		Stream<Integer> sqOfOdd = odd.map( n-> n*n);
		sqOfOdd.forEach(System.out::println);
		
		System.out.println("------------");
		
		list.stream().filter(n->n%2 !=0).map(n->n*n).forEach(n->System.out.println(n));
		
		System.out.println("------------");
		
		// stream does not change or modify the original list/data. it just pass the data in from one source to another
		System.out.println(list); // no change in original list.
		
		
	}
}
