package com.functionalinterface;

interface Hi {
	void test(int a, int b) throws ArithmeticException;
}

public class FunctionalInterfaceDemo1 {
	public static void main(String[] args) {
		Hello hello = (a, b) -> {
			System.out.println("lambda code starts");

			int result = a / b;
			System.out.println("result is " + result);

			System.out.println("lmabda code ends");

		};

		try {
			hello.test(50, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
