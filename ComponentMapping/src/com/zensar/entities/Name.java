package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *@author Prince Tiwari
 *@creation_date 26th Sep 2019 2.50pm
 *@Modification_date 26th Sep 2019 2.50pm
 *@version 1.0
 *@copyright Zensar Technologies. All rights reserved.
 *@description 
 *
 */
@Embeddable
public class Name {
	@Column(name="first", length=30)
	private String firstname;
	private String middlename;
	private String lastname;
public Name(String firstname, String middlename, String lastname) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
	}

public Name() {
	// TODO Auto-generated constructor stub
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getMiddlename() {
	return middlename;
}
public void setMiddlename(String middlename) {
	this.middlename = middlename;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
@Override
public String toString() {
	return "Name [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + "]";
}
	
}

