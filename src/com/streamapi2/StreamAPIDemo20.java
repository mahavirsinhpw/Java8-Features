package com.streamapi2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPIDemo20 {
	public static void main(String[] args) {
		
		// reduce() method
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Integer num =  list.stream().reduce(0, (a,b)->a+b);
		System.out.println(num);
		
		Optional<Integer> num2 = list.stream().reduce((a,b)-> a+b);
		System.out.println(num2);
		
		System.out.println("---------------");
		Integer num3 =  list.stream().reduce(0, Integer::sum);
		System.out.println(num3);
		
		System.out.println("---------------");
		Integer num4 =  list.stream().reduce(1, (a,b)->a*b);
		System.out.println(num4);
		
		System.out.println("---------------");
		Integer lastElement =  list.stream().reduce((a,b)->b).orElse(-1);
		System.out.println(lastElement);
	}
}
