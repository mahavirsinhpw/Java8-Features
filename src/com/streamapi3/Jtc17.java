package com.streamapi3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Jtc17 {
	public static void main(String[] args) {
		
		// what is the total Fee bal to pay till now by course wise
		List<Student> students =  DataUtil.getStudentList();
		
		Map<String, Double> feeBalMap = students.stream()
		.collect(Collectors.groupingBy(Student::getCourseName,Collectors.summingDouble(Student::getFeebal)));
		
		for(String course : feeBalMap.keySet()) {
			 System.out.println(course+ " : "+feeBalMap.get(course)); 
		}
	}
}
