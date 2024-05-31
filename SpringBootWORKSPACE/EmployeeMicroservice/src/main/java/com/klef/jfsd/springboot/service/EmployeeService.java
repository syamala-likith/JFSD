package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Employee;

public interface EmployeeService 
{
  public String addemployee(Employee emp);
  public String updateemployee(Employee emp);
  public Employee viewemployeebyid(int eid);
  public Employee checkemplogin(String email,String pwd);
}
