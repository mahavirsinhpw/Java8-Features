package com.LambdaExpression;

interface Interf2{
	int m1(int x, int y);
}

public class LambdaExpressionDemo5 {

	public static void main(String[] args) {
		Interf2 i = (a,b)->{
			System.out.println("int m1(int x, int y)");
			return a+b;
		};
		int x = i.m1(10, 20);
		System.out.println(x);
		
//		Interf2 i2 = (a,b)->return a*b;
		Interf2 i2 = (a,b)->{return a*b;};
		Interf2 i3 = (a,b)->a*b;
		int result = i2.m1(5, 3);
		int result2 = i3.m1(5, 3);
		System.out.println(result);
		System.out.println(result2);
		
	}

}
