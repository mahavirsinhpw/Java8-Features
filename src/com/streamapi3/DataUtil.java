package com.streamapi3;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
	public static List<Student> getStudentList(){
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(101, "som", 555, "devops", 15000, 0));
		students.add(new Student(102, "rai", 333, "micro", 15000, 3000));
		students.add(new Student(103, "som", 777, "micro", 19000, 0));
		students.add(new Student(104, "som", 222, "devops", 3000, 3000));
		students.add(new Student(105, "hello", 111, "devops", 2000, 15000));
		students.add(new Student(106, "aaa", 666, "devops", 13000, 2000));
		students.add(new Student(107, "hai", 444, "micro", 25000, 5000));
		students.add(new Student(108, "bbb", 123, "spring boot", 12500, 0));
		students.add(new Student(109, "ccc", 321, "spring boot", 9000, 0));
		
		return students;
	}
}
