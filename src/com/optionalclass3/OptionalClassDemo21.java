package com.optionalclass3;

import java.util.Optional;

class Trainer {
	private String name;
	private String email;
	private String phone;

	public Trainer(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

class Course {
	private String courseName;
	private double coursePrice;
	private Optional<Trainer> trainer;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String courseName, double coursePrice, Optional<Trainer> trainer) {
		super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.trainer = trainer;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

	public Optional<Trainer> getTrainer() {
		return trainer;
	}

	public void setTrainer(Optional<Trainer> trainer) {
		this.trainer = trainer;
	}

}

class Student {
	private String stName;
	private String stEmail;
	private long phone;
	private Optional<Course> course;

	public Student(String stName, String stEmail, long phone, Optional<Course> course) {
		super();
		this.stName = stName;
		this.stEmail = stEmail;
		this.phone = phone;
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStEmail() {
		return stEmail;
	}

	public void setStEmail(String stEmail) {
		this.stEmail = stEmail;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Optional<Course> getCourse() {
		return course;
	}

	public void setCourse(Optional<Course> course) {
		this.course = course;
	}

}

public class OptionalClassDemo21 {

	public static void main(String[] args) {

		System.out.println("--------------");

		Trainer tr1 = new Trainer("som", "som@123", "123456");
		Course cr1 = new Course("devops", 15000, Optional.ofNullable(tr1));
		Student st1 = new Student("mahavir", "mp@123", 111, Optional.ofNullable(cr1));

		Optional<Student> myst1 = Optional.ofNullable(st1);
		Optional<Course> mycr1 = myst1.flatMap(s -> s.getCourse());
		Optional<Trainer> mytr1 = mycr1.flatMap(t -> t.getTrainer());

		Optional<String> trNameop = mytr1.map(tr -> tr.getName());
		String name = trNameop.orElse("No name is given");

		Optional<String> trEmailop = mytr1.map(mt -> mt.getEmail());
		String email = trEmailop.orElse("No email is given");

		Optional<String> trPhoneop = mytr1.map(tr -> tr.getPhone());
		String phone = trPhoneop.orElse("no phone is given");

		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);

		System.out.println("--------------");

	}

}
