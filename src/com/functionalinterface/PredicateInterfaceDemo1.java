package com.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceDemo1 {
	public static void main(String[] args) {
		Predicate<Integer> pre1 = (num)->{
			System.out.println(num);
			return num %2 == 0;
		};
		
		Predicate<Integer> pre2 = (num)-> num%2 !=0;
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);
		list.add(26);
		
		System.out.println(list);
		list.removeIf(pre1);
		System.out.println(list);
		
		System.out.println("-------------");
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(20);
		list2.add(21);
		list2.add(22);
		list2.add(23);
		list2.add(24);
		list2.add(25);
		list2.add(26);
		
		System.out.println(list2);
		list2.removeIf(pre2);
		System.out.println(list2);
		
	}
}
