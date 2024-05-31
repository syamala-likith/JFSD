package com.klef.jfsd.InheritanceMapping;

import javax.persistence.*;

@Entity

//Single Table Strategy
/*@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING, length = 20)
@DiscriminatorValue("person")*/

//Table per class Strategy
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

//Joined Table Stratedy
@Inheritance(strategy = InheritanceType.JOINED)
public class Person 
{
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
//	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@GeneratedValue
	
	//we need to try this and code in ss on date 12/8/23
	/*@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "sequence-name",
			parameters = {
					
			}
	)*/
	@Column(name = "pid")
	private int id;
	@Column(name = "pname",length = 100)
	private String name;
	@Column(name = "pgender",length = 10)
	private String gender;
	@Column(name = "pdob",length = 20)
	private String dob;
	@Column(name = "pcontact",length = 20, unique = true)
	private String contact;
	@Column(name = "pcollage",length = 50)
	private String college;
	@Column(name = "pdepartment",length = 50)
	private String department;
	
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
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
}
