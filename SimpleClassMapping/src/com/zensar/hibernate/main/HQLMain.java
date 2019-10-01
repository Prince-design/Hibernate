
package com.zensar.hibernate.main;
//Hibernate Query Language object oriented query language

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class HQLMain {
	public static void main(String[] args) {
		
	
Configuration c=new Configuration().configure();
SessionFactory f=c.buildSessionFactory();
Session s=f.openSession();//represents database connection and lightweight 
Transaction t=s.beginTransaction();
//Jpa query(Java persistent Api)
//Query q=s.createQuery("from Product");
//Query q=s.createQuery("from Product p where p.price>700 and p.price<40000");
//Query q=s.createQuery("from Product p where p.price  between 700and 40000");
//Query q=s.createQuery("from Product p where p.brand like's%'");
//Query q=s.createQuery("from Product p where p.name='Laptop'");
//List<Product> products= q.getResultList();
//for(Product cr:products) {
//	System.out.println(cr);
//}

//Query q=s.createQuery("select p.name,p.price from Product p");
//List<Object[]> objects=q.getResultList();
//for(Object[] ob:objects) {
//	for(Object cp:ob) {
//		System.out.println(cp+"\t");
//	}
//	System.out.println();
//}
Query q=s.createQuery("select max(p.price) from Product p");
int maxPrice =(int) q.getSingleResult();
System.out.println(maxPrice);
Query q1=s.createQuery("select min(p.price) from Product p");
int minPrice =(int) q1.getSingleResult();
System.out.println(minPrice);
Query q2=s.createQuery("select sum(p.price) from Product p");
long sumPrice =(long) q2.getSingleResult();
System.out.println(sumPrice);
Criteria cr=s.createCriteria(Product.class);
List<Product> products=cr.list();
for(Product cr1:products) {
	System.out.println(cr1+"\t");
}
t.commit();
s.close();
}
}
