package com.staticMethod;

interface I1 {
	
	public static void show() {
		System.out.println("show in I1");
	}
	
	public static void draw() {
		System.out.println("draw in I1");
	}
	
	static void m1() {
		System.out.println("m1 in I1");
	}
	
//	abstract static void m2();
	
//	default static void m2(); { }
	
//	final static void m2() {
//		
//	}
	
	
	
	
}

class Hello implements I1{
	
	static void m1() {
		System.out.println("m1 in Hello");
	}
	
}

public class StaticMethodDemo {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		I1.draw();
		I1.show();
		I1.m1();
		h1.m1();
	}
	
}
