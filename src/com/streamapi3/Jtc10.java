package com.streamapi3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Jtc10 {
	public static void main(String[] args) {
		
		// which student has paid more Fee (max)
		List<Student> students = DataUtil.getStudentList();
		
		Optional<Student> los = students.stream()
//				.filter(st->st.getFeePaid()>0)
				.max((st1,st2)-> (int) (st1.getFeePaid() - st2.getFeePaid()));
		
		los.ifPresent(System.out::println);
		
		System.out.println("-----------");
		
		Optional<Student> los2 = students.stream()
		.collect(Collectors.maxBy((st1,st2)-> (int) (st1.getFeePaid() - st2.getFeePaid())));
		
		los2.ifPresent(System.out::println);
	}
}
