package com.fest.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("mas", "Hello World Gobalkrishnan");
		return "welcome";
	}

	@RequestMapping(value = "/say", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("mas", "Hello World Again, Powerranger");
		return "welcome";
	}

}