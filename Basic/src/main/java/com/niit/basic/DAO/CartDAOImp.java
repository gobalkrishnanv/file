package com.niit.basic.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.basic.model.Cart;
@Repository("cartDao")
@Transactional
public class CartDAOImp implements CartDAO{
    @Autowired
	SessionFactory s;
	@Override
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		return s.getCurrentSession().createQuery("from cart").list();
	}
  
	@Override
	public Cart findCardid(int cartid) {
		// TODO Auto-generated method stub
		return (Cart) s.getCurrentSession().createQuery("from cart where cartid"+cartid).uniqueResult();
	}

	@Override
	public Cart findCartname(String cartname) {
		// TODO Auto-generated method stub
		return (Cart) s.getCurrentSession().createQuery("from cart where cartname"+cartname).uniqueResult();
	}

	@Override
	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		s.getCurrentSession().save(cart);
		return true;
	}

	@Override
	public boolean update(Cart cart) {
		// TODO Auto-generated method stub
		s.getCurrentSession().update(cart);
		return true;
	}

	@Override
	public boolean delete(int cartid) {
		// TODO Auto-generated method stub
		s.getCurrentSession().delete(findCardid(cartid));
		return true;
	}

}
