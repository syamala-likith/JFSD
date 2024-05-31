package com.klef.jfsd.InheritanceMapping;

import javax.persistence.*;

@Entity
public class EmployeeOfficeData extends EmployeeDetails
{
	@Column(name = "cabinno",length = 20)
	private String cabinno;
	@Column(name = "floor", length = 20)
	private String floor;
	
	public String getCabinno() {
		return cabinno;
	}
	public void setCabinno(String cabinno) {
		this.cabinno = cabinno;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	
}
