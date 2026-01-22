package com.streamapi3;

public class Student {
	private int id;
	private String name;
	private long phone;
	private String courseName;
	private double feePaid;
	private double feebal;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id,String name, long phone, String courseName, double feePaid, double feebal) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.courseName = courseName;
		this.feePaid = feePaid;
		this.feebal = feebal;
	}
	
	public int getId() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFeePaid() {
		return feePaid;
	}
	public void setFeePaid(double feePaid) {
		this.feePaid = feePaid;
	}
	public double getFeebal() {
		return feebal;
	}
	public void setFeebal(double feebal) {
		this.feebal = feebal;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", courseName=" + courseName + ", feePaid="
				+ feePaid + ", feebal=" + feebal + "]";
	}
	
	
	
}
