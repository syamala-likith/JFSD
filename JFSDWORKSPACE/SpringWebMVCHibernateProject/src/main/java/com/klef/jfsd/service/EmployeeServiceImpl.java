package com.klef.jfsd.service;

import java.util.List;

import com.klef.jfsd.dao.EmployeeDAO;
import com.klef.jfsd.model.Employee;

public class EmployeeServiceImpl implements EmployeeService
{

	private EmployeeDAO employeeDAO;
	
	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public String AddEmployee(Employee emp) 
	{
		return employeeDAO.AddEmployee(emp);
	}

	@Override
	public String UpdateEmployee(Employee emp) 
	{
		return employeeDAO.UpdateEmployee(emp);
	}

	@Override
	public String DeleteEmployee(int id) 
	{
		return employeeDAO.DeleteEmployee(id);
	}

	@Override
	public List<Employee> ViewAllEmployees() 
	{
		return employeeDAO.ViewAllEmployees();
	}

	@Override
	public Employee ViewEmployeeByID(int id) 
	{
		return employeeDAO.ViewEmployeeByID(id);
	}

}
