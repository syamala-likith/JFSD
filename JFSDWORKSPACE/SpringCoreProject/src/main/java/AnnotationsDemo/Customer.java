package AnnotationsDemo;

import java.util.List;

public class Customer 
{
	private int id;
    private String name;
    private float age;
    private double salary;
    private boolean maritalstatus;
    private List<String> products;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(boolean maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public List<String> getProducts() {
		return products;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
	public void display()
	{
		System.out.println("Customer ID: "+id);
		System.out.println("Customer Name: "+name);
		System.out.println("Customer Age: "+age);
		System.out.println("Customer Salary: "+salary);
		System.out.println("Customer Marital Status: "+maritalstatus);
		System.out.println("Customer Products: "+products.toString());
	}
}