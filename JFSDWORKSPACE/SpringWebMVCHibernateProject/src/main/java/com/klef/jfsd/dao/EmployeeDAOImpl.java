package com.klef.jfsd.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.klef.jfsd.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() 
	{
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) 
	{
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public String AddEmployee(Employee emp) 
	{
		hibernateTemplate.save(emp);
		return "Employee Added Successfully";
	}

	@Override
	public String UpdateEmployee(Employee emp) 
	{
		Employee e=hibernateTemplate.get(Employee.class,emp.getId());
		e.setSalary(emp.getSalary());
		e.setPassword(emp.getPassword());
		e.setContactno(emp.getContactno());
		e.setName(emp.getName());
		return "Employee Updated Successfully";
	}

	@Override
	public String DeleteEmployee(int id) 
	{
		Employee emp=hibernateTemplate.get(Employee.class,id);
		hibernateTemplate.delete(emp);
		return "Employee Deleted Successfully";
	}

	@Override
	public List<Employee> ViewAllEmployees() 
	{
		List<Employee> emplist=hibernateTemplate.loadAll(Employee.class);
		return emplist;
	}

	@Override
	public Employee ViewEmployeeByID(int id) 
	{
		Employee emp=hibernateTemplate.get(Employee.class, id);
		return emp;
	}
}
