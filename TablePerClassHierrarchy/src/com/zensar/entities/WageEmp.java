package com.zensar.entities;
/**
 *@author Prince Tiwari
 *@creation_date 27th Sep 2019 11.53am
 *@Modification_date 27th Sep 2019 11.53am
 *@version 1.0
 *@copyright Zensar Technologies. All rights reserved.
 *@description Persistence class
 */

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("b")
public class WageEmp extends Employee {

public WageEmp(int empId, String name, LocalDate joinDate, double salary, int hours, float rate) {
		super(empId, name, joinDate, salary);
		this.hours = hours;
		this.rate = rate;
	}
private int hours;
private float rate;
public WageEmp() {
	// TODO Auto-generated constructor stub
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public float getRate() {
	return rate;
}
public void setRate(float rate) {
	this.rate = rate;
}
@Override
public String toString() {
	return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
}
}
