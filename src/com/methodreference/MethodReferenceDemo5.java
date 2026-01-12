package com.methodreference;

import java.util.Arrays;

interface Test {
	void test(int[] arr);
}

public class MethodReferenceDemo5 {
	public static void main(String[] args) {

		System.out.println("Method Ref.******\n");
		int[] arr1 = { 90, 20, 50, 10, 60, 80 };

		Test t = Arrays::sort;
		t.test(arr1);
		for (int a : arr1) {
			System.out.println(a);
		}

		System.out.println("Lambda exp.******\n");

		int[] arr2 = { 80, 60, 30, 70, 10, 50 };
		Test test = (arr) -> {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		};
		test.test(arr2);
		for (int b : arr2) {
			System.out.println(b);
		}
	}
}
