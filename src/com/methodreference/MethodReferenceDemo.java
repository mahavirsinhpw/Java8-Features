package com.methodreference;

interface Hello{
	
	int test(int a, int b);
}

class MyInteger{
	
	public static int findSum(int a, int b) {
		System.out.println("inside findsum");
		return a+b;
	}
	
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		
		System.out.println("inside main");
		System.out.println("*******using Lambda Exp.******\n");
		Hello hello = (a,b)-> {
			return a+b;
		};
		int sum = hello.test(10, 20);
		System.out.println(sum);
		
		System.out.println("*****using method reference****\n");
		
		Hello hello1 = MyInteger::findSum;
		int sum2 = hello1.test(50, 50);
		System.out.println(sum2);
		
		Hello hello2 = MyInteger::findSum;
		int sum3 = hello1.test(40, 30);
		System.out.println(sum3);
		
	}

}
