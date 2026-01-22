package com.streamapi3;

import java.util.List;
import java.util.stream.Collectors;

public class Jtc8 {
	
	public static void main(String[] args) {

		// display the students who joined devops course in Desc order by name

		List<Student> students = DataUtil.getStudentList();

		List<Student> studentList = students.stream()
				.filter(st -> st.getCourseName().equals("devops"))
				.sorted((st1, st2) -> st2.getName().compareTo(st1.getName()))
				.collect(Collectors.toList());

		studentList.forEach(System.out::println);
	}
}
