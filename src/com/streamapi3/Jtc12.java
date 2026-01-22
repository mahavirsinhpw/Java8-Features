package com.streamapi3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Jtc12 {
	public static void main(String[] args) {
		
		// which student has Fee bal more (max)
		
		
		List<Student> students = DataUtil.getStudentList();
		
		Optional<Student> stu = students.stream()
		.max((st1,st2)-> (int)(st1.getFeebal() - st2.getFeebal()));
		
		stu.ifPresent(System.out::println);
		
		System.out.println("----------");
		
		Optional<Student> stu2 = students.stream()
				.collect(Collectors.maxBy((st1,st2)-> (int)(st1.getFeebal() - st2.getFeebal())));
		stu2.ifPresent(System.out::println);
		
	}
}
