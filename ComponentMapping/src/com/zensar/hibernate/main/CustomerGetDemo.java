package com.zensar.hibernate.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class CustomerGetDemo {
public static void main(String[] args) {
	Configuration c=new Configuration().configure();
	SessionFactory f=c.buildSessionFactory();
	Session s=f.openSession();
	Transaction t=s.beginTransaction();
	Customer customer=s.get(Customer.class, 104);
	System.out.println(customer.getCustomerName());
	System.out.println(customer.getCustomerId());
	System.out.println(customer.getGender());
	System.out.println(customer.getBirthDate());
	System.out.println(customer.getAge());
	System.out.println(customer.getAddress());
	Name customername=customer.getCustomerName();
	System.out.println(customername);
	Blob customerphoto =customer.getProfilePhoto();
		try {
			InputStream in= customerphoto.getBinaryStream();
			int data=0;
			FileOutputStream fout= new FileOutputStream(".\\resources\\newcustomer_pic1.jfif");
			while((data=in.read())!=-1) {
				fout.write(data);
			}
			in.close();
			fout.close();
			Clob description =customer.getDescription();
			Reader r=description.getCharacterStream();
			PrintWriter pw= new PrintWriter(".\\resources\\customerdbinfo.txt");
			int chardata= 0;
			while((chardata=r.read())!=-1) {
				pw.print((char)chardata);
			}
			r.close();
			pw.close();
			t.commit();
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
