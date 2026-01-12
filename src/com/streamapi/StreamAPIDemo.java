package com.streamapi;

import java.util.ArrayList;
import java.util.List;

class MyNumber {

	public static Boolean isEven(int x) {
		if (x % 2 == 0)
			return true;
		else
			return false;
	}
}

public class StreamAPIDemo {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(20);
		list.add(55);
		list.add(27);
		list.add(6);

		list.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println);
	}
}
