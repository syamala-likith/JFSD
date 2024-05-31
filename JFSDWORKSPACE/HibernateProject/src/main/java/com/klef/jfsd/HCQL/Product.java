package com.klef.jfsd.HCQL;

import javax.persistence.*;

@Entity
@Table(name = "product_table")
public class Product 
{
	@Id
	@Column(name="pid")
	private int id;
	@Column(name="pcategory",length = 20,nullable = false)
	private String category;
	@Column(name="pname",length = 30,nullable = false)
	private String name;
	@Column(name="pvendor",length = 20,nullable = false)
	private String vendor;
	@Column(name="pcost",precision=10,scale =4,nullable = false)
	private double cost;
	@Column(name="pstock",nullable = false)
	private int stock;
	@Column(name = "preview")
	private String review;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getCategory() 
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getVendor() 
	{
		return vendor;
	}
	public void setVendor(String vendor) 
	{
		this.vendor = vendor;
	}
	public double getCost() 
	{
		return cost;
	}
	public void setCost(double cost) 
	{
		this.cost = cost;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock)
	{
		this.stock = stock;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category + ", name=" + name + ", vendor=" + vendor + ", cost="
				+ cost + ", stock=" + stock + ", review=" + review + "]";
	}
}
