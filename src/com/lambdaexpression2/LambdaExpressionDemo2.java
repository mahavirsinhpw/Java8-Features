package com.lambdaexpression2;

interface Inter1 {
	void display(String name);
}

@FunctionalInterface
interface Interf {
	void show(int a, int b);
//	void display2();

}

@FunctionalInterface
interface Inter2 {
	int check(int a, int b);
}

@FunctionalInterface
interface Inter3 {
	int test(int a, int b, int c);
}

public class LambdaExpressionDemo2 {
	public static void main(String[] args) {

		Inter1 i1 = (name) -> {
			System.out.println("Hello " + name + " welcome to Lambda world");
		};
		i1.display("dosto");

		Inter1 i2 = (String st) -> {
			System.out.println("Hello " + st + " welcome to Lambda world");
		};
		i2.display("mitro");

		Inter1 i3 = st -> System.out.println("hello " + st + " welcome to our youtube channel");
		i3.display("guys");

//		Inter1 i4 = String st ->  System.out.println("hello "+st+" welcome to our youtube channel");
//		i3.display("guys");

		Inter1 i4 = (String st) -> System.out.println("hello " + st + " welcome to our youtube channel");
		System.out.println("aapka swagat hai"); // we can write but treated as diff line. not under lambda functon
		System.out.println("hello");
		i3.display("guys");

//		Interf i = (a,b)-> 
//			int ab = b-a;
//		System.out.println("are wah ab "+ab);

		Interf if0 = (a, b) -> {
			int ab = b - a;
			System.out.println("are wah ab " + ab);
		};
		if0.show(10, 30);

		Interf if1 = (int a, int b) -> {
			int ab = b - a;
			System.out.println("are wah ab " + ab);
		};
		if1.show(10, 30);

//		Inter2 if3 = (a,b)-> return a+b;

		Inter2 if3 = (a, b) -> {
			return a + b;
		};

		Inter2 if4 = (a, b) -> a + b;

		int sum = if4.check(50, 40);
		System.out.println(sum);

//		Inter2 iff = a,b -> {return a+b;};

		Inter3 iff = (a, b, c) -> {
			System.out.println(a + b + c);
			return a + b + c;
		};
		int sum1 = iff.test(10, 20, 30);
		System.out.println(sum1);

		Inter3 iff2 = (a, b, c) -> a + b - c;
		int sum2 =iff2.test(50, 10, 20);
		System.out.println(sum2);
		
//		Inter2 it = (int a, b)->a+b;
		
		
		

	}
}
