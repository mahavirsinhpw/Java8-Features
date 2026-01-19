package com.methodreference.p2;

interface Hai{
	public int test(int a, int b);
}

interface Hail {
	public void test(String st);
}

class MYInteger{
	public int findSum(int a , int b) {
		return a+b;
	}
}
public class MethodReferenceDemo4 {
	public static void main(String[] args) {
		
		Hai hai = (a,b)->{
			int sum = a+b;
			return sum;
		};
		int sum = hai.test(10, 20);
		System.out.println(sum);
		
		Hai hai1 = new MYInteger()::findSum;
		int sum1 = hai1.test(10, 20);
		System.out.println(sum1);
		
		Hail hail = System.out::println;
		hail.test("bhai bhai");
		
		
	}
}
