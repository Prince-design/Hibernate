package com.zensar.entities;
/**
 *@author Prince Tiwari
 *@creation_date 27th Sep 2019 3.00pm
 *@Modification_date 27th Sep 2019 3.00pm
 *@version 1.0
 *@copyright Zensar Technologies. All rights reserved.
 *@description Persistence class
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Country {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
private int countryId;
private String name;
private String language;
private long population;
@OneToOne
//nColumn(name="flag_id")
private Flag flag;
public int getCountryId() {
	return countryId;
}
public void setCountryId(int countryId) {
	this.countryId = countryId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public long getPopulation() {
	return population;
}
public void setPopulation(long population) {
	this.population = population;
}
public Flag getFlag() {
	return flag;
}
public void setFlag(Flag flag) {
	this.flag = flag;
}
}
