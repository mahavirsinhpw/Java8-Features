package com.defaultMethod;

interface A {
	void m1();

	default void show() {
		System.out.println("show in A");
	}
}

interface B {
	void m2();

	default void show() {
		System.out.println("show in B");
	}
}

class C implements A, B {

	@Override
	public void m2() {
	}

	@Override
	public void m1() {
		A.super.show();
		// B.super.m2();
		B.super.show();
	}

	// A.super.show();
	void showAll() {
		A.super.show();
	}

	// you MUST override show() in class C —
	// because both interfaces A and B have a default method with the same
	// signature, which creates a diamond conflict.
	public void show() {
		System.out.println("show in C");

		A.super.show();
		B.super.show();
	}

}

public class DefaultMethodDemo6 {

	public static void main(String[] args) {
		C c = new C();
		c.m1();
		c.m2();
		c.showAll();
		c.show();
	}

}
