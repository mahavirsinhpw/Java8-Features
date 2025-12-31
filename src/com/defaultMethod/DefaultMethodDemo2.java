package com.defaultMethod;

import com.defaultMethod.I1;

interface I1 {
	default void show() {
		System.out.println("show in I1");
	}
}

interface I2 {
	default void show() {
		System.out.println("show in I2");
	}
}

class Hello implements I1, I2 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		I1.super.show();
		I2.super.show();
	}

//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		I2.super.show();
//	}

//	I1.super.show();
//	I2.super.show();
//	public void show() {
//		System.out.println("show in Hello");
//	}

//	public void show() {
//		System.out.println("show in Hello");
//	}

	public void showAll() {
		System.out.println("showAll in Hello");
		show();
		I1.super.show();
		I2.super.show();
	}

}

public class DefaultMethodDemo2 {

	public static void main(String[] args) {
		Hello h = new Hello();
		h.showAll();
	}

}
