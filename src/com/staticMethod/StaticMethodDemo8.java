package com.staticMethod;

interface P {
	static void m1() {
		System.out.println("p=m1");
		m2();
	}
	
	static void m2() {
		System.out.println("P=m2");
	}
}

class O implements P{
	
}

public class StaticMethodDemo8 {

	public static void main(String[] args) {
		P.m1();

	}

}
