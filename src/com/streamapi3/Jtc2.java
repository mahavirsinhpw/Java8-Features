package com.streamapi3;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Jtc2 {
	public static void main(String[] args) {
		
		List<Student> students = DataUtil.getStudentList();
		
		students.stream().filter(c->c.getFeebal()>0).forEach(System.out::println);
		System.out.println("------");
		
		List<Student> studentsWitFeeBal = students.stream().filter(c->c.getFeebal()>0).collect(Collectors.toList());
		studentsWitFeeBal.forEach((n)->System.out.println(n));

//		List<Student> studentsWitFeeBal = students.stream().filter(c->c.getFeebal()>0).collect(Collectors.toList()).forEach(null);;

	}
}
