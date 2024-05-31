package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_table")
public class Customer 
{
   @Id
   @Column(name="customer_id")
   private int id;
   @Column(name="customer_name",length=50,nullable=false)
   private String name;
   @Column(name="customer_age",nullable=false)
   private float age;
   @Column(name="customer_salary",nullable=false)
   private double salary;
   @Column(name = "customer_mstatus", nullable=false)
   private boolean mstatus; // marital status - true or false
   @Column(name="customer_location",length=50,nullable=false)
   private String location;
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getAge() {
	return age;
}
public void setAge(float age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public boolean isMstatus() {
	return mstatus;
}
public void setMstatus(boolean mstatus) {
	this.mstatus = mstatus;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
