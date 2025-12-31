package com.staticMethod;

interface Inter1{
	
	static void m1() {
		System.out.println("static m1 in Inter1 ");
	}
	
	static void m2() {
		System.out.println("static m2 in Inter1 ");
	}
	
	
}


class Test implements Inter1{
	
	static void m1() {       // you can not override. if do that then will be treated as method hiding/new method.
		System.out.println("static m1 in Test"); 
	}
	
}

public class StaticMethodDemo2 {

	public static void main(String[] args) {
		
		Test.m1();
		//Test.m2();
		Inter1.m2();
		Inter1.m1();
		
		
	}

}
