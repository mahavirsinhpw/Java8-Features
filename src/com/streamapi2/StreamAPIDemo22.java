package com.streamapi2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPIDemo22 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11,22,33,44,55,66,77,88,99);
		Optional<Integer> op = list.stream().findAny();
		op.ifPresent(System.out::println);
		System.out.println("--------------");
		Optional<Integer> op1 = list.stream().findFirst();
		op1.ifPresent(System.out::println);
		System.out.println("--------------");
		Optional<Integer> op2 = list.stream().parallel().findAny();
		op2.ifPresent(System.out::println);
		System.out.println("--------------");
		Optional<Integer> op3 = list.stream().parallel().findFirst();
		op3.ifPresent(System.out::println);		
	}
}
