package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Product;

public interface ProductService 
{
   public String AddProduct(Product product);
   public List<Product> ViewAllProducts();
   public Product ViewProductByID(int productid);
   public void DeleteProductByID(int productid);
   
   public List<Product> viewproductsbycategory(String category);
}
