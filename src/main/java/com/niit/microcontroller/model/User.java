package com.niit.microcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.lang.NonNull;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;
	@NonNull
	private String name;
	@NonNull
	private String email;
	@NonNull
	private String number;
	@NonNull
    private String address;
	@NonNull
    private String password;
	@Transient
	private MultipartFile multipart;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void validate(String name,String password) {
		this.name=name;
		this.password=password;
	}
	public MultipartFile getMultipart() {
		return multipart;
	}
	public void setMultipart(MultipartFile multipart) {
		this.multipart = multipart;
	}
}
