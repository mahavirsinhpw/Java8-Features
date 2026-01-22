package com.streamapi3;

import java.util.List;
import java.util.stream.Collectors;

public class Jtc4 {
	public static void main(String[] args) {
		// display the students who has to pay fee balance in descending order by name
		
		List<Student> students = DataUtil.getStudentList();
		
		students.stream().filter(st->st.getFeebal()>0).sorted((st1, st2)->st2.getName().compareTo(st1.getName())).forEach(System.out::println);
		
		System.out.println("------------");
		
		List<Student> studentsWithFeeBalInDescendingName = students.stream().filter(st->st.getFeebal()>0).sorted((st1,st2)->st2.getName().compareTo(st1.getName())).collect(Collectors.toList());
		studentsWithFeeBalInDescendingName.forEach((n)->System.out.println(n));
	}
}
