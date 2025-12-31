package com.defaultMethod;

interface Animal {
	void sleeping();

	void eating();

	default void running() {
		System.out.println("Animal is running");
	}

	default void thinking() {
		System.out.println("Animal is thinking");
	}

	default void drinking() {
		System.out.println("Animal is drinking");
	}
}

class Dog implements Animal {

	public void sleeping() {
		System.out.println("Dog is sleeping");
	}

	public void eating() {
		System.out.println("Dog is eating");
	}

	public void thinking() {
		System.out.println("Dog is thinking");
	}
}

class Cat implements Animal {

	public void sleeping() {
		System.out.println("Cat is sleeping");
	}

	public void eating() {
		System.out.println("Cat is eating");
	}

	public void thinking() {
		System.out.println("Cat is thinking");
	}

	public void running() {
		System.out.println("Cat is running");
	}
}

public class DefaultMethodDemo {

	public static void main(String[] args) {

		Animal ani = new Dog();
		ani.sleeping();
		ani.eating();
		ani.running();
		ani.thinking();

		ani.drinking();

		Animal an = new Cat();
		an.sleeping();
		an.eating();
		an.running();
		an.thinking();

		an.drinking();

//		Animal a = null;
//		a.sleeping();
//		a.eating();
//		a.running();
//		a.thinking();

//		Animal.running();
	}

}
