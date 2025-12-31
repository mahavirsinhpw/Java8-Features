package com.LambdaExpression;

@FunctionalInterface
interface Inter1{
	void m1(int a, int b);
}

public class LambdaExpressionDemo4 {

	Inter1 i1 =(x,y)->{
		System.out.println("m1 in LambdaExpressionDemo4"+x+" "+y);
	};
	
	public static void main(String[] args) {
		LambdaExpressionDemo4 lb = new LambdaExpressionDemo4();
		lb.i1.m1(10, 20);
	}
}



//@FunctionalInterface
//interface Inter1{
//	void m1(int a, int b);
//}
//
//// This lambda expression is itself an implementation of the functional interface Inter1.
//// There is absolutely no need to write implements Inter1
//// We are already implementing the functional interface using a lambda expression:
//public class LambdaExpressionDemo4 implements Inter1{
//
//	public static void main(String[] args) {
//		Inter1 i1 =(x,y)->{
//			System.out.println("m1 in LambdaExpressionDemo4"+x+" "+y);
//		};
//	}
//}


