package com.LambdaExpression;

@FunctionalInterface
interface I1 {

	void m1();
//	void m2();

	default void m3() {
		System.out.println("default in I1");
	}

	static void m4() {
		System.out.println("static in m1");
	}
}

public class LambdaExpressionDemo {
	public static void main(String[] args) {
		
		I1 i = () -> {
			System.out.println("m1 in LambdaExpressionDemo");
			System.out.println("*******");
		};
		i.m1();
		i.m3();
		I1.m4();
		
		I1 i2 = ()-> System.out.println("m1 in LambdaExpressionDemo second type");
		i2.m1();
		
	}
}
