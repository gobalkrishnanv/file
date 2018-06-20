package com.niit.microcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.lang.NonNull;
import org.springframework.web.multipart.MultipartFile;



@Entity
public class Product {

	@Id
	@GeneratedValue
	private int id;
	@NonNull
	private String name;
	@NonNull
	private String type;
	@NonNull
	private String price;
	@Transient
	private MultipartFile multipart;
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
	public MultipartFile getMultipart() {
		return multipart;
	}
	public void setMultipart(MultipartFile multipart) {
		this.multipart = multipart;
	}
	
	
}
