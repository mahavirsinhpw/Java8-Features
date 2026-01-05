package com.staticmethod2;


public interface StaticMethodDemo6 {

	static void m1() {
		System.out.println("m1");
//		m2();
	}
	
	default void m2() {
		System.out.println("m2");
		m1();	}
	
	
	public static void main(String[] args) {
	System.out.println("main");
	m1();
//	m2();
	}

}
