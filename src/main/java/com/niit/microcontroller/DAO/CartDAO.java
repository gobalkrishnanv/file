package com.niit.microcontroller.DAO;

import java.util.List;

import com.niit.microcontroller.model.*;

public interface CartDAO {
 public List<Cart> getAllCart();
 public Cart findCardid(int cartid);
 public Cart findCartname(String cartname);
 public boolean addCart(Cart cart);
 public boolean update(Cart cart);
 public boolean delete(Cart  cartid);
}
