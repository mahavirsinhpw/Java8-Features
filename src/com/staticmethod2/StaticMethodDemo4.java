package com.staticmethod2;

interface A{
	int p = 101;
	public static final int q = 102;
	
	
	void m1();
	public abstract void m2();
	
	default void m3() {
		System.out.println("m3");
	}
	
	default void m4() {
		System.out.println("m4");
	}
	
	static void m5() {
		System.out.println("m5");
	}
	
	static void m6() {
		System.out.println("m6");
	}
	
}

class Helloo implements A{
	public void test() {
		System.out.println(p);
		System.out.println(q);
		m1();
		m2();
		m3();
		A.super.m3();
		m4();
		m5();
		A.m5();
		A.m6();
//		m6();
		
		
		
		
	}

	@Override
	public void m1() {
		System.out.println("m1 in Helloo");
	}

	@Override
	public void m2() {
		System.out.println("m2 in helloo");
	}
	
	public void m3() {
		System.out.println("m3 in helloo");
	}
	
	public static void m5() {
		System.out.println("m5 in hellooo");
	}
	
	
}

public class StaticMethodDemo4 {
	public static void main(String[] args) {
		Helloo h = new Helloo();
		h.test();
		
	}
}
