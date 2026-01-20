package com.optionalclass;
class Trainer{
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

class Course{
	private String courseName;
	private double coursePrice;
	private Trainer trainer;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseName, double coursePrice, Trainer trainer) {
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
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
}

class Student {
	private String stName;
	private String stEmail;
	private long phone;
	private Course course;
	public Student(String stName, String stEmail, long phone, Course course) {
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
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}

public class OptionalClassDemo19 {

	public static void main(String[] args) {
		
		
		Trainer tr1 = new Trainer("som", "som@123", "123456");
		Course cr1 = new Course("devops", 15000, tr1);
		Student st1 = new Student("mahavir", "mp@123", 111, cr1);
		
		// when I have access to only Student object and i want Trainer's name, email,and phone
		String trainerName = st1.getCourse().getTrainer().getName();
		String trainerEmail = st1.getCourse().getTrainer().getEmail();
		String trainerPhone = st1.getCourse().getTrainer().getPhone();
		System.out.println(trainerName);
		System.out.println(trainerEmail);
		System.out.println(trainerPhone);
		
		System.out.println("--------------");
		
		Course cr2 = new Course("java8", 500, null);
		Student st2 = new Student("deepika", "dp@123", 222, cr2);
		
		trainerName = st2.getCourse().getTrainer().getName();
		trainerEmail = st2.getCourse().getTrainer().getEmail();
		trainerPhone = st2.getCourse().getTrainer().getPhone();
		System.out.println(trainerName);
		System.out.println(trainerEmail);
		System.out.println(trainerPhone);
		
		System.out.println("--------------");
		
		Student st3 = new Student("deepveer", "dpm@123", 333, null);
		
		trainerName = st3.getCourse().getTrainer().getName();
		trainerEmail = st3.getCourse().getTrainer().getEmail();
		trainerPhone = st3.getCourse().getTrainer().getPhone();
		System.out.println(trainerName);
		System.out.println(trainerEmail);
		System.out.println(trainerPhone);
		
		System.out.println("--------------");
	}

}
