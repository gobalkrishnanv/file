package com.niit.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.basic.DAO.CartDAO;
import com.niit.basic.model.Cart;

@Service
public class CartServiceImp implements CartService {
    
	@Autowired
    CartDAO c;
	 
	@Override
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		return c.getAllCart();
	}

	@Override
	public Cart findCartid(int cartid) {
		// TODO Auto-generated method stub
		return c.findCardid(cartid);
	}

	@Override
	public Cart findCartname(String cartname) {
		// TODO Auto-generated method stub
		return c.findCartname(cartname);
	}

	@Override
	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		
		 c.addCart(cart);	
		 return true;
		
		
	}

	@Override
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
	    
	    	c.update(cart);
	    	return true;
	 
	}

	@Override
	public boolean deleteCart(int cartid) {
		// TODO Auto-generated method stub
		
			c.delete(cartid);
			return true;
		
	}

	
}
