package com.methodreference.p2;

import java.util.Arrays;

interface Test1{
	
	public void test(int[] arr);
}


public class MethodReferenceDemo6 {

	public static void main(String[] args) {

		int [] myar = {30,20,40,50,10};
		
		Test1 test1 = (ar) -> {
			for(int i =0; i< ar.length-1;i++) {
				for(int j =i+1; j<ar.length; j++) {
					if(ar[i]>ar[j]) {
						int temp = ar[i];
						ar[i] = ar[j];
						ar[j] = temp;
					}
				}
			}
		};
		test1.test(myar);
		for(int a : myar) {
			System.out.println(a);
		}
		
		System.out.println();
		// Method Reference
		int [] myar2 ={99,88,55,77,22,66};
		Test1 test2 = Arrays::sort;
		test2.test(myar2);
		for(int a : myar2) {
			System.out.println(a);
		}
		
	}

}
