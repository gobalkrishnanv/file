package com.niit.microcontroller.controller;

import org.springframework.web.multipart.MultipartFile;

public class FileUpload {
 private MultipartFile multipart;

public MultipartFile getMultipart() {
	return multipart;
}

public void setMultipart(MultipartFile multipart) {
	this.multipart = multipart;
}
  
 }
