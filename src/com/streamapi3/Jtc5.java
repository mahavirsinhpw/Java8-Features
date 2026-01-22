package com.streamapi3;

import java.util.List;
import java.util.stream.Collectors;

public class Jtc5 {
	public static void main(String[] args) {
		
		// find the students(list of students) whose feebal>=2000, add 1000 to all those students, 
		//sort them in Descending order by feebal
		// store in resultList.
		
		List<Student> students = DataUtil.getStudentList();
		
		System.out.println("-------------");
//		List<Double> studentList = students.stream()
//		.filter(n->n.getFeebal() >=2000)
//		.map(st->st.getFeebal()+1000)
//		.sorted((st1,st2)-> st2.compareTo(st1))
//		.collect(Collectors.toList());
//		studentList.forEach(System.out::println);
//		
//		System.out.println("-------------");
		
		List<Student> studentList2 = students.stream()
		.filter(st->st.getFeebal()>=2000)
		.map(st -> {
			st.setFeebal(st.getFeebal()+1000);
			return st;
		}
		)
		.sorted((st1, st2) -> {
			return  (int) (st2.getFeebal() - st1.getFeebal()); 
		})
		.collect(Collectors.toList());
		studentList2.forEach(System.out::println);
		
		
		
	}
}
