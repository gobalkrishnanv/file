package com.niit.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.basic.DAO.ProductDAO;
import com.niit.basic.model.Product;

@Service
public class ProductServiceImp implements ProductService{
    
	@Autowired
	ProductDAO p;
	
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return p.getAllProduct();
	}

	@Override
	public Product findProductid(int productid) {
		// TODO Auto-generated method stub
		return p.findProductid(productid);
	}

	@Override
	public Product findProductname(String productname) {
		// TODO Auto-generated method stub
		return p.findProductname(productname);
	}

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		
		    p.addProduct(product);
			return true;
	    
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
	  
	    	p.updateProduct(product);
	    	return true;
	  
	}

	@Override
	public boolean deleteProduct(int productid) {
		// TODO Auto-generated method stub
		
			p.deleteProduct(productid);
		    return true;
		
	}

}
