package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Country;
import com.zensar.entities.Flag;

public class OneToOneMappingDemo {
	public static void main(String[] args) {
		
	
	Configuration c=new Configuration().configure();
	SessionFactory f=c.buildSessionFactory();
	Session s=f.openSession();
	Transaction t=s.beginTransaction();
	Country c1=new Country();
	c1.setName("America");
	c1.setLanguage("English");
	c1.setPopulation(1300000);
	
	Flag f1=new Flag();
	f1.setFlagName("Tiranga");
	f1.setDescription("Tri colored flag");
	s.save(c1);
	s.save(f1); 
	c1.setFlag(f1);
	f1.setCountry(c1);
	t.commit();
	s.close();
	System.exit(0);
}
}