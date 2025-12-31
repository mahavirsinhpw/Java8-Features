package com.defaultMethod2;

interface AA{
	
	default void m1() {
		System.out.println("AA-m1");
	}
	
	default void m2() {
		System.out.println("AA-m2");
		m1();
	}
	
//	static void m3() {
//		m1();
//	}
	
	// we can not write default to Object class's methods
//	@Override
//	default boolean equals(Object obj);
}

class Hello implements AA{
	
}

public class DefaultMethodDemo14 {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.m1();
		h.m2();
	}
}
