package com.niit.microcontroller.controller;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.microcontroller.Service.CartService;
import com.niit.microcontroller.Service.ProductService;
import com.niit.microcontroller.Service.UserService;
import com.niit.microcontroller.model.Cart;
import com.niit.microcontroller.model.Product;
import com.niit.microcontroller.model.User;

@Controller
public class AdminController {

@Autowired
UserService su;


int i=-1;
@RequestMapping(value= {"/","/home"},method=RequestMethod.GET)
public String home(Model m) {
	
	if(i<0) {
	}
	i++;
	return "admin";
}

@ModelAttribute("user")
public User inituser() {
	return new User();
}




@RequestMapping(value="/reg",method=RequestMethod.GET)
public String register(Model m) {
return "register";
}

@RequestMapping(value="/save",method=RequestMethod.POST)
public String register(@ModelAttribute("user") User u,Model m) {
	  m.addAttribute("reg", "Register:");
	if(u!=null) {
		System.out.println(u.getName());
	  
		su.addUser(u);
		
	}
	
	
		
	
	return "admin";
}

@RequestMapping(value="/about",method=RequestMethod.GET)
public String about(Model m) {
	return "about";
}

@Autowired
ProductService ps;

int r=-1;
@RequestMapping(value="/arduino",method=RequestMethod.GET)
public String arduino(Model m)
{

Product mega=new Product();
mega.setId(1);
mega.setName("Arduino Mega");
mega.setPrice("500");
mega.setType("Arduino");
m.addAttribute("mega", mega);

Product nano=new Product();
nano.setName("Arduino Nano");
nano.setPrice("700");
nano.setType("Arduino");
m.addAttribute("nano", nano);

Product micro=new Product();
micro.setName("Arduino Micro");
micro.setPrice("600");
micro.setType("Arduino");
m.addAttribute("micro",micro);

Product uno=new Product();
uno.setName("Arduino Uno");
uno.setPrice("100");
uno.setType("Arduino");
m.addAttribute("uno", uno);

Product genuino=new Product();
genuino.setName("Arduino Genuino");
genuino.setPrice("800");
genuino.setType("Arduino");
m.addAttribute("genuino", genuino);

Product esplora=new Product();
esplora.setName("Arduino Esplora");
esplora.setPrice("1200");
esplora.setType("Arduino");
m.addAttribute("esplora", esplora); 


Product ethernet=new Product();
ethernet.setName("Arduino Ethernet");
ethernet.setPrice("400");
ethernet.setType("Arduino");
m.addAttribute("ethernet",ethernet);

Product lilypad=new Product();
lilypad.setName("Arduino Lilypad");
lilypad.setPrice("300");
lilypad.setType("Arduino");
m.addAttribute("lilypad", lilypad);

Product leonardo=new Product();
leonardo.setName("Arduino Leonardo");
leonardo.setPrice("200");
leonardo.setType("Arduino");
m.addAttribute("leonardo", leonardo);


Product mo=new Product();
mo.setName("Arduino M0");
mo.setPrice("1000");
mo.setType("Arduino");
m.addAttribute("mo",mo);

if(r<0) {

ps.addProduct(mega);
ps.addProduct(nano);
ps.addProduct(micro);
ps.addProduct(uno);
ps.addProduct(genuino);
ps.addProduct(esplora);
ps.addProduct(ethernet);
ps.addProduct(lilypad);
ps.addProduct(leonardo);
ps.addProduct(mo);

}
r++;
return "productArduino";	

}



int r1=-1;
@RequestMapping(value="/shield",method=RequestMethod.GET)
public String shield(Model m)
{

Product mega=new Product();
mega.setId(11);
mega.setName("Mega Shield");
mega.setPrice("500");
mega.setType("Shield");
m.addAttribute("mega", mega);

Product gsm=new Product();
gsm.setName("Gsm Shield");
gsm.setPrice("700");
gsm.setType("Shield");
m.addAttribute("gsm", gsm);

Product mkr_485=new Product();
mkr_485.setName("Mkr 485 Shield");
mkr_485.setPrice("600");
mkr_485.setType("Shield");
m.addAttribute("mkr_485",mkr_485);

Product mkr_relay=new Product();
mkr_relay.setName("Mkr Relay Shield");
mkr_relay.setPrice("100");
mkr_relay.setType("Shield");
m.addAttribute("mkr_relay",mkr_relay);

Product motor=new Product();
motor.setName("Motor Shield");
motor.setPrice("800");
motor.setType("Shield");
m.addAttribute("motor", motor);

Product relay=new Product();
relay.setName("Relay Shield");
relay.setPrice("200");
relay.setType("Shield");
m.addAttribute("relay",relay); 


Product uno=new Product();
uno.setName("Uno Shield");
uno.setPrice("400");
uno.setType("Shield");
m.addAttribute("uno",uno);

Product usb=new Product();
usb.setName("Usb Shield");
usb.setPrice("300");
usb.setType("Shield");
m.addAttribute("usb",usb);



if(r1<0) {

ps.addProduct(mega);
ps.addProduct(gsm);
ps.addProduct(mkr_485);
ps.addProduct(mkr_relay);
ps.addProduct(motor);
ps.addProduct(relay);
ps.addProduct(uno);
ps.addProduct(usb);
}
r1++;
return "productShield";	

}






@ModelAttribute("ct")
public Cart cartinit() {
	return new Cart();
}

List<Cart> ca=new ArrayList<Cart>();



@Autowired
CartService cs;
@RequestMapping(value="/cart",method=RequestMethod.POST)
public String Cart(@ModelAttribute("ct") Cart ct,Model m) {
	if(ct!=null) {
	int p=ct.getPrice();
	int q=ct.getQuantity();
	int c=p*q;

	m.addAttribute("icash", c);
	ct.setCash(c);
	cs.addCart(ct);
	ca.add(ct);
	
	int a=0;
	for(int i=0;i<ca.size();i++) {
		a+=ca.get(i).getCash();
	}
	m.addAttribute("tcash", a);
	
	List<Cart> cl=cs.getAllCart();
	
	
	m.addAttribute("cl", cl);
	}
	return "cart";
}




@RequestMapping(value="/delete",method=RequestMethod.GET)
public String cartdelete(@ModelAttribute("ct") Cart ct,Model m) {
	ca.remove(ct);
	cs.deleteCart(ct);
    System.out.println(ca.size());
	
	int a=0;
	for(int i=0;i<ca.size();i++) {
		a+=ca.get(i).getCash();
	}
	m.addAttribute("tcash", a);
	
	List<Cart> cl=cs.getAllCart();
	
	
	m.addAttribute("cl", cl);
	
	
	return "cart";
}



@RequestMapping(value="login_success")
public String loginSuccess(HttpSession session,Model m)
{
	String page="";
	
	boolean loggedIn=false;
	
	SecurityContext securityContext=SecurityContextHolder.getContext();
	Authentication authentication=securityContext.getAuthentication();
	
	String username=authentication.getName();
	
	Collection<GrantedAuthority> roles=(Collection<GrantedAuthority>)authentication.getAuthorities();
	
	for(GrantedAuthority role:roles)
	{
		session.setAttribute("role", role.getAuthority());
		

          System.out.println(role.getAuthority());
		  System.out.println(username);
		  
		
		
		
			
		
	}
	
	return "admin";
}



}
