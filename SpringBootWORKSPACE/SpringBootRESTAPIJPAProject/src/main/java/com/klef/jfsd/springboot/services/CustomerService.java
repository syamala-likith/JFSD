package com.klef.jfsd.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Customer;

public interface CustomerService 
{
	
	public String addcustomer(Customer customer);
	public String updatecustomer(Customer customer);
	public String deletecustomer(int id);
	public List<Customer> viewallcustomers();
	public Customer viewcustomerbyid(int id);
	

}
