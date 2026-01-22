package com.streamapi3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Jtc18 {
	public static void main(String[] args) {
		
		// what is the total Fee paid till now by course wise
				List<Student> students =  DataUtil.getStudentList();
				
				Map<String, Double> totalFeePaid = students.stream()
				.collect(Collectors.groupingBy(Student::getCourseName, Collectors.summingDouble(Student::getFeePaid)));
				
				for(String course : totalFeePaid.keySet()) {
					System.out.println(course +" : "+totalFeePaid.get(course));
				}
	}
}
