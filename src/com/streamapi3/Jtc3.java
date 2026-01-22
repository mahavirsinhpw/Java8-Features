package com.streamapi3;

import java.util.List;
import java.util.stream.Collectors;

public class Jtc3 {
	public static void main(String[] args) {
		
		List<Student> students = DataUtil.getStudentList();
		
		students.stream().sorted((n1,n2)->n1.getName().compareTo(n2.getName())).forEach(System.out::println);
		System.out.println("----------");
		
		List<Student> studentsInAscendingName = students.stream().sorted((st1,st2)->st1.getName().compareTo(st2.getName())).collect(Collectors.toList());
		studentsInAscendingName.forEach((n)->System.out.println(n));
	}
}
