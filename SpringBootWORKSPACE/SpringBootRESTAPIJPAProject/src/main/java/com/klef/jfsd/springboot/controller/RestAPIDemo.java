package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.services.CustomerService;

@RestController
@RequestMapping("customer") //GET is default method
public class RestAPIDemo 
{
	@Autowired
	private CustomerService service;
	
	@GetMapping("/")
	public String demo()
	{
		return "Spring Boot with Rest API and JPA Demo";
	}
	
	@PostMapping("add")
	public String addcustomer(@RequestBody Customer c)
	{
		return service.addcustomer(c);
	}
	
	@GetMapping("viewall")
	public List<Customer> viewallcustomers()
	{
		return service.viewallcustomers();
	}
	
	@PutMapping("update")
	public String updatecustomer(@RequestBody Customer c)
	{
		return service.updatecustomer(c);
	}
	
	@GetMapping("view")
	public Customer viewcustomerbyid(@RequestParam("id") int cid)
	{
		return service.viewcustomerbyid(cid);
	}
	
	@DeleteMapping("delete")
	public String deletecustomer(@RequestParam("id") int cid)
	{
		return service.deletecustomer(cid);
	}
}