package com.sasken.crudoperation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

public class FetchEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();
		for (Employee e : list) {
			System.out.println(
					e.getId() + " " + e.getFName() + " " + e.getLName() + " " + e.getEmail() + " " + e.getAge());

		}

		session.close();
		factory.close();

	}

}
