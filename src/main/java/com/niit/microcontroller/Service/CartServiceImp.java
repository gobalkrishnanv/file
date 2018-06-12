package com.niit.microcontroller.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.microcontroller.DAO.*;
import com.niit.microcontroller.model.*;

@Service
public class CartServiceImp implements CartService {
    
	@Autowired
    CartDAO c;
	 
	
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		return c.getAllCart();
	}

	
	public Cart findCartid(int cartid) {
		// TODO Auto-generated method stub
		return c.findCardid(cartid);
	}

	
	public Cart findCartname(String cartname) {
		// TODO Auto-generated method stub
		return c.findCartname(cartname);
	}

	
	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		
		 c.addCart(cart);	
		 return true;
		
		
	}

	
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
	    
	    	c.update(cart);
	    	return true;
	 
	}

	
	public boolean deleteCart(Cart cartid) {
		// TODO Auto-generated method stub
		
			c.delete(cartid);
			return true;
		
	}

	
}
