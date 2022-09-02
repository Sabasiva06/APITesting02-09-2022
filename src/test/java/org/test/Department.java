package org.test;

public class Department {

	private String departmentName;

	private String departmentManager;

	private String departmentNo;

	private int salary;

	public Department(String departmentName, String departmentManager, String departmentNo, int salary) {
		super();
		this.departmentName = departmentName;
		this.departmentManager = departmentManager;
		this.departmentNo = departmentNo;
		this.salary = salary;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentManager() {
		return departmentManager;
	}

	public void setDepartmentManager(String departmentManager) {
		this.departmentManager = departmentManager;
	}

	public String getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
