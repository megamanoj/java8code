package com.test.collections;

public class Employee {

	private String empName;
	private Integer empNo;

	

	public Employee(String empName, Integer empNo) {
		super();
		this.empName = empName;
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empNo=" + empNo + "]";
	}

}
