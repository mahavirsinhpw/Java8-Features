package com.defaultMethod;

interface Sayable{
	
//	default void say();
	
//	default abstract void say() {
//		
//	}
	
	
//	default static void say() {
//		
//	}
	
	
	
//	default boolean equals(Object obj) {
//		
//	}
	
	
	default void say() {
		System.out.println("say in sayable");
	}
	
	default void say2() {
		System.out.println("say2 in sayable");
		say();
	}
	
	
}

class Speakable implements Sayable{
	
}

public class DefaultMethodDemo3 {

	public static void main(String[] args) {
		Speakable sp = new Speakable();
		sp.say();
		sp.say2();
	}

}
