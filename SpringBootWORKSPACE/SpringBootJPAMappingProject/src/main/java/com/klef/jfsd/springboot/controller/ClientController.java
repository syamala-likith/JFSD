package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Course;
import com.klef.jfsd.springboot.model.Faculty;
import com.klef.jfsd.springboot.model.FacultyCourseMapping;
import com.klef.jfsd.springboot.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ClientController 
{
   @Autowired
   private AdminService adminService;
	
  @GetMapping("/")
  public String main() 
  {
	  return "index";
  }
  
  @GetMapping("viewallcourses")
  public ModelAndView viewcoures(Model model)
  {
	  ModelAndView mv = new ModelAndView("viewallcourses");
	 
	  model.addAttribute("coursedata", adminService.viewallcourses());
	  
	  return mv;
  }
  
  @GetMapping("viewfaculty")
  public ModelAndView viewfaculty()
  {
	  ModelAndView mv = new ModelAndView("viewfaculty");
	  
	  List<Faculty> facultylist = adminService.viewfaculty();
	  mv.addObject("facultydata", facultylist);
	  
	  return mv;
  }
  
  @GetMapping("fcoursemapping")
  public ModelAndView facultycoursemapping()
  {
	  ModelAndView mv = new ModelAndView("facultycoursemapping");
  	  
      List<Course> courselist = adminService.viewallcourses();
      mv.addObject("coursedata", courselist);
	  
	  List<Faculty> facultylist = adminService.viewfaculty();
	  mv.addObject("facultydata", facultylist);
	  
	  return mv;
  }
  
  @PostMapping("fcoursemappinginsert")
  public ModelAndView fcoursemappinginsert(HttpServletRequest request)
  {
	  String msg=null;
	  
	  ModelAndView mv = new ModelAndView("facultycoursemapping");
	  
	  int fid = Integer.parseInt(request.getParameter("fid"));
	  int cid = Integer.parseInt(request.getParameter("cid"));
	  int section = Integer.parseInt(request.getParameter("section"));
	  String ftype = request.getParameter("ftype");
	  
	  long n = adminService.checkfcoursemapping(adminService.facultybyid(fid), adminService.coursebyid(cid), section);
	  
	  if(n>0)
	  {
		  msg = "mapping already done";
	  }
	  else
	  {
		  FacultyCourseMapping fcm = new FacultyCourseMapping();
		  
		  fcm.setCourse(adminService.coursebyid(cid));
		  fcm.setFaculty(adminService.facultybyid(fid));
		  fcm.setSection(section);
		  fcm.setFacultytype(ftype);
		  
		  msg = adminService.facultycoursemapping(fcm);
		  
		  
	  }
	  
	  mv.addObject("message", msg);
	  
	  
	  
	  return mv;
  }
  
  @GetMapping("viewfcoursemapping")
  public ModelAndView viewfcoursemapping()
  {
	  ModelAndView mv = new ModelAndView("viewfcoursemapping");
	  
	  List<FacultyCourseMapping> fcmlist = adminService.viewfaFacultyCourseMappings();
	  mv.addObject("fcmdata", fcmlist);
 	  
	  return mv;
  }
  
}
