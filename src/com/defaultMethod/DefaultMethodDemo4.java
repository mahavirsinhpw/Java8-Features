package com.defaultMethod;

interface I11{
	default void m1() {
		System.out.println("m1 in I11");
	}
}

interface I22 extends I11{
	default void m2() {
		System.out.println("m2 in I22");
		m1();
	}
	
	default void m1() {
		System.out.println("m1 in I22");
	}
}

class C1 implements I22{
	
}

public class DefaultMethodDemo4 {
	
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.m1();
		c1.m2();
	}
	
}
