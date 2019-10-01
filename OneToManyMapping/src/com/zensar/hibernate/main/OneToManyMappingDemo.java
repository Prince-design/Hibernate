package com.zensar.hibernate.main;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;


public class OneToManyMappingDemo {
public static void main(String[] args) {
	Configuration c= new Configuration().configure();
	SessionFactory f= c.buildSessionFactory();
	Session s=f.openSession();
	Transaction t=s.beginTransaction();
	Movie m=new Movie();
m.setTitle("A");
m.setReleaseDate(LocalDate.of(1999, 01, 12));
	
	Song s1=new Song("MAd about you");
	Song s2=new Song("Cant help falling in love");
	Song s3=new Song("Kodalin");
	s1.setMovie(m);
	s2.setMovie(m);
	s3.setMovie(m);
	List<Song> songs= new ArrayList<Song>();
	songs.add(s1);
	songs.add(s2);
	songs.add(s3);
	m.setSongs(songs);
	s.save(s1);
	s.save(s2);
	s.save(s3);
	s.save(m);
	t.commit();
	s.close();
}
}
 