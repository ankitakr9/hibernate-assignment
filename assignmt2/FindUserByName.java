package org.jsp.assignmt2;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindUserByName {

	public static void main(String[] args) {

		Configuration conf = new Configuration();

		conf.configure();

		SessionFactory sef = conf.buildSessionFactory();

		Session ses = sef.openSession();

		Query<User> q = ses.createQuery("select u from User u where u.name=?1");

		System.out.println("Enter the Name: ");

		q.setParameter(1, new Scanner(System.in).next());

		List<User> u1 = q.getResultList();

		if (u1.size() > 0) {

			for (User u : u1) {

				System.out.println(u);

			}

		} else {

			System.err.println("No record found.");

		}

	}
}
