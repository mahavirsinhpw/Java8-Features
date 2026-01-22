package com.streamapi2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamAPIDemo24 {
public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,4,8,3,6,7,2,9,4,2,6,10);
		
		Set<Integer> myList = list.stream()
		.filter(num->num%2 ==0)
		.map(num->num*num)
		.sorted()
		.collect(Collectors.toSet());
		
		System.out.println(myList);
		
		System.out.println("---------------");
		Set<Integer> myList2 = list.stream()
		.filter(num->num%2 ==0)
		.map(num->num*num)
		.sorted()
		.collect(Collectors.toCollection(TreeSet::new));
		
		System.out.println(myList2);
	}
}
