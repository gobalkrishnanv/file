package com.niit.microcontroller.DAO;
import java.util.List;

import com.niit.microcontroller.model.*;
public interface ProductDAO {
   public List<Product> getAllProduct();
   public Product findProductid(int productid);
   public Product findProductname(String prodctname);
   public boolean addProduct(Product product);
   public boolean updateProduct(Product product);
   public boolean deleteProduct(Product productid);
 }
