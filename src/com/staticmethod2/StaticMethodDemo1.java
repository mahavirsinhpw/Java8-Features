package com.staticmethod2;

interface I1{
	
	int a = 101; // public static final always
	 void m1(); //  public abstract always
	 
//	 static void m();
	 
	 static void m2() {
		 System.out.println("static m2 in I1");
	 }
	 
	 static void m3() {
		 System.out.println("static m3 in I1");
//		 m10();
	 }
	 
	 public static void m4() {
		 System.out.println("public static m4");
	 }
	
	 private static void m5() {
		 System.out.println("private static m5");
	 }
	 
//	 default static void m6() {}
	 
//	 protected static void m7() {}
	 
//	 static abstract void m8() {}
	 
//	 static final void m9() {}
	 
	 default void m10() {
		 System.out.println("deafault m10");
		 m3();
	 }
	
}



public class StaticMethodDemo1 {

	public static void main(String[] args) {
		I1.m2();
		I1.m3();
		I1.m4();
		System.out.println(I1.a);
	}

}
