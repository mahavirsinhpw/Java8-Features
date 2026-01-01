package com.staticmethod2;

class Hello{
	void m1() {
		System.out.println("m1 in hello");
	}
}

public interface StaticMethodDemo2 {

	public static void main(String[] args) {
		System.out.println("main in iterface");
		Hello h = new Hello();
		h.m1();
	}

}
