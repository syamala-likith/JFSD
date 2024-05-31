package com.klef.jfsd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.jfsd.model.Employee;

@Service
public interface EmployeeService  
{
	public String AddEmployee(Employee emp);
	public String UpdateEmployee(Employee emp);
	public String DeleteEmployee(int id);
	public List<Employee> ViewAllEmployees();
	public Employee ViewEmployeeByID(int id);
}
