package com.staticmethod2;

interface Inter1 {
	static void m1() {
		System.out.println("m1 in inter1");
	}

}

interface Inter2 {
	static void m1() {
		System.out.println("m1 in inter2");
	}

}

class Hai implements Inter1, Inter2 {
	public void test() {
		m1();
		Inter1.m1();
		Inter2.m1();

	}

	static void m1() {
		System.out.println("m1 in Hai");
	}

	static void show() {
		System.out.println("show in Hai");
	}
}

public class StaticMethodDemo5 {

	public static void main(String[] args) {
		Hai h = new Hai();
		h.test();

		// 1. calling static method with ref. var having null
//		Inter1 ob = null;
//		ob.m1(); // This static method of interface Inter1 can only be accessed as Inter1.m1

		Hai h1 = null;
		h1.m1(); // static method don't care about content of object in the case of class
		h1.show(); // static method don't care about content of object in the case class

		// 2. calling static method with ref. var having Object reference
//		Inter1 i1 = new Hai();
//		i1.m1(); // to call Interface method 
//		Inter1.m1();

		Hai h2 = new Hai();
		h2.show();

		// 3. calling static method with class name
		Inter1.m1();
		Inter2.m1();
		Hai.m1();
		System.out.println("*****\n");

//		Inter1 obj = null;
//		obj.m1(); // This static method of interface Inter1 can only be accessed as Inter1.m1
		Hai hai = null;
		hai.m1();

//		Inter1 obj2 = new Hai();
//		obj2.m1(); // This static method of interface Inter1 can only be accessed as Inter1.m1
		Hai hai2 = new Hai();
		hai2.m1();

		Inter1.m1();
		Hai.m1();

		// NOTE : Interface static method MUST ONLY called with INTERFACE NAME always.

	}

}
