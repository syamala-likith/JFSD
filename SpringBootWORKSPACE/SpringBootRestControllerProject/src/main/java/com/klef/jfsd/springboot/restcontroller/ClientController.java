package com.klef.jfsd.springboot.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController 
{
	
	List<Customer> customerlist = new ArrayList<Customer>();
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String demo()
	{
		return "JFSD S55 Section";
	}
	
	@RequestMapping(path = "demo1") //GET is default method
	public int demo1()
	{
		return 4654;
	}
	
	@RequestMapping("demo2")
	public double demo2()
	{
		return 15000.50;
	}
	
	@GetMapping("demo3")
	public String demo3()
	{
		return "<font color=red size=+3> Hello Spring Boot ❤️</font>";
	}
	
	@GetMapping("demo4")
	public String demo4()
	{
		String name="Likith";
		return "My name is: "+name;
	}
	
	@GetMapping("demo5/{id}")
	public int demo5(@PathVariable("id") int eid)
	{
		return eid;
	}
	
	@GetMapping("demo6/{a}/{b}")
	public String demo6(@PathVariable("a") int x, @PathVariable("b") int y)
	{
		return "Output: "+(x+y);
	}
	
	@GetMapping("demo7")
	public String demo7(@RequestParam("id") int eid)
	{
		return "ID: "+eid;
	}
	
	@GetMapping("demo8/{name}")
	public String demo8(@PathVariable("name") String name)
	{
		return "Name: "+name;
	}
	
	@GetMapping("demo9")
	public String demo9(@RequestParam("firstname") String fname, @RequestParam("lastname") String lname)
	{
		return "Full Name: "+fname+" "+lname;
	}
	
	@PostMapping("addcustomer")
	public String addaction(@RequestBody Customer c)
	{
		customerlist.add(c);
		return "Customer Added Succesfully";
	}
	
	@GetMapping("viewcustomers")
	public List<Customer> view()
	{
		return customerlist;
	}
}
