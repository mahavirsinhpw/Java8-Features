package com.staticMethod;

interface Inte1 {

	 // can not be protected
//	protected static void m1() { 
//		System.out.println("static m1 in Inter1 ");
//	}

	public static void m1() {
		System.out.println("static m1 in Inter1 ");
	}

	static void m2() {
		System.out.println("static m2 in Inter1 ");
	}

}

class Testy implements Inte1 {

	static void m1() { // you can not override. if do that then will be treated as method hiding/new
						// method.
		System.out.println("static m1 in Test");
	}

}

public class StaticMethodDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testy.m1();
		// Test.m2();
		Inte1.m2();
		Inte1.m1();
	}

}
