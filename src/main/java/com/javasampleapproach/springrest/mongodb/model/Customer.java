package com.javasampleapproach.springrest.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
public class Customer {
	
	private String id;

	private String name;
	private String doj;
	private String city;
	private int contactNum;

	public Customer() {
	}

	public Customer(String id,String name, int contactNum,String city,String doj) {
		this.id=id;
		this.name = name;
		this.doj=doj;
		this.city=city;
		this.contactNum=contactNum;
		
	}

	public String getId() {
		return id;
	}
	public void setId(String id)
	{
		this.id=id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	
	

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}

	public String getDoj() {
		return doj;
	}

	public String getCity() {
		return city;
	}

	public int getContactNum() {
		return contactNum;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", contactNum=" + contactNum + ", doj=" + doj + ",city="+city+"]";
	}
}
