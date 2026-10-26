package org.jsp.assignmt2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchPhoneOfAllUsers {

	public static void main(String[] args) {

		Configuration conf = new Configuration();

		conf.configure();

		SessionFactory sef = conf.buildSessionFactory();

		Session ses = sef.openSession();

		Query<Long> q = ses.createQuery(
				"select u.phone from User u");

		List<Long> phone = q.getResultList();

		if(phone.size()>0) {

			for(Long p:phone) {

				System.out.println(p);

			}

		}else {

			System.err.println("No record found.");

		}

	}
}
