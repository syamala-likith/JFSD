package com.klef.jfsd.InheritanceMapping;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class InheritanceMappingDemo 
{
	public static void main(String agrs[])
	{
		
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	       
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	       
	    Transaction t = session.beginTransaction();
	       
	    Person p = new Person();
	    p.setName("RAM");
	    p.setGender("MALE");
	    p.setDob("12/12/2000");
	    p.setCollege("KLU");
	    p.setDepartment("CSE");
	    p.setContact("9190910909");
	    
	    Scholar s = new Scholar();
	    s.setProgram("B.Tech.");
	    s.setYear(3);
	    s.setSemester("ODD");
	    s.setCgpa(8.79);
	    s.setBacklogs(1);
	    s.setResidence("Hostler");
	    s.setCareerchoice("Higher Studies");
	    
	      
	    Faculty f = new Faculty();
	    f.setQualification("Ph.D.");
	    f.setExeperience(2.5f);
	    f.setDesignation("Professor");
	    f.setJoiningdate("01/02/2017");
	    f.setSalary(30000.00);
	    
	    session.save(p);
	    session.save(s);
	    session.save(f);
	    
	    t.commit();
	    
	    session.close();
	    sf.close();
	}
}