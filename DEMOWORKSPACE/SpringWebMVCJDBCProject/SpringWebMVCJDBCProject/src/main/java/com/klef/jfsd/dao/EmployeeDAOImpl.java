package com.klef.jfsd.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.klef.jfsd.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() 
	{
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int AddEmployee(Employee emp)
	{
		String qry = "insert into employee_table values(?,?,?,?,?,?,?)";
		int n = jdbcTemplate.update(qry, emp.getId(), emp.getName(), emp.getGender(), emp.getDepartment(), emp.getSalary(), emp.getLocation(),emp.getContactno());
		return n;
	}

	@Override
	public int UpdateEmployee(Employee emp) 
	{
		String qry = "update employee_table set name=?, location=?, salary=? where id=?";
		int n = jdbcTemplate.update(qry, emp.getName(), emp.getLocation(), emp.getSalary(), emp.getId());
		return n;
	}

	@Override
	public int DeleteEmployee(int id) 
	{
		String qry = "delete from employee_table where id=?";
		int n = jdbcTemplate.update(qry, id);
		return n;
	}

	@Override
	public List<Employee> ViewAllEmployees() 
	{
		String qry = "select * from employee_table";
		List<Employee> emplist = jdbcTemplate.query(qry, new BeanPropertyRowMapper(Employee.class));
		return emplist;
	}
	
}
