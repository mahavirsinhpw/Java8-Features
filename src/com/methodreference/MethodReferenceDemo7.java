package com.methodreference;

import java.util.ArrayList;
import java.util.List;

class MyNumber{
	
	public static Boolean isEven(int x) {
		if(x%2 == 0)
			return true;
		else
			return false;
	}
	
	public static Boolean isOdd(int x) {
		if(x%2 != 0)
			return true;
		else 
			return false;
	}
}

public class MethodReferenceDemo7 {
public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(20);
	list.add(55);
	list.add(27);
	list.add(6);
	
	list.stream().filter(MyNumber::isEven).forEach(System.out::println);
	System.out.println("****\n");
	list.stream().filter(MyNumber::isOdd).forEach(System.out::println);
	System.out.println("****\n");
	list.stream().filter((n)->n%2==0).forEach((n)->System.out.println(n));
	System.out.println("****\n");
	list.stream().filter((n)->n%2!=0).forEach((n)->System.out.println(n));
	
	
}
}
