package com.streamapi3;

import java.util.List;
import java.util.stream.Collectors;

public class Jtc7 {
	public static void main(String[] args) {

		// display the students who joined devops course in Asc order by name

		List<Student> students = DataUtil.getStudentList();

		List<Student> studentList = students.stream()
				.filter(st -> st.getCourseName().equals("devops"))
				.sorted((st1, st2) -> st1.getName().compareTo(st2.getName()))
				.collect(Collectors.toList());

		studentList.forEach(System.out::println);
	}
}
