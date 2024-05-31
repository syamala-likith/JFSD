package com.klef.jfsd.InheritanceMapping;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Demo 
{
	public static void main(String agrs[])
	{
		
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	       
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session s = sf.openSession();
	       
	    Transaction t = s.beginTransaction();
	       
	    EmployeeDetails ed = new EmployeeDetails();
	    ed.setEid(1);
	    ed.setName("Likith");
	    ed.setEage(19);
	    
	    EmployeeSportsData esd = new EmployeeSportsData();
	    esd.setNoofstudents(10);
	    esd.setGame("Cricket");
	      
	    EmployeeOfficeData eod = new EmployeeOfficeData();
	    eod.setCabinno("c305");
	    eod.setFloor("3");
	   
	    s.save(ed);
	    s.save(eod);
	    s.save(esd);
	    
	    t.commit();
	    
	    s.close();
	    sf.close();
	}
}