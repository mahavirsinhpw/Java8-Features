package com.defaultMethod2;

interface I11 {
	default void m1() {

	}
//	default static void m2() {
//		
//	}

//	default void m3();

//	default abstract void m4();

//	default final void m5() {
//		
//	}

//	private  default void m6() {
//		
//	}

//	protected default void m7() {
//		
//	}

	public default void m8() {

	}

//	default default void m9() {
//		
//	}

}

class C1 implements I11 {
	public void m8() {
		System.out.println("m8 in C1");
		I11.super.m8();
	}
}

public class DefaultMethodDemo16 {

	public static void main(String[] args) {

	}

}
