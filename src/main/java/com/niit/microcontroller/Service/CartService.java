package com.niit.microcontroller.Service;

import java.util.List;

import com.niit.microcontroller.model.*;

public interface CartService {
  public List<Cart> getAllCart();
  public Cart findCartid(int cartid);
  public Cart findCartname(String cartname);
  public boolean addCart(Cart cart);
  public boolean updateCart(Cart cart);
  public boolean deleteCart(Cart cartid);
  
  
}
