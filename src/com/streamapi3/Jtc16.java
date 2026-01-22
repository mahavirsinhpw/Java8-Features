package com.streamapi3;

import java.util.List;
import java.util.stream.Collectors;

public class Jtc16 {
	public static void main(String[] args) {
		
		// what is the total fee paid till now
		
		List<Student> students =  DataUtil.getStudentList();
		
		Double totalPaid = students.stream().collect(Collectors.summingDouble(Student::getFeePaid));
		System.out.println("totalPaid "+ totalPaid);
		
	}
}
