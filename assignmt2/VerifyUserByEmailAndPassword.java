package org.jsp.assignmt2;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class VerifyUserByEmailAndPassword {

	public static void main(String[] args) {

		Configuration conf = new Configuration();

		conf.configure();

		SessionFactory sef = conf.buildSessionFactory();

		Session ses = sef.openSession();

		

		Query<User> q = ses.createQuery("select u from User u where u.email=?1 and u.password=?2");

		System.out.println("Enter the Email: ");
		q.setParameter(1, new Scanner(System.in).next());

		System.out.println("Enter the Password: ");
		q.setParameter(2, new Scanner(System.in).next());

		try {

			User u = q.getSingleResult();

			System.out.println("User verified successfully.");
			System.out.println(u);

		} catch (Exception e) {

			System.err.println("Invalid email or password.");

		}

	}
}
