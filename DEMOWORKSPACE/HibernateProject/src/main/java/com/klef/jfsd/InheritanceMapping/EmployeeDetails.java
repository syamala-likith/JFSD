package com.klef.jfsd.InheritanceMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class EmployeeDetails 
{
	@Column(name = "eid")
	private int eid;
	@Column(name = "ename",length = 100)
	private String name;
	@Column(name = "eage",precision = 4, scale = 2)
	private double eage;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getEage() {
		return eage;
	}
	public void setEage(double eage) {
		this.eage = eage;
	}
	
}
