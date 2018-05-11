package com.niit.basic.DAO;

import java.util.List;

import com.niit.basic.model.Cart;

public interface CartDAO {
 public List<Cart> getAllCart();
 public Cart findCardid(int cartid);
 public Cart findCartname(String cartname);
 public boolean addCart(Cart cart);
 public boolean update(Cart cart);
 public boolean delete(int  cartid);
}
