package com.niit.microcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class Cart {
    @Id
    @GeneratedValue
	private int id;
	@NonNull
    private String name;
	@NonNull
	private int quantity;
	@NonNull
	private int cash;
	@NonNull
	private int price;
	@NonNull
    private int totalcash;
	private int pid;
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
	
	
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotalcash() {
		return totalcash;
	}
	public void setTotalcash(int totalcash) {
		this.totalcash = totalcash;
	}
}
