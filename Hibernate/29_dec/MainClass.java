package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(College.class);
		cfg.addAnnotatedClass(Teacher.class);
		cfg.addAnnotatedClass(Organization.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Employee e = new Employee();
		Student s = new Student();
		College c = new College();
		Teacher t = new Teacher();
		Organization o = new Organization();
		
		System.out.println("Application Started!");

	}

}
