package org.jsp.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdaByUsingSaveOrUpdate {
	public static void main(String[] args) {
		Configuration conf = new Configuration();

		conf.configure();

		SessionFactory sef = conf.buildSessionFactory();

		Session ses = sef.openSession();
		Transaction tran=ses.getTransaction();
		//when id is present
//		tran.begin();
//		Employee e=new Employee();
//		e.setId(2);
//		e.setName("Shan");
//		ses.saveOrUpdate(e);
//		tran.commit();
		
		//when id is not present then it will insert that record but one thing i need to change in Generator i need to use assigned class to update mannually
		tran.begin();
		Employee e=new Employee();
		e.setId(10);
		e.setName("Anshika");
		e.setSalary(55000.0);
		ses.saveOrUpdate(e);//insert this record
		tran.commit();

	}
}
