package AnnotationsDemo;

import java.util.List;

public class Faculty
{
	private int id;
	private String name; 
	private float age;
	private double salary;
	private boolean maritalstatus;
	private List<String> courses;
	
	public Faculty(int id, String name, float age, double salary, boolean maritalstatus, List<String> courses)
	{
//		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.maritalstatus = maritalstatus;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", maritalstatus="
				+ maritalstatus + ", courses=" + courses + "]";
	}
}