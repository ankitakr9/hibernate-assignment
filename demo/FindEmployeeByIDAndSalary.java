package org.jsp.demo;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindEmployeeByIDAndSalary {
	public static void main(String[] args) {
		Configuration conf = new Configuration();

		conf.configure();

		SessionFactory sef = conf.buildSessionFactory();

		Session ses = sef.openSession();
		Query<Employee> q=ses.createQuery("select e from Employee e where e.id=?1 and e.salary>?2");
		System.out.println("Enter the Id: ");
		q.setParameter(1, new Scanner(System.in).nextInt());
		System.out.println("Enter the salary: ");
		q.setParameter(2,new Scanner(System.in).nextDouble());
		try {
			Employee e=q.getSingleResult();
			System.out.println(e);
		}catch(NoResultException e) {
			System.err.println("No record Found");
		}
	
	}
}
