package com.niit.microcontroller.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.microcontroller.DAO.*;
import com.niit.microcontroller.model.*;

@Service
public class ProductServiceImp implements ProductService{
    
	@Autowired
	ProductDAO p;
	
	
	
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return p.getAllProduct();
	}

	
	public Product findProductid(int productid) {
		// TODO Auto-generated method stub
		return p.findProductid(productid);
	}

	
	public Product findProductname(String productname) {
		// TODO Auto-generated method stub
		return p.findProductname(productname);
	}

	
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		
		    p.addProduct(product);
			return true;
	    
	}

	
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
	  
	    	p.updateProduct(product);
	    	return true;
	  
	}

	
	public boolean deleteProduct(Product productid) {
		// TODO Auto-generated method stub
		
			p.deleteProduct(productid);
		    return true;
		
	}

}
