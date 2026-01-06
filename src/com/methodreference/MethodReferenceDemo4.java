package com.methodreference;

interface Hi {
	public Course test(int a, String b, String c, String d);
}

class Course {
	private int id;
	private String name;
	private String duration;
	private String trainer;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String name, String duration, String trainer) {
		System.out.println("para constructor");

		this.id = id;
		this.name = name;
		this.duration = duration;
		this.trainer = trainer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duration=" + duration + ", trainer=" + trainer + "]";
	}

}

public class MethodReferenceDemo4 {
	public static void main(String[] args) {

		Hi hi = (a, b, c, d) -> {
			Course co = new Course(a, b, c, d);
			return co;
		};
		Course c = hi.test(101, "fullstack", "8 months", "som p");
		System.out.println(c);

		System.out.println("*****\n");

		Hi hi2 = Course::new;
		Course c2 = hi2.test(102, "devops", "6 months", "som p");
		System.out.println(c2);

	}
}
