package com.LambdaExpression;

interface I11{
	void m1(int x, int y);
}

public class LambdaExpressionDemo3 {

	public static void main(String[] args) {

		I11 i1 = (a,b)->System.out.println("Hello everyOne a is :"+a+" and b is :"+b);
		i1.m1(100, 200);
		
		I11 i2 = (a,b)->{
			int diff = b-a;
			System.out.println("difference is : "+diff);
		};
		i2.m1(400, 500);
	}
}
