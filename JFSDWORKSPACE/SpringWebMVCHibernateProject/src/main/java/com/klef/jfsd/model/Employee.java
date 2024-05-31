package com.klef.jfsd.model;

import javax.persistence.*;

@Entity
@Table(name="employee_table")
public class Employee 
{
	   @Id //  Primary Key
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "employee_id")
	   private int id;
	   @Column(name = "employee_name",nullable=false,length = 100)
	   private String name;
	   @Column(name = "employee_gender",nullable=false,length = 10)
	   private String gender;
	   @Column(name = "employee_dateofbirth",nullable=false,length = 20)
	   private String dateofbirth;
	   @Column(name = "employee_company",nullable=false,length = 100)
	   private String company;
	   @Column(name = "employee_department",nullable=false,length = 100)
	   private String department;
	   @Column(name = "employee_salary",nullable=false,precision = 10,scale = 4)
	   private double salary;
	   @Column(name = "employee_location",nullable=false,length = 100)
	   private String location;
	   @Column(name = "employee_maritalstatus",nullable=false)
	   private boolean maritalstatus;
	   @Column(name = "employee_email",nullable=false,unique = true,length = 100)
	   private String email;
	   @Column(name = "employee_password",nullable=false,length = 100)
	   private String password;
	   @Column(name = "employee_contactno",nullable=false,unique = true,length = 100)
	   private String contactno;
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
		public String getDateofbirth() {
			return dateofbirth;
		}
		public void setDateofbirth(String dateofbirth) {
			this.dateofbirth = dateofbirth;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public boolean isMaritalstatus() {
			return maritalstatus;
		}
		public void setMaritalstatus(boolean maritalstatus) {
			this.maritalstatus = maritalstatus;
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
		public String getContactno() {
			return contactno;
		}
		public void setContactno(String contactno) {
			this.contactno = contactno;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", dateofbirth=" + dateofbirth
					+ ", company=" + company + ", department=" + department + ", salary=" + salary + ", location="
					+ location + ", maritalstatus=" + maritalstatus + ", email=" + email + ", password=" + password
					+ ", contactno=" + contactno + "]";
		}
}
