package org.jsp.assignmt2;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCFG {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();//returntype of this method is configuration
		System.out.println("loaded");
		SessionFactory sef = conf.buildSessionFactory();
		System.out.println(sef);
	}
}
