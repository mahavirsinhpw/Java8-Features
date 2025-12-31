package com.defaultMethod;

interface inter1 {
	
	default void m1() {
		System.out.println("default m1 in inter1");
	}

	default void m2() {
		System.out.println("default m2 in inter1");
	}
	
	default void show() {
		System.out.println("show in inter1");
	}
}

interface inter2 extends inter1 {

	default void m1() {
		System.out.println("m1 in inter2");
	}
	
//	default void show() {
//		System.out.println("show in inter2");
//	}
}

interface inter3 {
	
	default void show() {
		System.out.println("show in inter2");
	}
}

class Testing implements inter1,inter2, inter3{
	
	public void m1() {
		System.out.println("m1 in Testing");
		//inter1.super.m1(); //this is not possible because inter2 is extending inter1
		inter2.super.m1();
		
		//inter1.super.show(); //this is not possible because inter2 is extending inter1
		inter2.super.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		//inter1.super.show();
	}
}

public class DefaultMethodDemo8 {

	public static void main(String[] args) {
		Testing t = new Testing();
		t.m1();
	}

}
