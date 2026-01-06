package com.methodreference.p2;

interface Hello{
	void test(String str);
}



public class MethodReferenceDemo2 {
public static void main(String[] args) {

	Hello h = (st)->{
		System.out.println("hello "+st);
	};
	h.test("dosto");
	
	
	Hello h2 = System.out::println;
	h2.test("guys good morning");
}
}
