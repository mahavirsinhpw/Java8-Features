package com.streamapi3;

import java.util.List;
import java.util.stream.Collectors;

public class Jtc6 {
	public static void main(String[] args) {
		
		// Display the Students who joined for Devops course.
			
			List<Student> students = DataUtil.getStudentList();
			
			students.stream().filter(st->st.getCourseName().equals("devops")).forEach(System.out::println);
			
			System.out.println("-----------");
			
			List<Student> studentList = students.stream().filter(st->st.getCourseName().equals("devops")).collect(Collectors.toList());
			
			studentList.forEach(System.out::println);
			
	}
}
