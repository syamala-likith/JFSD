package com.klef.jfsd.HQL;

import javax.persistence.*;

@Entity
@Table(name = "customer_table")
public class Customer 
{
	@Id
	private int id;
	@Column(length = 20 ,nullable = false)
	private String name;
	@Column(length = 10 ,nullable = false)
	private String gender;
	@Column(nullable = false)
	private float age;
	@Column(nullable = false, precision = 10, scale = 4)
	private double salary;
	@Column(length = 20 ,unique = true ,nullable = false)
	private String email;
	@Column(length = 20 ,nullable = false)
	private String password;
	@Column(length = 20 , unique = true,nullable = false)
	private String contact;
	@Column(nullable = false)
	private boolean maritalstatus;
	
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
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public boolean isMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(boolean maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary
				+ ", email=" + email + ", password=" + password + ", contact=" + contact + ", maritalstatus="
				+ maritalstatus + "]";
	}
	
}
