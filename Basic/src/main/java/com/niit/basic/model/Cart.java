package com.niit.basic.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class Cart {
    @Id
	private int id;
	@NonNull
    private String name;
	@NonNull
	private int Account_number;
	@NonNull
	private int password;
	@NonNull
	private int cash;
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
	public int getAccount_number() {
		return Account_number;
	}
	public void setAccount_number(int account_number) {
		Account_number = account_number;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
}
