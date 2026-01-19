package com.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
	public static void main(String[] args) {
		
		Consumer<String> con = (in1)-> System.out.println(in1.toUpperCase());
		con.accept("mahavir");
		con.accept("Deepika");
		con.accept("Family");
		
		BiConsumer<String, String> con2 = (in1, in2)->System.out.println(in1.concat(in2));		
//		BiConsumer<String, String> con2 = (in1, in2)->System.out.println(in1.equals(in2));
		con2.accept("kevin", "ketul");
	}
}
