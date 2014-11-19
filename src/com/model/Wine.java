package com.model;

public class Wine {

	private String name;
	private int year;
	private String price;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString(){
		
		return "Wine: Name = " + name + ", Type = " + type + ", Year = " + year + ", Price = " + price; 
	}
	
}
