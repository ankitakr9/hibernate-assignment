package org.jsp.assignmt2;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class SaveUser1 {
	public static void main(String[] args) {

		Configuration conf = new Configuration();

		conf.configure();

		SessionFactory sef = conf.buildSessionFactory();

		Session ses = sef.openSession();

		Transaction tran = ses.getTransaction();

		tran.begin();

		User u = new User();

		System.out.println("Enter Name: ");
		u.setName(new Scanner(System.in).next());

		System.out.println("Enter Phone: ");
		u.setPhone(new Scanner(System.in).nextLong());

		System.out.println("Enter Email: ");
		u.setEmail(new Scanner(System.in).next());

		System.out.println("Enter Password: ");
		u.setPassword(new Scanner(System.in).next());
		
		System.out.println("Enter designation: ");
		u.setDesignation(new Scanner(System.in).next());
		
		System.out.println("Enter Salary: ");
		u.setSalary(new Scanner(System.in).nextDouble());

		

		ses.save(u);

		tran.commit();

		System.out.println("User saved successfully.");

	}
}
