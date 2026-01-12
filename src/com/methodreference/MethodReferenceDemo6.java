package com.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class TestWithMR{
	public static void test(int x) {
		System.out.println(x);
	}
}

public class MethodReferenceDemo6 {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(60);
	list.add(40);
	list.add(70);
	list.add(10);
	list.add(660);
	list.add(400);
	list.add(10);
	list.add(200);
	
	// 1. static Method ref with stream
	Stream<Integer> myStream = list.stream();
	myStream.forEach(TestWithMR::test);
	
	System.out.println("********\n");
	
	// 2. static Method ref with stream in one line
	list.stream().forEach(TestWithMR::test);
	
	System.out.println("********\n");
	// 3. instance method ref with stream 
	list.stream().forEach(System.out::println);
	
	System.out.println("********\n");
	// 4. Lambda with stream 
	list.stream().forEach((x)->System.out.println(x));
	
}
}
