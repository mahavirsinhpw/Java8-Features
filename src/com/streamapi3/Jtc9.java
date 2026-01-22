package com.streamapi3;

import java.util.List;
import java.util.stream.Collectors;

public class Jtc9 {
	
	public static void main(String[] args) {

		// How many students has to pay the feeBal from devops course 

		List<Student> students = DataUtil.getStudentList();

		Long count = students.stream()
				.filter(st -> st.getCourseName().equals("devops") && st.getFeebal()>0)
				.collect(Collectors.counting());
		
		System.out.println(count);
		
		System.out.println("--------");
		
		Long count1 = students.stream()
				.filter(st -> st.getCourseName().equals("devops"))
				.filter(st -> st.getFeebal()>0)
				.collect(Collectors.counting());
		
		System.out.println(count1);
	}
}
