package com.zensar.hibernate.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c=new Configuration().configure();
		SessionFactory f=c.buildSessionFactory();
		Session s=f.openSession();
		Transaction t=s.beginTransaction();
		Employee e=new Employee();
		e.setName("shubham");
		e.setJoinDate(LocalDate.of(2019,07,12));
		e.setSalary(50000);
		s.save(e);
		WageEmp we=new WageEmp();
		we.setName("Prankur");
		we.setJoinDate(LocalDate.of(2010, 02, 23));
		we.setSalary(45000);
		we.setHours(15);
		we.setRate(300.0f);
		s.save(we);

		t.commit();
		s.close();
	}

}
