package com.service;

import com.dao.StudentsDao;

public class StudentsService {
	
	public void insertData() throws Exception {
		StudentsDao sd = new StudentsDao();
		System.out.println("Service!");
		sd.insertData();
	}
	
	public void updateData() throws Exception {
		StudentsDao sd = new StudentsDao();
		System.out.println("Service!");
		sd.updateData();
	}
	
	public void deleteData() throws Exception {
		StudentsDao sd = new StudentsDao();
		System.out.println("Service!");
		sd.deleteData();
	}
	
	public void getData() throws Exception {
		StudentsDao sd = new StudentsDao();
		System.out.println("Service!");
		sd.getData();
	}

}
