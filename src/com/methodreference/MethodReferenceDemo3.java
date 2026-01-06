package com.methodreference;

interface Hai {
	void test(int a, int b);

}

class MyInteger1 {
	public void multiply(int a, int b) {
		int c = a * b;
		System.out.println("multiplication of " + a + " and " + b + " is : " + c);
	}
}

public class MethodReferenceDemo3 {
	public static void main(String[] args) {
		MyInteger1 my = new MyInteger1();
		Hai hi = my::multiply;
		hi.test(5, 3);
		
		Hai hi2 = new MyInteger1()::multiply;
		hi2.test(4, 2);
		
		
	}
}
