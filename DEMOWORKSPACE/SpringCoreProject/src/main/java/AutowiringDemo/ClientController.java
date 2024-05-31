package AutowiringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController 
{

	public static void main(String args[]) 
	{
		System.out.println("******Application Context as Spring IoC Container******");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
		System.out.println("****Autowiring Demo****");
		Person p = (Person) context.getBean("personbean");
		System.out.println(p.toString());
		
		Address a = (Address) context.getBean("addressbean");
		System.out.println(a.toString());
	}

}
