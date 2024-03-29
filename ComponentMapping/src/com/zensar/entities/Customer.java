package com.zensar.entities;

import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.Nullable;


/**
 *@author Prince Tiwari
 *@creation_date 26th Sep 2019 2.59pm
 *@Modification_date 26th Sep 2019 2.59pm
 *@version 1.0
 *@copyright Zensar Technologies. All rights reserved.
 *@description Persistence class
 */
@Entity
@Table (name="Customer")
public class Customer {
	@Id
	 @Column (name="cid")
	private int customerId;
	private Name customerName;
	private String gender;
	private int age;
	@Column(nullable=false)
	private String address;
	private LocalDate birthDate;
	private Blob profilePhoto;
	private Clob description;
	 public Customer() 
	{
		 
	 }

	public Customer(int customerId, Name customerName, String gender, int age, String address) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.gender = gender;
	this.age = age;
	this.address = address;
}

	
 {
	// TODO Auto-generated constructor stub
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public Name getCustomerName() {
	return customerName;
}
public void setCustomerName(Name customerName) {
	this.customerName = customerName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender + ", age="
			+ age + "]";
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public LocalDate getBirthDate() {
	return birthDate;
}

public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
}

public Blob getProfilePhoto() {
	return profilePhoto;
}

public void setProfilePhoto(Blob profilePhoto) {
	this.profilePhoto = profilePhoto;
}

public Clob getDescription() {
	return description;
}

public void setDescription(Clob description) {
	this.description = description;
}
}
