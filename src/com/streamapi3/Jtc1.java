package com.streamapi3;

import java.util.List;
import java.util.stream.Collectors;

public class Jtc1 {
	public static void main(String[] args) {
		
		List<Student> students = DataUtil.getStudentList();
		
		students.stream().forEach(System.out::println);
		
		System.out.println("------");
		
		List<Student> students2 = students.stream().collect(Collectors.toList());
		students2.forEach(System.out::println);
		
		System.out.println("------");
	}
}
