package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("emp")
public class EmployeeController 
{
    @Autowired
   private EmployeeService employeeService;
   
   @GetMapping("/")
   @ResponseBody
   public String employee()
   {
	   return "Employee Microservice";
   }
   
   @GetMapping("home")
   public String main()
   {
	   return "main";
   }

   @GetMapping("about")
   public String about()
   {
	   return "about";
   }
   
   @GetMapping("empreg")
   public ModelAndView empregistration()
   {
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("empreg");
	   return mv;
   }
   
   @GetMapping("emplogin") // URI & method name can be different
   public ModelAndView emplogin()
   {
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("emplogin");
	   return mv;
   }
   
   @PostMapping("checkemplogin")
   public ModelAndView checkemplogin(HttpServletRequest request)
   {
	   ModelAndView mv  = new ModelAndView();
	   
	   String email = request.getParameter("email");
	   String pwd = request.getParameter("pwd");
	   
	   Employee emp = employeeService.checkemplogin(email, pwd);
	   
	   if(emp!=null)
	   {
		   //session
		   
		HttpSession session = request.getSession() ;
		
		session.setAttribute("eid",emp.getId()); // eid is a session variable
		session.setAttribute("ename", emp.getName()); //  ename is a session variable
		   
		   //session
		   
		     mv.setViewName("emphome");
	   }
	   else
	   {
		    mv.setViewName("emplogin");
		    mv.addObject("message", "Login Failed");
	   }
	   return mv;
   }
   
   @GetMapping("emphome")
   public ModelAndView emphome(HttpServletRequest request)
   {
     ModelAndView mv = new ModelAndView();
     mv.setViewName("emphome");
     
     HttpSession session  = request.getSession();
     
     int eid = (int)session.getAttribute("eid"); // eid is a session variable
     String ename = (String)session.getAttribute("ename"); // ename is a session variable
     
     mv.addObject("eid", eid);
     mv.addObject("ename", ename);
     
     return mv;
   }
   
   
   @PostMapping("insertemp")
   public ModelAndView insertaction(HttpServletRequest request)
   {
	   ModelAndView mv = new ModelAndView(); 
	   String msg = null;
	   
	   try
	   {
		   String name = request.getParameter("name");
		   String gender = request.getParameter("gender");
		   String dob = request.getParameter("dob");
		   String dept = request.getParameter("dept");
		   String sal = request.getParameter("salary");
		   double salary = Double.parseDouble(sal);
		   String email = request.getParameter("email");
		   String pwd = request.getParameter("pwd");
		   String location = request.getParameter("location");
		   String contact = request.getParameter("contact");
		   
		   Employee emp = new Employee();
		   emp.setName(name);
		   emp.setGender(gender);
		   emp.setDateofbirth(dob);
		   emp.setDepartment(dept);
		   emp.setSalary(salary);
		   emp.setEmail(email);
		   emp.setPassword(pwd);
		   emp.setLocation(location);
		   emp.setContact(contact);
		   emp.setActive(true);
		   
		   msg = employeeService.addemployee(emp);
		   
		   mv.setViewName("displaymsg");
		   mv.addObject("message", msg);
		   
	   }
	   catch(Exception e)
	   {
		   mv.setViewName("displayerror");
		   msg  =  e.getMessage();
		   mv.addObject("message", msg);
	   }
	   
	   return mv;
   }
   
   
   @GetMapping("updateprofile")
   public ModelAndView updateemp(HttpServletRequest request)
   {
     ModelAndView mv = new ModelAndView();
     
     HttpSession session = request.getSession();
     
     mv.setViewName("updateprofile");
     
     mv.addObject("eid", session.getAttribute("eid"));
     mv.addObject("ename", session.getAttribute("ename"));
     
     int id = (int) session.getAttribute("eid");
     
     Employee emp = employeeService.viewemployeebyid(id);
     
     mv.addObject("emp", emp);
     
     return mv;
   }
   
   @PostMapping("update")
   public ModelAndView updateaction(HttpServletRequest request)
   {
     String msg = null;
     
     ModelAndView mv = new ModelAndView();
     
       HttpSession session = request.getSession();
     
     mv.addObject("eid", session.getAttribute("eid"));
     mv.addObject("ename", session.getAttribute("ename"));
     
     int id = (int) session.getAttribute("eid");
     
    try
    {
      String name = request.getParameter("name");
      String dob = request.getParameter("dob");
      String dept = request.getParameter("dept");
      String sal = request.getParameter("salary");
      double salary = Double.parseDouble(sal);
      String email = request.getParameter("email");
      String pwd = request.getParameter("pwd");
      String location = request.getParameter("location");
      String contact = request.getParameter("contact");
      
      Employee emp = new Employee();
       emp.setId(id);
       emp.setName(name);
       emp.setDateofbirth(dob);
       emp.setDepartment(dept);
       emp.setSalary(salary);
       emp.setEmail(email);
       emp.setPassword(pwd);
       emp.setLocation(location);
       emp.setContact(contact);
       
       
       msg = employeeService.updateemployee(emp);
       
       mv.setViewName("emplogin");
       mv.addObject("message",msg);
      
    }
    catch(Exception e)
    {
      msg = e.getMessage();
      
      mv.setViewName("updateerror");
       mv.addObject("message",msg);
    }
   
     return mv;

   }
   
   @GetMapping("emplogout")
   public ModelAndView emplogout()
   {
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("emplogin");
	   mv.addObject("message", "Logout Successfully");
	   return mv;
   }
   
     
}
