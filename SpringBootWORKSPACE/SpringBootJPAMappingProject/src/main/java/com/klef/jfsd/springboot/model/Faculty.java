package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="faculty_table")
public class Faculty 
{
  @Id
  private int id;
  
  @Column(nullable = false)
  private String name;
  
  @Column(nullable = false)
  private String designation;
  
  @Column(nullable = false)
  private String department;
  
  @Column(nullable = false,unique = true)
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

public String getDesignation() {
  return designation;
}

public void setDesignation(String designation) {
  this.designation = designation;
}

public String getDepartment() {
  return department;
}

public void setDepartment(String department) {
  this.department = department;
}

public String getContact() {
  return contact;
}

public void setContact(String contact) {
  this.contact = contact;
}

@Override
public String toString() {
  return "Faculty [id=" + id + ", name=" + name + ", designation=" + designation + ", department=" + department
      + ", contact=" + contact + "]";
}
}