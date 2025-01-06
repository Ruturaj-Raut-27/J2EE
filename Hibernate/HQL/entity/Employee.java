package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empID;
	private String name;
	private String Dept;
	private int salary;

	public Employee() {

	}

	public Employee(int empID, String name, String dept, int salary) {
		super();
		this.empID = empID;
		this.name = name;
		Dept = dept;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", Dept=" + Dept + ", salary=" + salary + "]";
	}

}
