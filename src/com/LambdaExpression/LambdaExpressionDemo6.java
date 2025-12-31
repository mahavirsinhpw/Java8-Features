package com.LambdaExpression;

interface Inter3{
	void m1(int x, int y, int z);
}

public class LambdaExpressionDemo6 {

	public static void main(String[] args) {
		
		Inter3 i =(a,b,c) ->{
			System.out.println("here three param "+a+" "+b+" "+c);
		};
		i.m1(10, 20, 30);
		
//		Inter3 i2 = (int a, b,c)->{
//			System.out.println("here three param "+a+" "+b+" "+c);
//		}
		
//		Inter3 i3 = a,b,c -> a+b+c;
		
//		Inter3 i =(a,b,c) =>{
//			System.out.println("here three param "+a+" "+b+" "+c);
//		};
	}

}
