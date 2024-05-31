package ConstructorDI;

import java.util.List;

public class Employee 
{
	private int id; //primitive data type
	private String name; //non primitive data type
	private float age; //primitive data type
	private double salary; //primitive data type
	private boolean graduated; //primitive data type
	private List<String> skills; //collection non primitive data type
	
	public Employee(int id, String name, float age, double salary, boolean graduated, List<String> skills)
	{
//		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.graduated = graduated;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", graduated="
				+ graduated + ", skills=" + skills + "]";
	}
}
