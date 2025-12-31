package com.LambdaExpression;

interface I2 {
	void m1(String s1);
}

public class LambdaExpressionDemo2 {

	public static void main(String[] args) {
		
		I2 i = (s1)->{
			System.out.println("m1 in LambdaExpressionDemo "+s1);
		};
		i.m1("Hello ");
		
		I2 i2 = (String s2)->{
			System.out.println("m1 in LambdaExpressionDemo second time "+s2);
		};
		i2.m1("dosto");
	}

}
