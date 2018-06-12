package com.niit.microcontroller.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.microcontroller.model.*;
@Repository("productDao")
@Transactional
public class ProductDAOImp implements ProductDAO{
    @Autowired
	SessionFactory s;
	
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return s.getCurrentSession().createCriteria(Product.class).list();
	}

	
	public Product findProductid(int productid) {
		// TODO Auto-generated method stub
		return (Product)s.getCurrentSession().get(Product.class, productid);
	}

	
	public Product findProductname(String productname) {
		// TODO Auto-generated method stub
		return (Product) s.getCurrentSession().createCriteria(Product.class).add(Restrictions.eq("productname",productname)).uniqueResult();
	}

	
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		
		s.getCurrentSession().save(product);
		return true ;
	}

	
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		s.getCurrentSession().update(product);
		return true;
	}

	
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		s.getCurrentSession().delete(product);
	
		
		return true;
	}

}
