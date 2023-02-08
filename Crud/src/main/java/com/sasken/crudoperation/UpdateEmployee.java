package com.sasken.crudoperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Employee emp = session.get(Employee.class, 3);
		emp.setFName("sunil");
		session.update(emp);

		t.commit();
		session.close();
		factory.close();

	}

}
