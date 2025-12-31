package com.defaultMethod;

interface I0{
	default void m11() {
		 System.out.println(" you are in default method"); 
	}
	
//	default protected void m22() {
//		
//	}
	
	private void m3() {
		
	}
	
	public void m4(); // it is equal to -> public abstract void m4();
	
	static void m5() {
		
	}
}

class C11 implements I0{

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class DefaultMethodDemo7 {

	public static void main(String[] args) {
		C11 c = new C11();
		c.m11();
	}

}
