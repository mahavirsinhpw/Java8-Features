package com.methodreference.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Hii{
	public static void show(int x) {
		System.out.println(x);
	}
}

public class MethodReferenceDemo7 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(40);
		
		Stream<Integer> st = list.stream();
		st.forEach(Hii::show);
		
		System.out.println("------------------");
		
		list.stream().forEach(Hii::show);
		
		System.out.println("----------");
		
		list.stream().forEach(System.out::println);
		System.out.println("----------");
		
		list.stream().forEach(n->System.out.println(n));
	}

}
