package com.klef.jfsd.configuration;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.klef.jfsd.dao.EmployeeDAO;
import com.klef.jfsd.dao.EmployeeDAOImpl;
import com.klef.jfsd.service.EmployeeService;
import com.klef.jfsd.service.EmployeeServiceImpl;

@Configuration
@EnableTransactionManagement
public class ApplicationConfig 
{
	@Bean
    public BasicDataSource dataSource() // connection properties
    {
      BasicDataSource dataSource = new BasicDataSource();
      
      dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // driver class
<<<<<<< HEAD
      dataSource.setUrl("jdbc:mysql://localhost:3306/demospringmvchibernate55");  // url
=======
      dataSource.setUrl("jdbc:mysql://localhost:3306/springmvchibernate55");  // url
>>>>>>> 5e682ac (commit msg)
      dataSource.setUsername("root");  //user
      dataSource.setPassword("root"); // password
      
      return dataSource;
    }
	
	@Bean
    public Properties hibernateProperties()
    {
      Properties hibernateProperties = new Properties();
      
      hibernateProperties.setProperty("hibernate.show_sql","true");
      hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
      hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
      
      return hibernateProperties;
    }
	
	@Bean
    public LocalSessionFactoryBean localSessionFactoryBean()
    {
      LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
      
        localSessionFactoryBean.setDataSource(dataSource()); // first bean - connection properties
        localSessionFactoryBean.setHibernateProperties(hibernateProperties()); // second bean - hibernate properties
        localSessionFactoryBean.setPackagesToScan("com.klef.jfsd.model"); // mapping class - Employee Model
      
      return localSessionFactoryBean;
    }
	
	@Bean
    public HibernateTransactionManager hibernateTransactionManager()
    {
      HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
      
     hibernateTransactionManager.setSessionFactory(localSessionFactoryBean().getObject());
      
      return hibernateTransactionManager;
    }
	
	@Bean
    public HibernateTemplate hibernateTemplate()
    {
      HibernateTemplate hibernateTemplate =  new HibernateTemplate();
      
      hibernateTemplate.setSessionFactory(localSessionFactoryBean().getObject());
      
      return hibernateTemplate;
    }
	
	@Bean
	public EmployeeDAO employeeDAO()
	{
		EmployeeDAOImpl daoImpl=new EmployeeDAOImpl();
		daoImpl.setHibernateTemplate(hibernateTemplate());
		
		return daoImpl;
	}
	
	@Bean
	public EmployeeService employeeService()
	{
		EmployeeServiceImpl serviceImpl=new EmployeeServiceImpl();
		serviceImpl.setEmployeeDAO(employeeDAO());
		
		return serviceImpl;
	}
}
