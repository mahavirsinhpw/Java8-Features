package com.lambdaexpression2;

@FunctionalInterface
interface inter {
	
	void m1();
	
	static void m2() {
		System.out.println("m2 in inter");
	}
	
	default void m3() {
		System.out.println("m3 in inter");
	}
}

public class LambdaExpressionDemo1 {

	public static void main(String[] args) {
		inter i = ()->{
			System.out.println("m1 method");
		};
		
		i.m1();
		i.m3();
//		i.m2();
		inter.m2();
		
		inter i2 = ()-> System.out.println("welcome to lambda world");
		i2.m1();
		i2.m3();
//		i2.m2();
		inter.m2();
		
	}

}
