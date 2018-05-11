package com.niit.basic.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.basic.model.Product;
@Repository("productDao")
@Transactional
public class ProductDAOImp implements ProductDAO{
    @Autowired
	SessionFactory s;
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return s.getCurrentSession().createQuery("from product").list();
	}

	@Override
	public Product findProductid(int productid) {
		// TODO Auto-generated method stub
		return (Product)s.getCurrentSession().createQuery("from product where id"+productid).uniqueResult();
	}

	@Override
	public Product findProductname(String productname) {
		// TODO Auto-generated method stub
		return (Product)s.getCurrentSession().createQuery("from product where productname"+productname).uniqueResult();
	}

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		
		s.getCurrentSession().save(product);
		return true ;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		s.getCurrentSession().update(product);
		return true;
	}

	@Override
	public boolean deleteProduct(int productid) {
		// TODO Auto-generated method stub
		Session session=s.getCurrentSession();
	     session.delete(findProductid(productid));
	     session.flush();
	
		
		return true;
	}

}
