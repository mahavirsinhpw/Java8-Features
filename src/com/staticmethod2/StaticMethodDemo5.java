package com.staticmethod2;

interface Inter1{
	static void m1() {
		System.out.println("m1 in inter1");
	}
	
}
interface Inter2{
	static void m1() {
		System.out.println("m1 in inter2");
	}
	
}

class Hai implements Inter1, Inter2{
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
		
//		Inter1 ob = null;
//		ob.m1();
		
		Hai h1 = null;
		h1.m1();
		h1.show();
		
//		Inter1 i1 = new Hai();
//		i1.m1();
		
	}

}
