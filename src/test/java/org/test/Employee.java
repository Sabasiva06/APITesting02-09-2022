package org.test;

import java.util.List;

public class Employee {

	private String empName;

	private long empNo;

	private int empId;

	private Address address;
	
	

	public Employee(String empName, long empNo, int empId, Address address) {
		super();
		this.empName = empName;
		this.empNo = empNo;
		this.empId = empId;
		this.address = address;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpNo() {
		return empNo;
	}

	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
