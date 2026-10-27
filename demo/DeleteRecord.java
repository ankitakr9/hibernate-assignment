package org.jsp.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecord {
	public static void main(String[] args) {
		Configuration conf = new Configuration();

		conf.configure();

		SessionFactory sef = conf.buildSessionFactory();

		Session ses = sef.openSession();
		Transaction tran=ses.getTransaction();
		//when id is present
		tran.begin();
		Employee e=ses.get(Employee.class, 11);
		if(e!=null) {
			ses.delete(e);
			tran.commit();
		}
		else {
			System.err.println("No record found");
		}	}
}
