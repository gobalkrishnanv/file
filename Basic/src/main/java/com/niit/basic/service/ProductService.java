package com.niit.basic.service;

import java.util.List;

import com.niit.basic.model.Product;

public interface ProductService {
 public List<Product> getAllProduct();
 public Product findProductid(int productid);
 public Product findProductname(String productname);
 public boolean addProduct(Product product);
 public boolean updateProduct(Product product);
 public boolean deleteProduct(int productid);
 
}
