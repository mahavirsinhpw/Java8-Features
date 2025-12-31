package com.staticMethod;


public interface StaticMethodDemo6 {
	
	static void m1() {
		System.out.println("StaticMethodDemo6-m1");
		//m2();
	}
	
	default void m2() {
		System.out.println("StaticMethodDemo6-m2");
		m1();
	}

	public static void main(String[] args) {
		
		System.out.println("inside main");
		m1();
		//m2(); can not call instance method from static method directly.
		//StaticMethodDemo6.main(args); // got terminated.
		
		
	}

}
