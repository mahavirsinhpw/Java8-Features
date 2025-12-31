package com.defaultMethod;

interface WildAnimal {
	void eating();

	void sleeping();

	default void running() {
		System.out.println("WildAnimal is running");
	}

	default void thinking() {
		System.out.println("WildAnimal is running");
	}

//	protected default void flying() {
//		
//	}

}

class Deer implements WildAnimal {

//	default void eating() {
//		System.out.println("deer is eating ");
//	}

	@Override
	public void eating() {
		System.out.println("deer is eating ");
	}

	public void running() {
		System.out.println("deer is running ");
	}

	public void thinking() {
		System.out.println("deer is thinking ");
	}

	@Override
	public void sleeping() {
		System.out.println("deer is sleeping ");
	}
}

class ChildDeer extends Deer {

	// InterfaceName.super.method();
	// ONLY to solve the diamond problem in multiple interface inheritance.
	// But Java does NOT allow multiple class inheritance → so no special syntax.

	public void running() {
		super.running();
		// WildAnimal.super.running(); //WildAnimal.super.running() is ONLY allowed
		// inside a class that directly implements WildAnimal.
	}

	public void dancing() {
		// WildAnimal.super.running(); //WildAnimal.super.running() is ONLY allowed
		// inside a class that directly implements WildAnimal.
	}

}

public class DefaultMethodDemo5 {

	public static void main(String[] args) {
		WildAnimal ani = new Deer();
		ani.eating();
		ani.sleeping();
		ani.running();
		ani.thinking();

	}

}
