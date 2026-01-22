package com.streamapi3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Jtc14 {
	public static void main(String[] args) {
		
		// Display the students who has to pay the bal and who paid separately.
		List<Student> students = DataUtil.getStudentList();
		
		Map<Boolean, List<Student>> studentsWithPaidBal = students.stream()
		.collect(Collectors.partitioningBy(st->st.getFeebal() == 0));
		
		for(Boolean flag : studentsWithPaidBal.keySet()) {
			
			List<Student> studentList = studentsWithPaidBal.get(flag);
			
			if(flag) {
				System.out.println("students with no bal.(all paid)");
			} else {
				System.out.println("students with Bal to pay");
			}
			studentList.forEach(System.out::println);
		}
	
	
		
//		Map<Boolean, List<Student>> feeBal = students.stream()
//		.collect(Collectors.partitioningBy(st->st.getFeebal() == 0));
//		
//		for(Boolean flag : feeBal.keySet()) {
//			
//			List<Student> allStudents = feeBal.get(flag);
//			
//			if(flag) {
//				System.out.println("no students are there with pending fee");
//			} else {
//				System.out.println("students with Bal to pay");
//			}
//			allStudents.forEach(System.out::println);
//			
//		}
		
	}
}
