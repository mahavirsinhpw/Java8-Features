package com.streamapi2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamAPIDemo25 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Long count = list.stream()
		.filter(num->num%2 ==0)
		.collect(Collectors.counting());
		
		System.out.println(count);
		
		System.out.println("---------------");
		int mulResult = list.stream()
		.filter(num->num%2 ==0)
		.collect(Collectors.reducing(0, (n1,n2)->n1*n2));
		
		System.out.println(mulResult);
		
		List<String> courses = Arrays.asList("java","springboot","Devops");
		String result = courses.stream()
		.collect(Collectors.joining(" --- "));
		System.out.println(result);
		
		
		
	}
}
