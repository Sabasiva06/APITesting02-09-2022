package org.sample;

import java.util.List;

public class Employee {

	private String employeeName;
	private String employeeEmail;
	private long number;
	private List<String> course;
	private List<Student> students;
	private StuDetails stuDetails;

	
	public Employee(String employeeName, String employeeEmail, long number, List<String> course, List<Student> students,
			StuDetails stuDetails) {
		super();
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.number = number;
		this.course = course;
		this.students = students;
		this.stuDetails = stuDetails;
	}

	public StuDetails getStuDetails() {
		return stuDetails;
	}

	public void setStuDetails(StuDetails stuDetails) {
		this.stuDetails = stuDetails;
	}

	public List<Student> getStudents() {
		return students;
	}

	

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

}
