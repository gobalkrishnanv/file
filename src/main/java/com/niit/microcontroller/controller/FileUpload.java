package com.niit.microcontroller.controller;

import org.springframework.web.multipart.MultipartFile;

public class FileUpload {
 private MultipartFile f;
 public void multipart(MultipartFile s) {
	 this.f=s;
 }
 }
