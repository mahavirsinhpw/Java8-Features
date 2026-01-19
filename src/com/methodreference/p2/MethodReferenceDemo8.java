package com.methodreference.p2;

import java.util.ArrayList;
import java.util.List;

class MyNumber{
	public static boolean isEven(int x) {
		if(x%2==0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int x) {
		if(x%2 !=0)
			return true;
		else
			return false;
	}
}

public class MethodReferenceDemo8 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(33);
		list.add(44);
		list.add(35);
		
		list.stream().filter(MyNumber::isEven).forEach(System.out::println);
		System.out.println("----------");
		list.stream().filter(MyNumber::isOdd).forEach(System.out::println);
		System.out.println("----------");
		list.stream().filter(n->n%2 ==0).forEach(s->System.out.println(s));
		System.out.println("----------");
		list.stream().filter(n->n%2 !=0).forEach(s->System.out.println(s));
		
		
		
		
	}

}
