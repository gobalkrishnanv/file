package com.niit.microcontroller.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.microcontroller.model.*;
@Repository("cartDao")
@Transactional
public class CartDAOImp implements CartDAO{
    @Autowired
	SessionFactory s;
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		return s.getCurrentSession().createCriteria(Cart.class).list();
	}
  
	public Cart findCardid(int cartid) {
		// TODO Auto-generated method stub
		return (Cart) s.getCurrentSession().get(Cart.class,cartid);
	}

	public Cart findCartname(String cartname) {
		// TODO Auto-generated method stub
		return (Cart) s.getCurrentSession().createCriteria(Cart.class).add(Restrictions.eq("cartname", cartname));
	}

	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		s.getCurrentSession().save(cart);
		return true;
	}

	public boolean update(Cart cart) {
		// TODO Auto-generated method stub
		s.getCurrentSession().update(cart);
		return true;
	}

	public boolean delete(Cart cartid) {
		// TODO Auto-generated method stub
		Session ss=s.getCurrentSession();
		ss.remove(cartid);
        ss.flush();
		return true;
	}

}
