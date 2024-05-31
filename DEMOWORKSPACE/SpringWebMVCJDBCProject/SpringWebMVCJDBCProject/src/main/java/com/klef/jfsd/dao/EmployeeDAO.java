package com.klef.jfsd.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.klef.jfsd.model.Employee;

@Repository
public interface EmployeeDAO 
{
   public int AddEmployee(Employee emp);  // insert query
   public int UpdateEmployee(Employee emp);  // update query
   public int DeleteEmployee(int id);  // delete query
   public List<Employee> ViewAllEmployees();  // select * from employee_table
}
