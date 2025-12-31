package com.defaultMethod2;

interface A{
	default void show() {
		System.out.println("show in A");
	}
}

interface B{
	default void show() {
		System.out.println("show in B");
	}
}

class C implements A, B{

	public void show() {
		System.out.println("show in C");
		A.super.show();
		B.super.show();
	}
	
	public void showAll() {
		System.out.println("showAll in C");
		show();
	}
	
	public void showAll2() {
		System.out.println("showAll2 in C");
		A.super.show();
		B.super.show();
	}
	
}

public class DefaultMethodDemo12 {

	public static void main(String[] args) {
		C c = new C();
		c.show();
		c.showAll();
		c.showAll2();
	}

}
