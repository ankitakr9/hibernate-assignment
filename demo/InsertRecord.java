package org.jsp.demo;


import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertRecord {

    public static void main(String[] args) {

        Configuration conf = new Configuration();

        conf.configure();

        SessionFactory sef = conf.buildSessionFactory();

        Session ses = sef.openSession();

        Transaction tran = ses.getTransaction();

        tran.begin();

        Employee e = new Employee();

        e.setName("Ankita");
        e.setSalary(95000.0);

        ses.save(e);


        Employee e1 = new Employee();

        e1.setName("Manisha");
        e1.setSalary(30000.0);

        ses.save(e1);


        Employee e2 = new Employee();

        e2.setName("Nandu");
        e2.setSalary(40000.0);

        ses.save(e2);


        Employee e3 = new Employee();

        e3.setName("Anshi");
        e3.setSalary(80000.0);

        ses.save(e3);


        tran.commit();

        ses.close();
        sef.close();
    }
}