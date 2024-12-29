package com.jbk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {

	@Id
	private int college_code;
	private String name;
	private String address;
	private String departments;

	public College() {

	}

	public College(int college_code, String name, String address, String departments) {
		super();
		this.college_code = college_code;
		this.name = name;
		this.address = address;
		this.departments = departments;
	}

	public int getCollege_code() {
		return college_code;
	}

	public void setCollege_code(int college_code) {
		this.college_code = college_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "College [college_code=" + college_code + ", name=" + name + ", address=" + address + ", departments="
				+ departments + "]";
	}

}
