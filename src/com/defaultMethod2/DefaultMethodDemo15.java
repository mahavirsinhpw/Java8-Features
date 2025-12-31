package com.defaultMethod2;

interface In1 {
	default void m1() {
		System.out.println("m1 in In1");
	}
}

interface In2 extends In1 {

	// If a child interface overrides a default method, the parent’s default method
	// is NOT inherited automatically.
	// Therefore, In1’s m1() is hidden, not removed
//	public void m1() {
//		
//	}

	default void m1() {
		System.out.println("m1 in In2");
		In1.super.m1();
	}

	default void m2() {
		System.out.println("m2 in In2");
	}

	default void m3() {
		System.out.println("m3 in In2");
		m2();
	}
}

class Hi implements In2 {

}

public class DefaultMethodDemo15 {

	public static void main(String[] args) {
		Hi hi = new Hi();
		hi.m1();
		hi.m2();
		In1 i = new Hi();
		i.m1();

	}

}
