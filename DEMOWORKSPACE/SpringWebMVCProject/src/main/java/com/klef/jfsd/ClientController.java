package com.klef.jfsd;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController
{
	@RequestMapping(path = "/",method = RequestMethod.GET)//path represents URI
	public ModelAndView demo()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home"); //home is jsp file name
		
		return mv;
	}
	
	@RequestMapping(path = "/demo1")//by default GET method
	public ModelAndView demo1()
	{
		ModelAndView mv=new ModelAndView("test");//test is jsp file name
		
		return mv;
	}
	
	@RequestMapping("/demo2")//by default GET method
	public ModelAndView demo2() // URI name and method name can be different
	{
		ModelAndView mv=new ModelAndView("main");//main is jsp file name
		
		return mv;
	}
	
	@GetMapping("demo3")
	public ModelAndView demo3()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("admin"); //admin is jsp file name
		
		return mv;
	}
	@GetMapping("demo4")
	public ModelAndView demo4()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("user"); //user is jsp file name
		
		mv.addObject("name", "klu");	
		return mv;
	}
	@GetMapping("demo5")
	public ModelAndView demo5()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("about"); //about is jsp file name
		
		mv.addObject("msg", "Hello World");	
		return mv;
	}
	@GetMapping("demo6")
	@ResponseBody //HTTP Response 
	public String demo6() //URI & Method name can be different
	{
		return "JFSD S55 Section";
	}
	@GetMapping("demo7")
	@ResponseBody
	public String demo7(@RequestParam("a") int x, @RequestParam("b") int y)
	{
		return Integer.toString(x+y);
	}
	@GetMapping("demo8")
	public ModelAndView demo8(@RequestParam("uname") String username)
	{
		ModelAndView mv = new ModelAndView("profile"); //profile is jsp file
		mv.addObject("uname", username);
		return mv;
	}
	@GetMapping("demo9/{id}")
	@ResponseBody
	public String demo9(@PathVariable("id") int eid)
	{
		return Integer.toString(eid);
	}
	@GetMapping("demo10/{fname}/{lname}")
	public ModelAndView demo9(@PathVariable("fname") String fname, @PathVariable("lname") String lname)
	{
		ModelAndView mv = new ModelAndView("demo"); //demo is a jsp file
		String name=fname+" "+lname;
		mv.addObject("name", name);
		return mv;
		
	}
}
