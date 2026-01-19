package com.functionalinterface;

interface Hello{
	void test(int a, int b) throws ArithmeticException;
}

public class FunctionalInterfaceDemo {
 
	public static void main(String[] args) {
		Hello hello = (a,b)->{
			System.out.println("lambda code starts");
		
		
		try {
			int result = a/b;
			System.out.println("result is "+ result);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("lmabda code ends");
		
		};
		
		hello.test(50, 0);
	}
	
	
	
}
