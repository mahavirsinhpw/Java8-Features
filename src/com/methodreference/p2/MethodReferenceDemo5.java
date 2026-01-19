package com.methodreference.p2;

interface Test {
	public Course test(int a, String b, String c, String d);
}

class Course {

	private int courseId;
	private String courseName;
	private String duration;
	private String trainer;

	public Course(int courseId, String courseName, String duration, String trainer) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", trainer="
				+ trainer + "]";
	}

	public Course() {
		super();
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

}

public class MethodReferenceDemo5 {

	public static void main(String[] args) {

		// Lambda
		Test test = (a, b, c, d) -> {
			Course course = new Course(a, b, c, d);
			return course;
		};
		Course c = test.test(01, "Java", "8 months", "Som");
		System.out.println(c);

		// Method Reference
		Test test1 = Course::new;
		Course c1 = test1.test(02, "devops", "6 months", "som");
		System.out.println(c1);

	}

}
