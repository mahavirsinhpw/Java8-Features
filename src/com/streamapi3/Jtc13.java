package com.streamapi3;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Jtc13 {
	public static void main(String[] args) {
		

		// Display the course wise Students
		
		List<Student> students = DataUtil.getStudentList();
		
		Map<String, List<Student>> courseWiseStudents = students.stream()
														.collect(Collectors.groupingBy(Student :: getCourseName));
		
		for(String course : courseWiseStudents.keySet()) {
			List<Student> studentList = courseWiseStudents.get(course);
			System.out.println(" Student joined for "+course);
			studentList.forEach(System.out::println);
			System.out.println("-----");
		}
		
		
		


	}
}
