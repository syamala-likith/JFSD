package com.klef.jfsd.CRUDOperations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student 
{
	@Id
	private int id;
	@Column(name = "sname", length = 30, nullable = false)
	private String name;
	@Column(name = "sgender", length = 10, nullable = false)
	private String gender;
	@Column(name = "sdob", length = 30, nullable = false)
	private String dateofbirth;
	@Column(name = "scollege", length = 30, nullable = false)
	private String college;
	@Column(name = "sdepartment", length = 30, nullable = false)
	private String department;
	@Column(name = "scgpa", precision = 4, scale = 2, nullable = false)
	private double cgpa;
	@Column(name = "sbacklogs", nullable = false)
	private int backlogs;
	@Column(name = "scontact", length = 20, nullable = false, unique = true)
	private String contact;
	
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public int getBacklogs() {
		return backlogs;
	}
	public void setBacklogs(int backlogs) {
		this.backlogs = backlogs;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
