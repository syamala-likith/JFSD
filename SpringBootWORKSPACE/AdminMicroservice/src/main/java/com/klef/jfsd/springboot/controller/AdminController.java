package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("admin")
public class AdminController 
{
   @Autowired	
   private AdminService adminService;
   
   @GetMapping("/") 
   @ResponseBody
   public String admin()
   {
	   return "Admin Microservice";
   }

   
   @GetMapping("adminlogin") 
   public ModelAndView adminlogin()
   {
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("adminlogin");
	   return mv;
   }
   
   @PostMapping("checkadminlogin")
   public ModelAndView checkadminlogin(HttpServletRequest request)
   {
	   String uname = request.getParameter("uname");
	   String pwd = request.getParameter("pwd");
	   
	   Admin a = adminService.checkadminlogin(uname, pwd);
	   
	   ModelAndView mv = new ModelAndView();
	   
	   if(a!=null)
	   {
		   mv.setViewName("adminhome");
		   
		   long empcount = adminService.employeecount();
		   long customercount = adminService.customercount();
		   
		    mv.addObject("ecount",empcount);
	       mv.addObject("ccount", customercount);
	   }
	   else
	   {
		   mv.setViewName("adminlogin");
		   mv.addObject("message", "Login Failed");
	   }
	   
	   return mv;
   }
   
   @GetMapping("viewallemps")
   public ModelAndView viewallemps()
   {
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("viewallemps");
	   
	   List<Employee> emplist = adminService.viewallemps();
	   mv.addObject("empdata", emplist);
	   
	   return mv;
   }

   
   @GetMapping("adminhome")
   public ModelAndView adminhome()
   { 
	   long empcount = adminService.employeecount();
	   long customercount = adminService.customercount();
	   
	 ModelAndView mv = new ModelAndView();
     mv.setViewName("adminhome");
     mv.addObject("ecount",empcount);
     mv.addObject("ccount", customercount);
     return mv;
   }
   
   @GetMapping("view")
   public ModelAndView viewempdemo(@RequestParam("id") int eid)
   {
     Employee emp = adminService.viewempbyid(eid);
     ModelAndView mv = new ModelAndView();
     mv.setViewName("viewempbyid");
     mv.addObject("emp", emp);
     return mv;
   }
   
   @GetMapping("deleteemp")
   public ModelAndView deleteemp()
   {
     ModelAndView mv = new ModelAndView();
     mv.setViewName("deleteemp");
     
     List<Employee> emplist =  adminService.viewallemps();
     
     mv.addObject("empdata", emplist);
     
     return mv;
   }
   
   @GetMapping("delete/{id}")
   public String deleteaction(@PathVariable("id") int eid)
   {
     adminService.deleteemp(eid);
     return "redirect:/deleteemp";
   }
 
      
   @GetMapping("addcustomer")
   public String addcustomer(Model m)
   {
     m.addAttribute("customer", new Customer());
     return "addcustomer";
   }
	       
   @PostMapping("insertcustomer")
   public ModelAndView insertcustomer(@ModelAttribute("customer") Customer c)
   {
	   ModelAndView mv = new ModelAndView();
	   
	   mv.setViewName("customermsg");
	   
	   String msg = adminService.addcustomer(c);
	   mv.addObject("message", msg);
	   
	   return mv;
   }
   
   @GetMapping("updatestatus")
   public ModelAndView updatestatus()
   {
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("updatestatus");
	   
	   List<Employee> emplist = adminService.viewallemps();
	   mv.addObject("empdata", emplist);
	   
	   return mv;
   }
   
   @GetMapping("setstatus")
   public ModelAndView setstatusaction(@RequestParam("id") int eid, @RequestParam("status") boolean status)
   {
	   int n = adminService.updatestatus(eid, status);
	   
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("updatestatus");
	   
	   List<Employee> emplist = adminService.viewallemps();
	   mv.addObject("empdata", emplist);
	   
	   if(n>0)
	   {
		   mv.addObject("message", "Status Updated Successfully");
	   }
	   else
	   {
		   mv.addObject("message", "Failed to Update Status");
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
