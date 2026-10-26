package org.jsp.assignmt2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchAllUsers {

	public static void main(String[] args) {

		Configuration conf = new Configuration();

		conf.configure();

		SessionFactory sef = conf.buildSessionFactory();

		Session ses = sef.openSession();

		Query<User> q = ses.createQuery("select u from User u");

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
