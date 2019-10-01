package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {
public static void main(String[] args) {
	Configuration c= new Configuration().configure();
	// heavy weight and singleton session factory
	SessionFactory f=c.buildSessionFactory();
	Session s=f.openSession();//represents database connection and lightweight 
	Transaction t=s.beginTransaction();
	//Insert new record
		//Product p= new Product(1008,"toy","Bm",800);
		//s.save(p);
	try {
Product p= s.get(Product.class,1008 );
if(p.equals(null)){
	System.out.println("Data not present");
}
else {
	System.out.println(p);
}
	}catch(NullPointerException e) {
		System.out.println(e);
	}
	
	//update a record
//	try {
//	Product p= s.get(Product.class,1008 );
//	if(p.equals(null)){
//		throw new NullPointerException();
//	}
//	else {
//		p.setPrice((int)(p.getPrice()*1.5));
//		s.update(p);
//		System.out.println("Successfully updated");
//		System.out.println("Correct price:"+p.getPrice());
//	}
//}catch(NullPointerException e) {
//	System.out.println("Data is not present");
//}	
	//Delete record
	Product p= s.get(Product.class,1008 );
	if(p!=null) {
		s.delete(p);
	}
	else {
		System.out.println("record not found");
	}
	
	
	t.commit();
	s.close();
	
	

}
}

