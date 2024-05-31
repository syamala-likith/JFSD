package com.klef.jfsd.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.klef.jfsd.dao.EmployeeDAO;
import com.klef.jfsd.dao.EmployeeDAOImpl;

@Configuration
public class ApplicationConfig 
{
   @Bean
   public DataSource dataSource() // connection properties
   {
	   DriverManagerDataSource dataSource = new DriverManagerDataSource();
	   
	   dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	   dataSource.setUrl("jdbc:mysql://localhost:3306/demospringmvcjdbc55");
	   dataSource.setUsername("root");
	   dataSource.setPassword("root");
	   
	   return dataSource;
   }
   
   @Bean
   public JdbcTemplate jdbcTemplate()
   {
	   JdbcTemplate jdbcTemplate = new JdbcTemplate();
	   jdbcTemplate.setDataSource(dataSource());
	   
	   return jdbcTemplate;
   }
   
   @Bean
   public EmployeeDAO employeeDAO()
   {
	   EmployeeDAOImpl daoImpl = new EmployeeDAOImpl();
	   daoImpl.setJdbcTemplate(jdbcTemplate());
	   return daoImpl;
   }
   
   
}
