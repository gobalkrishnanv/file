package com.niit.microcontroller.Service;

import java.util.List;

import com.niit.microcontroller.model.*;

public interface ProductService {
 public List<Product> getAllProduct();
 public Product findProductid(int productid);
 public Product findProductname(String productname);
 public boolean addProduct(Product product);
 public boolean updateProduct(Product product);
 public boolean deleteProduct(Product productid);
 
}
