package com.klef.jfsd.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalAPIServiceImp implements ExternalAPIService
{
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<Object> viewallposts() 
	{
		String apiurl="https://jsonplaceholder.typicode.com/posts";
		Object[] data = restTemplate.getForObject(apiurl, Object[].class);
		return Arrays.asList(data);
	}

	@Override
	public Object viewpostbyid(int id) 
	{
		String apiurl="https://jsonplaceholder.typicode.com/posts/"+id;
		Object obj=restTemplate.getForObject(apiurl, Object.class);
		return obj;
	}

	@Override
	public List<Object> viewallcustomers()
	{
		String apiurl="http://localhost:2020/customer/viewall";
		Object[] data = restTemplate.getForObject(apiurl, Object[].class);
		return Arrays.asList(data);
	}

}
