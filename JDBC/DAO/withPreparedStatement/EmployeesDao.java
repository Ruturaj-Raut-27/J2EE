package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeesDao {

	@SuppressWarnings("resource")
	public void insertData() throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSl = false", "root", "password");

		PreparedStatement stm = c.prepareStatement("insert into employees(name, salary) values(?, ?);");
		System.out.println("enter name:");
		stm.setString(1, sc.nextLine());
		System.out.println("Enter salary:");
		stm.setDouble(2, sc.nextDouble());
		stm.executeUpdate();
//		c.close();
//		sc.close();
	}

	@SuppressWarnings("resource")
	public void updateData() throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSl = false", "root", "password");

		PreparedStatement stm = c.prepareStatement("update employees set name = ? where name = ?;");
		System.out.println("Enter old name:");
		stm.setString(2, sc.nextLine());
		System.out.println("Enter new name:");
		stm.setString(1, sc.nextLine());
		stm.executeUpdate();
//		c.close();
//		sc.close();
	}

	@SuppressWarnings("resource")
	public void deleteData() throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSl = false", "root", "password");

		PreparedStatement stm = c.prepareStatement("delete from employees where id = ?;");
		System.out.println("Enter id of employee which you want to remove:");
		stm.setInt(1, sc.nextInt());
		stm.executeUpdate();
//		c.close();
//		sc.close();
	}

	public void getData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSl = false", "root", "password");

		PreparedStatement stm = c.prepareStatement("select * from employees;");
		ResultSet rs = stm.executeQuery();

		while (rs.next()) {
			System.out.println(
					"id: " + rs.getInt(1) + " name: " + rs.getString(2) + " salary: " + rs.getDouble(3) + "\n");
		}
//		c.close();
	}

}
