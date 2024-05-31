package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.Employee;

public interface AdminService 
{
  public List<Employee> viewallemps();
  public Employee viewempbyid(int eid);
  public String deleteemp(int eid);
  public Admin checkadminlogin(String uname,String pwd);
  
  public String addcustomer(Customer c);
  public long employeecount();  // count(*)
  public long customercount();  // count(*)
  public int updatestatus(int eid,boolean status);
}
