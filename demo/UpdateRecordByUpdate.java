package org.jsp.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecordByUpdate {
	public static void main(String[] args) {
		Configuration conf = new Configuration();

		conf.configure();

		SessionFactory sef = conf.buildSessionFactory();

		Session ses = sef.openSession();
		Transaction tran=ses.getTransaction();
	//when id is present
		//tran.begin();
//		Employee e=new Employee();
//		e.setId(1);
//		e.setName("Ankita");
//		ses.update(e);
//		tran.commit();
		
		tran.begin();
		Employee e1=new Employee();
		e1.setId(10);
		e1.setName("Anshu");
		e1.setSalary(55000.0);
		ses.update(e1);//OptimisticLockException
		tran.commit();
		
	}
}
