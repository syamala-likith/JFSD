package AnnotationsDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientController 
{
	public static void main(String args[])
	{
		System.out.println("*****ApplicationContext as IoC Container*****");
		System.out.println("**AnnotationsDemo**");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		System.out.println("###Setter Dependency Injection###");
		System.out.println("~~~Bean Type~~~");
		
		Customer c = context.getBean(Customer.class); //bean type
		c.display();
		
		System.out.println();
		
		System.out.println("###Constructor Dependency Injection###");
		System.out.println("~~~Bean Type~~~");
		
		Faculty f = context.getBean(Faculty.class); //bean name
		System.out.println(f.toString());
		
		System.out.println();
		
		System.out.println("###Setter Dependency Injection###");
		System.out.println("~~~Bean Name~~~");
		
		Customer c1 = (Customer)context.getBean("customerbean"); //bean type
		c.display();
		System.out.println();
		
		System.out.println("###Constructor Dependency Injection###");
		System.out.println("~~~Bean Name~~~");
		
		Faculty f1 = (Faculty)context.getBean("facultybean"); //bean name
		System.out.println(f.toString());
	}
}
