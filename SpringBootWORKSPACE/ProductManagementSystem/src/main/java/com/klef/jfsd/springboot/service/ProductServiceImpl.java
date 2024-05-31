package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Product;
import com.klef.jfsd.springboot.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public String AddProduct(Product product) 
	{
		productRepository.save(product);
		return "Product Added Successfully";
	}

	@Override
	public List<Product> ViewAllProducts() 
	{
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product ViewProductByID(int productid) 
	{
		return productRepository.findById(productid).get();
	}

	@Override
	public void DeleteProductByID(int productid) 
	{
		productRepository.deleteById(productid);
		
	}

	@Override
	public List<Product> viewproductsbycategory(String category) {
		return productRepository.viewproductsbycategory(category);
	}

}
