package com.staticMethod;

interface A{
	int p =101;
	public final static int q = 102;
	
	void m1();
	public abstract void m2();
	
	default void m3() {
		System.out.println("A-m3");
	}
	
	default void m4(){
		System.out.println("A-m4");
	}
	
	static void m5() {
		System.out.println("A-m5");
	}
	
	static void m6() {
		System.out.println("A-m6");
	}
}

class Helloo implements A{
	
	public void test() {
		System.out.println(p);
		System.out.println(q);
		
		m1();
		m2();
		m3(); //overridden
		A.super.m3();
		m4(); //inherited
		A.super.m4();
		m5();
		A.m5(); //
		//m6();
		//A.super.m6();
		A.m6();
		
		
	}
	
	public void m1() {
		System.out.println("Helloo -m1");
	}
	
	public void m2() {
		System.out.println("Helloo-m2");
	}
	
	public void m3() {
		System.out.println("Helloo-m3");
	}
	
	public static void m5() {
		System.out.println("Helloo-m5");
	}
	
}

public class StaticMethodDemo4 {

	public static void main(String[] args) {
		Helloo h = new Helloo();
		h.test();
	}

}
