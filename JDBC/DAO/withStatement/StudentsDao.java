package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentsDao {
	
	public void insertData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSL = false", "root", "password");
		
		Statement stm = c.createStatement();
		stm.executeUpdate("insert into students values(5, 'rajesh', 23)");
		c.close();
	}
	
	public void updateData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSL = false", "root", "password");
		
		Statement stm = c.createStatement();
		stm.executeUpdate("update students set name = 'salmon' where name = 'salman'");
		c.close();
	}
	
	public void deleteData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSL = false", "root", "password");
		
		Statement stm = c.createStatement();
		stm.executeUpdate("delete from students where name = 'ruturaj'");
		c.close();
	}
	
	public void getData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSL = false", "root", "password");
		
		Statement stm = c.createStatement();
		ResultSet rs = stm.executeQuery("select * from students");
		while(rs.next()) {
			System.out.println("id: "+rs.getInt(1)+" name: "+rs.getString(2)+" age: "+rs.getInt(3)+"\n");
		}
		c.close();
	}

}
