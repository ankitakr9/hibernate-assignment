package org.jsp.assignmt2;



import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FindUserById3 {

	public static void main(String[] args) {

		Configuration conf = new Configuration();

		conf.configure();

		SessionFactory sef = conf.buildSessionFactory();

		Session ses = sef.openSession();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the ID: ");

		int id = sc.nextInt();

		User u = ses.get(User.class, id);

		if(u != null) {

			System.out.println(u);

		}else {

			System.err.println("No record found.");

		}

	}
}
