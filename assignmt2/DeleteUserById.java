package org.jsp.assignmt2;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteUserById {

	public static void main(String[] args) {

		Configuration conf = new Configuration();

		conf.configure();

		SessionFactory sef = conf.buildSessionFactory();

		Session ses = sef.openSession();
		Transaction tran = ses.getTransaction();
	    tran.begin();
	    User u = new User();
		System.out.println("Enter the ID: ");
		
		u.setId(new Scanner(System.in).nextInt());		
		ses.delete(u);
		tran.commit();

		System.out.println("User deleted successfully.");

	}
}