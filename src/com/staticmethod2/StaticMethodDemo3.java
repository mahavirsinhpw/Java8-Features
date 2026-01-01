package com.staticmethod2;

interface I11{
	static void m1() {
		System.out.println("m1 in I1");
	}
}

interface I22{
	static void m1() {
		System.out.println("m1 in I2");
	}
}

class Hi implements I11, I22{
	
	static void m1() {
		System.out.println("this is new hidden method not overriden");
	}
	
	void show() {
		I11.m1();
		I22.m1();
	}
}

public class StaticMethodDemo3 {

	public static void main(String[] args) {
		Hi h = new Hi();
		h.show();
		Hi.m1();
	}

}
