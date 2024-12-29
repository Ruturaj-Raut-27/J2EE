package com.jbk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Organization {

	@Id
	private int org_id;
	private String name;
	private String departments;
	private String address;

	public Organization() {

	}

	public Organization(int org_id, String name, String departments, String address) {
		super();
		this.org_id = org_id;
		this.name = name;
		this.departments = departments;
		this.address = address;
	}

	public int getOrg_id() {
		return org_id;
	}

	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Organization [org_id=" + org_id + ", name=" + name + ", departments=" + departments + ", address="
				+ address + "]";
	}
}
