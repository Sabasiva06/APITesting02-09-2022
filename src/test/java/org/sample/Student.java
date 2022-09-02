package org.sample;

public class Student {

	private String stuName;
	private String stuEmail;
	private long Number;
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuEmail() {
		return stuEmail;
	}
	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}
	public long getNumber() {
		return Number;
	}
	public void setNumber(long number) {
		Number = number;
	}
	public Student(String stuName, String stuEmail, long number) {
		super();
		this.stuName = stuName;
		this.stuEmail = stuEmail;
		Number = number;
	}

	
}
