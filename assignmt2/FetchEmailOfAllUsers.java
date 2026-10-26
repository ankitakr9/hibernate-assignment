package org.jsp.assignmt2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchEmailOfAllUsers {

	public static void main(String[] args) {

		Configuration conf = new Configuration();

		conf.configure();

		SessionFactory sef = conf.buildSessionFactory();

		Session ses = sef.openSession();

		Query<String> q = ses.createQuery("select u.email from User u");

		List<String> email = q.getResultList();

		if(email.size()>0) {

			for(String e:email) {

				System.out.println(e);

			}

		}else {
			System.err.println("No record found.");

		}

	}
}