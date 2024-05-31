package com.klef.jfsd.InheritanceMapping;

import javax.persistence.*;

@Entity
//@DiscriminatorValue("scholar")
public class Scholar extends Person
{
	@Column(name = "sprogarm",length = 50)
	private String program;
	@Column(name = "syear")
	private int year;
	@Column(name = "ssemester",length = 10)
	private String semester;
	@Column(name = "scgpa",precision = 4, scale = 2)
	private double cgpa;
	@Column(name = "sbacklogs")
	private int backlogs;
	@Column(name = "sresidence",length = 50)
	private String residence;
	@Column(name = "scareerchoice",length = 50)
	private String careerchoice;
	
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
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
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public String getCareerchoice() {
		return careerchoice;
	}
	public void setCareerchoice(String careerchoice) {
		this.careerchoice = careerchoice;
	}
}
