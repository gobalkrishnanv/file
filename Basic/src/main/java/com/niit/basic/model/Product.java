package com.niit.basic.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.lang.NonNull;



@Entity
public class Product {

	@Id
	private int id;
	@NonNull
	private String name;
	@NonNull
	private String type;
	@NonNull
	private String price;
	@NonNull
	private String quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
}
