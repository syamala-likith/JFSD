package ConstructorDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController 
{
	public static void main(String args[])
	{
		System.out.println("***Application Context as Spring IoC Container***");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
		Employee emp = (Employee) context.getBean("empbean"); //at this time object will be created at runtime
		System.out.println("****Constructor Dependency Injection****");
		System.out.println(emp.toString());
	}
}
