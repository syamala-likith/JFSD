package AnnotationsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ApplicationConfig 
{
//	@Bean
	@Bean(name = "customerbean")
	public Customer setterDemo()
	{
		Customer c = new Customer();
		c.setId(100);
		c.setName("KLU");
		c.setAge(23.5f);
		c.setSalary(12000.50);
		c.setMaritalstatus(true);
		
		List<String> productlist = new ArrayList<>();
		productlist.add("mobile");
		productlist.add("watch");
		productlist.add("laptop");
		c.setProducts(productlist);
		
		return c;
	}
	
//	@Bean
	@Bean("facultybean")
	public Faculty constructorDemo()
	{
		Faculty f = new Faculty(4654, "KLU", 40.5f, 23000.0, true, Arrays.asList("MSWD","EP","JFSD"));
		return f;
	}
	
}