package com.niit.basic.service;

import java.util.List;

import com.niit.basic.model.Cart;

public interface CartService {
  public List<Cart> getAllCart();
  public Cart findCartid(int cartid);
  public Cart findCartname(String cartname);
  public boolean addCart(Cart cart);
  public boolean updateCart(Cart cart);
  public boolean deleteCart(int cartid);
  
  
}
