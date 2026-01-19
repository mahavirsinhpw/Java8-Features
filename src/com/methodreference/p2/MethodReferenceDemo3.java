package com.methodreference.p2;

interface Hi{
	public int test(int a, int b);
	
	
}

class MyInteger{
	public static int findSum(int a, int b) {
		return a+b;
	}
}

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		
		Hi hi = (a,b)->{
			int sum = a+b;
			return sum;
		};
		int sum1= hi.test(10, 20);
		System.out.println(sum1);
		
		Hi hi1 = MyInteger::findSum;
		int sum2= hi1.test(10, 20);
		System.out.println(sum2);
		
		Hi hi2 = Integer::sum;
		int sum3= hi2.test(100, 200);
		System.out.println(sum3);
		
		Hi hi3 = Integer::max;
		int max= hi3.test(15, 50);
		System.out.println(max);
		
		Hi hi4 = Integer::min;
		int min= hi4.test(15, 50);
		System.out.println(min);
		
		
		
	}

}
