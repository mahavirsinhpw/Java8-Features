package com.streamapi3;

import java.util.List;
import java.util.stream.Collectors;

public class Jtc15 {
	public static void main(String[] args) {
		
		
		// what is the total Fee Bal to Receive
		List<Student> students = DataUtil.getStudentList();
		
		 Double totalFeeBal = students.stream()
		.collect(Collectors.summingDouble(Student::getFeebal));
		 System.out.println("total fee bal "+ totalFeeBal);
	}
}
