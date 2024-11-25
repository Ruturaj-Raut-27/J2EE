package com.service;

import com.dao.EmployeesDao;

public class EmployeesService {

	public void insertData() throws Exception {
		EmployeesDao ed = new EmployeesDao();
		System.out.println("Employee Service!");
		ed.insertData();
	}

	public void updateData() throws Exception {
		EmployeesDao ed = new EmployeesDao();
		System.out.println("Employee Service!");
		ed.updateData();
	}

	public void deleteData() throws Exception {
		EmployeesDao ed = new EmployeesDao();
		System.out.println("Employee Service!");
		ed.deleteData();
	}

	public void getData() throws Exception {
		EmployeesDao ed = new EmployeesDao();
		System.out.println("Employee Service!");
		ed.getData();
	}
}
