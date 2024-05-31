package com.klef.jfsd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.dao.EmployeeDAO;
import com.klef.jfsd.model.Employee;

@Controller
public class ClientController 
{
	@Autowired  
	private EmployeeDAO dao;
	  
    @GetMapping("home")
    public String indexdemo()
    {
    	return "index";
    }
    
    @GetMapping("addemp")
    public ModelAndView addemployeedemo()
    {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("addemployee"); //addemployee is jsp file name
    	return mv;
    }
    
    @GetMapping("updateemp")
    public ModelAndView updateemployeedemo()
    {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("updateemployee"); //updateemployee is jsp file name
    	List<Employee> emplist = dao.ViewAllEmployees();
    	mv.addObject("empdata", emplist);
    	return mv;
    }
    
    @GetMapping("viewallemps")
    public ModelAndView viewallempsdemo()
    {
    	List<Employee> emplist = dao.ViewAllEmployees();
    	ModelAndView mv = new ModelAndView("viewallemps");
    	mv.addObject("empdata", emplist);
    	return mv;
    }
    
    @GetMapping("deleteemp")
    public ModelAndView deleteemployeedemo()
    {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("deleteemployee"); //deleteemployee is jsp file name
    	List<Employee> emplist =  dao.ViewAllEmployees();
    	mv.addObject("empdata", emplist);
    	return mv;
    }
    
    @PostMapping("insertemp")
    public ModelAndView insertempdemo(HttpServletRequest request)
    {
    	String eid = request.getParameter("id");
    	
    	int id = Integer.parseInt(eid);
    	String name=request.getParameter("name");
    	String gender=request.getParameter("gender");
    	String dept = request.getParameter("dept");
    	
    	String sal = request.getParameter("salary");
    	
    	double salary = Double.parseDouble(sal);
    	String location = request.getParameter("location");
    	String contact = request.getParameter("contactno");
    	
    	Employee emp = new Employee();
    	emp.setId(id);
    	emp.setName(name);
    	emp.setGender(gender);
    	emp.setDepartment(dept);
    	emp.setSalary(salary);
    	emp.setLocation(location);
    	emp.setContactno(contact);
    
    	int n = dao.AddEmployee(emp);
    	
    	String msg=null;
    	
    	if(n>0)
    	{
    		 msg = "Employee Added Successfully";
    	}
    	else
    	{
    		msg = "Fail to Add Employee";
    	}
    	
    	ModelAndView mv = new ModelAndView("displaymessage");
    	mv.addObject("message",msg);
    	
       return mv;
    }
    
    @GetMapping("delete/{id}")
    public String deleteaction(@PathVariable("id") int eid)
    {
      dao.DeleteEmployee(eid);
      return "redirect:/deleteemp";
    }
    
    @GetMapping("empupdate")
    public ModelAndView empupdatedemo(@RequestParam("id") int eid)
    {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("updateempinfo");
    	mv.addObject("eid",eid);
    	return mv;
    }
    
    @PostMapping("update")
    public ModelAndView updatedemo(HttpServletRequest request)
    {
    	String id = request.getParameter("id");
    	int eid = Integer.parseInt(id);
    	String name = request.getParameter("name");
    	String sal = request.getParameter("salary");
    	double salary = Double.parseDouble(sal);
    	String location = request.getParameter("location");
    	
    	Employee emp = new Employee();
    	emp.setId(eid);
    	emp.setName(name);
    	emp.setSalary(salary);
    	emp.setLocation(location);
    	
    	int n = dao.UpdateEmployee(emp);
    	
        String msg=null;
    	
    	if(n>0)
    	{
    		 msg = "Employee Updated Successfully";
    	}
    	else
    	{
    		msg = "Fail to Update Employee";
    	}
    	
    	
    	ModelAndView mv = new ModelAndView("updateemployee");
    	mv.addObject("message", msg);
    	List<Employee> emplist = dao.ViewAllEmployees();
    	mv.addObject("empdata",emplist);
    	return mv;
    }
    
}
