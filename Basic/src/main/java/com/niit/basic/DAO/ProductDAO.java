package com.niit.basic.DAO;
import java.util.List;

import com.niit.basic.model.Product;
public interface ProductDAO {
   public List<Product> getAllProduct();
   public Product findProductid(int productid);
   public Product findProductname(String prodctname);
   public boolean addProduct(Product product);
   public boolean updateProduct(Product product);
   public boolean deleteProduct(int productid);
 }
