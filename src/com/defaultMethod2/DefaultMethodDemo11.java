package com.defaultMethod2;

interface Animal {
	void sleeping();

	void eating();

	default void running() {
		System.out.println("Running in Animal");
	}

	default void thinking() {
		System.out.println("Thinking in Animal");
	}

}

class Dog implements Animal {

	@Override
	public void sleeping() {
		System.out.println("Sleeping in Dog");
	}

	@Override
	public void eating() {
		System.out.println("Eating in Dog");
	}

	// Cannot reduce the visibility of the inherited method from Animal
//	void running() {
//		System.out.println("Running in Dog");
//	}

	public void running() {
		System.out.println("Running in Dog");
	}

	public void thinking() {
		System.out.println("Thinking in Dog");
	}

	// Default methods are allowed only in interfaces. default keyword is used only
	// in interface.
//	default void barking() {
//		System.out.println("dog is barking");
//	}
}

class Cat implements Animal {

	@Override
	public void sleeping() {
		System.out.println("Sleeping in cat");
	}

	@Override
	public void eating() {
		System.out.println("Eating in cat");
	}

	// The return type is incompatible with Animal.running()
//	public int running() {
//		return 10;
//	}

	public void running() {
		System.out.println("cat is running");
	}

}

public class DefaultMethodDemo11 {

	public static void main(String[] args) {

		Animal an = new Dog();
		an.sleeping();
		an.eating();
		an.running();
		an.thinking();

		System.out.println("*****\n");

		an = new Cat();
		an.sleeping();
		an.eating();
		an.running();
		an.thinking();

//		Animal.running();
//		Animal.thinking();
	}

}
