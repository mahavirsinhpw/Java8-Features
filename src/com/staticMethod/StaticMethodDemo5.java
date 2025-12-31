package com.staticMethod;

interface X {
	static void m1() {
		System.out.println("X-m1");
	}
}

interface Y {
	static void m1() {
		System.out.println("Y-m1");
	}
}

class Check implements X, Y {

	void test() {
		m1();
		show();
		X.m1();
		Y.m1();
	}

	static void m1() {
		System.out.println("Check-m1");
	}

	static void show() {
		System.out.println("Check-show");
	}
}

public class StaticMethodDemo5 {
	public static void main(String[] args) {
		Check c = new Check();
		c.test();
		
		//1.Calling Static Method with Ref.Variable having Null
		//X obj = null;  // not possible for null to interface
		//obj.m1();
		
		Check ob = null;
		ob.m1();
		ob.show();
		
		//2.Calling Static Method with Ref.Variable having Object address
		//X obj = new Check();
		//obj.m1();
		
		Check ch = new Check();
		ch.m1();
		ch.show();
		
		
		//3.Calling Static Method with Class Name
		X.m1();
		Y.m1();
		Check.m1();
		Check.show();
		
	}
}
