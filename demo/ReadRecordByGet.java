package org.jsp.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadRecordByGet {
	public static void main(String[] args) {
		Configuration conf = new Configuration();

        conf.configure();

        SessionFactory sef = conf.buildSessionFactory();

        Session ses = sef.openSession();
        
        System.out.println("Enter the primary key: ");
        Employee e=ses.get(Employee.class, new Scanner(System.in).nextInt());
        System.out.println(e);
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        
	}
}
