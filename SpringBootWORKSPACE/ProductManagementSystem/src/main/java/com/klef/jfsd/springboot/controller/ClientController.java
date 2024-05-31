package com.klef.jfsd.springboot.controller;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Product;
import com.klef.jfsd.springboot.service.ProductService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ClientController 
{
	
	@Autowired
	private ProductService productService;
	
   @GetMapping("/")
   public String indexdemo()
   {
	   return "index";
   }
   @GetMapping("addproduct")
   public ModelAndView addproductdemo()
   {
	   ModelAndView mv = new ModelAndView("addproduct");
	   return mv;
   }
   @PostMapping("insertproduct")
   public ModelAndView insertproductdemo(HttpServletRequest request,@RequestParam("productimage") MultipartFile file) throws IOException, SerialException, SQLException
   {
	   String msg = null;
	   
	   ModelAndView mv = new ModelAndView();
	   
	   try
	   {
	   String category = request.getParameter("category");
	   String name = request.getParameter("name");
	   String description = request.getParameter("description");
	   Double cost = Double.valueOf(request.getParameter("cost"));
	   String productlink = request.getParameter("productlink");
	   
		  byte[] bytes = file.getBytes();
		  Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
		  
		  Product p = new Product();
		  p.setCategory(category);
		  p.setName(name);
		  p.setDescription(description);
		  p.setCost(cost);
		  p.setProductlink(productlink);
		  p.setProductimage(blob);
		  
		  msg=productService.AddProduct(p);
		  System.out.println(msg);
		  mv.setViewName("productmsg");
		  mv.addObject("message",msg);
	   }	  
	   catch(Exception e)
	   {
		   msg = e.getMessage();
		   System.out.println(msg.toString());
		   mv.setViewName("producterror");
		   mv.addObject("message",msg);
	   }
	   return mv;
   }
   @GetMapping("viewallprods")
   public ModelAndView viewallprodsdemo()
   {
	   List<Product> productlist = productService.ViewAllProducts();
	   
	   ModelAndView mv = new ModelAndView("viewallproducts");
	   
	   mv.addObject("productlist", productlist);
	   
	   return mv;
   }
   
@GetMapping("displayprodimage")
public ResponseEntity<byte[]> displayprodimagedemo(@RequestParam("id") int id) throws IOException, SQLException
{
  Product product =  productService.ViewProductByID(id);
  byte [] imageBytes = null;
  imageBytes = product.getProductimage().getBytes(1,(int) product.getProductimage().length());

  return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
}

   @GetMapping("viewproductbyid")
public ModelAndView  viewproductbyiddemo()
{
	   List<Product> productlist=productService.ViewAllProducts();
	   ModelAndView mv=new ModelAndView("viewproductbyid");
	   mv.addObject("productlist",productlist);
	   return mv;
}
   
   @PostMapping("displayproduct")
   public ModelAndView displayproductdemo(HttpServletRequest request)
   {
	   int pid=Integer.parseInt(request.getParameter("pid"));
	   Product product=productService.ViewProductByID(pid);
	   ModelAndView mv=new ModelAndView("displayproduct");
	   mv.addObject("product",product);
	   return mv;
   }
   
   @GetMapping("displaycategory")
   public ModelAndView  displaycategorydemo()
   {
        ModelAndView mv=new ModelAndView("displaycategory");
        return mv;
   }
   
   @PostMapping("viewproductsbycategory")
   public ModelAndView  viewproductsbycategorydemo(HttpServletRequest request)
   {
      String category = request.getParameter("category");
      
        List<Product> productlist=productService.viewproductsbycategory(category);
        ModelAndView mv=new ModelAndView("viewproductsbycategory");
        mv.addObject("productlist",productlist);
        return mv;
   }
   
  }
