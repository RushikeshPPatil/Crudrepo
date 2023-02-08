package com.sasken.crudoperation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class SaveEmployee {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		// ====================================================================
		Employee emp1 = new Employee();
		emp1.setFName("Raj");
		emp1.setLName("Verma");
		emp1.setEmail("raj.verma@imagine.com");
		emp1.setAge(35);
		Employee emp2 = new Employee();
		emp2.setFName("vaibhav");
		emp2.setLName("telang");
		emp2.setEmail("v.telang@futureready.com");
		emp2.setAge(29);
		Employee emp3 = new Employee();
		emp3.setFName("ketan");
		emp3.setLName("bahadur");
		emp3.setEmail("k.bahadur@infonext.com");
		emp3.setAge(32);
		Employee emp4 = new Employee();
		emp4.setFName("abhishek");
		emp4.setLName("raj");
		emp4.setEmail("abhi.raj@softsol.com");
		emp4.setAge(30);

		// ====================================================================

		Transaction t = session.beginTransaction();

		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);

		t.commit();
		session.close();
		factory.close();
	}
}
