package com.klef.jfsd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.model.Employee;
import com.klef.jfsd.service.EmployeeService;

@Controller
public class ClientController 
{
	@Autowired
	private EmployeeService employeeService;
	
    @GetMapping("home")
    public ModelAndView indexdemo()
    {
    	ModelAndView mv = new ModelAndView("index"); // index is jsp file name
    	return mv;
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
    	List<Employee> emplist = employeeService.ViewAllEmployees();
    	mv.addObject("empdata", emplist);
    	return mv;
    }
    
    @GetMapping("empupdateinfo")
    public ModelAndView empupdateinfodemo(@RequestParam("id") int eid)
    {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("updateempinfo");
    	mv.addObject("id", eid);
    	return mv;
    }
    
    @PostMapping("update")
    public ModelAndView updateaction(HttpServletRequest request)
    {
    	String eid = request.getParameter("id");
    	int id = Integer.parseInt(eid);
      
    	String name = request.getParameter("name");
    	String sal = request.getParameter("sal");
    	double salary = Double.parseDouble(sal);
      
    	String password = request.getParameter("pwd");
    	String contactno = request.getParameter("contact");
      
    	Employee emp  = new Employee();
    	emp.setId(id);
    	emp.setName(name);
    	emp.setSalary(salary);
    	emp.setContactno(contactno);
    	emp.setPassword(password);
    	
    	String msg = employeeService.UpdateEmployee(emp);
      
    	List<Employee> emplist = employeeService.ViewAllEmployees();
      
    	ModelAndView mv = new ModelAndView("updateemployee");
    	mv.addObject("empdata", emplist);
    	mv.addObject("message", msg);
    	return mv;
    }
    
    @GetMapping("viewallemps")
    public ModelAndView viewallempsdemo()
    {
       List<Employee> emplist = employeeService.ViewAllEmployees();  
       ModelAndView mv = new ModelAndView("viewallemps");
       mv.addObject("empdata",emplist);
       return mv;
    }
   
    @GetMapping("deleteemp")
    public ModelAndView deleteemployeedemo()
    {
      ModelAndView mv = new ModelAndView();
      mv.setViewName("deleteemployee"); //deleteemployee is jsp file name
      
       List<Employee> emplist =  employeeService.ViewAllEmployees();
       
       mv.addObject("empdata", emplist);
      
      return mv;
    }
    
    @GetMapping("delete/{id}")
    public String deleteaction(@PathVariable("id") int eid)
    {
      employeeService.DeleteEmployee(eid);
      return "redirect:/deleteemp";
    }
    
    @PostMapping("insertemp")
    public ModelAndView insertempdemo(HttpServletRequest request)
    {
      String name = request.getParameter("name");
      String gender = request.getParameter("gender");
      String dateofbirth = request.getParameter("dob");
      String company = request.getParameter("company");
      String department = request.getParameter("dept");
      String sal = request.getParameter("salary");
      double salary = Double.parseDouble(sal);
      String location = request.getParameter("location");
      String status = request.getParameter("mstatus");
      boolean mstatus = Boolean.parseBoolean(status);
      String email = request.getParameter("email");
      String password = request.getParameter("pwd");
      String contact = request.getParameter("contactno");
      
      Employee emp = new Employee();
      emp.setName(name);
      emp.setGender(gender);
      emp.setDateofbirth(dateofbirth);
      emp.setCompany(company);
      emp.setDepartment(department);
      emp.setSalary(salary);
      emp.setLocation(location);
      emp.setMaritalstatus(mstatus);
      emp.setEmail(email);
      emp.setPassword(password);
      emp.setContactno(contact);
      
      
      String msg = employeeService.AddEmployee(emp);
      ModelAndView mv = new ModelAndView();
      mv.setViewName("displaymessage");
      mv.addObject("message", msg);
      
      return mv;
      
    }
    
    @GetMapping("viewemp")
    public ModelAndView viewempdemo(@RequestParam("id") int eid)
    {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("viewempbyid"); //viewempbyid is a JSP file
    	
    	Employee e = employeeService.ViewEmployeeByID(eid);
    	mv.addObject("emp", e);
    	
    	return mv;
    }
}
