package com.rk.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rk.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Employee e = new Employee();
		e.setEmpId(101);
		e.setEmpName("chandan");
		e.setEmpSal(20.0);
		session.save(e);
		tx.commit();

	}

}
