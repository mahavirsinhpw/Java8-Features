package com.staticMethod;

interface Interf1{
	
	public static void m1() {
		System.out.println("static m1 in interf1");
	}
	
	static void m2() {
		System.out.println("static m2 in interf1");
	}
	
}

interface Interf2 extends Interf1{
	
	public static void m1() {
		System.out.println("static m1 in interf2 ");
	}
}

class Best implements Interf2{
	
	void showAll() {
		Interf2.m1();
		Interf1.m1();
		Interf1.m2();
	}
	
}

class West implements Interf1{
	public void sing() {
		System.out.println("sing a song");
	}
}

public class StaticMethodDemo3 {

	public static void main(String[] args) {
		
		Best b = new Best();
		b.showAll();
		
		
		West w = new West();
		w.sing();
			
		Interf1.m1();
		
	}

}
