package com.optionalclass2;

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

public class OptionalClassDemo20 {

	public static void main(String[] args) {

		System.out.println("--------------");

		Student st2 = new Student("deepika", "dp@123", 222, null);
		String trainerName = "no trainer name ";
		String trainerEmail = "no tariner email";
		String trainerPhone = "no phone ";

		if (st2 != null) {
			Course course = st2.getCourse();
			if (course != null) {
				Trainer trainer = course.getTrainer();
				if (trainer != null) {
					trainerName = trainer.getName();
					trainerEmail = trainer.getEmail();
					trainerPhone = trainer.getPhone();
				}
			}
		}

		System.out.println(trainerName);
		System.out.println(trainerEmail);
		System.out.println(trainerPhone);

		System.out.println("--------------");

	}

}
