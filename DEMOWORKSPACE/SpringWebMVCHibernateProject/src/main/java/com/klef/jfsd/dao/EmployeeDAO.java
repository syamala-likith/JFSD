package com.klef.jfsd.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.klef.jfsd.model.Employee;

@Repository
@Transactional
public interface EmployeeDAO 
{
	public String AddEmployee(Employee emp);
	public String UpdateEmployee(Employee emp);
	public String DeleteEmployee(int id);
	public List<Employee> ViewAllEmployees();
	public Employee ViewEmployeeByID(int id);
}
