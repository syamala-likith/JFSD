package com.klef.jfsd.InheritanceMapping;

import javax.persistence.*;

@Entity
//@DiscriminatorValue("faculty")
public class Faculty extends Person
{
	@Column(name = "fqualification",length = 20)
	private String qualification;
	@Column(name = "fexeperience")
	private float experience;
	@Column(name = "fdesignation",length = 50)
	private String designation;
	@Column(name = "fjoiningdate",length = 20)
	private String joiningdate;
	@Column(name = "fsalary",precision = 10, scale = 4)
	private double salary;
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public float getExperience() {
		return experience;
	}
	public void setExeperience(float exeperience) {
		this.experience = exeperience;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
