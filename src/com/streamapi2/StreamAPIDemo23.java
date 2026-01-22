package com.streamapi2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPIDemo23 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,4,8,3,6,7,2,9);
		
		List<Integer> myList = list.stream()
		.filter(num->num%2 ==0)
		.map(num->num*num)
		.sorted()
		.collect(Collectors.toList());
		
		System.out.println(myList);
		
		System.out.println("---------------");
		List<Integer> myList2 = list.stream()
		.filter(num->num%2 ==0)
		.map(num->num*num)
		.sorted()
		.collect(Collectors.toCollection(LinkedList::new));
		
		System.out.println(myList2);
	}
}
