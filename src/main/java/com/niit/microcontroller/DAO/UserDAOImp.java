package com.niit.microcontroller.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.microcontroller.model.*;
@Repository("userDao")
@Transactional
public class UserDAOImp implements UserDAO{
    @Autowired
	SessionFactory s;
	
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return s.getCurrentSession().createCriteria(User.class).list();
	}

	
	public User findUserid(int userid) {
		// TODO Auto-generated method stub
		return (User) s.getCurrentSession().get(User.class,userid);
	}

	
	public User findUsername(String username) {
		// TODO Auto-generated method stub
	
		
		return (User) s.getCurrentSession().createCriteria(User.class).add(Restrictions.eq("username",username)).uniqueResult();
	}

	
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		s.getCurrentSession().save(user);
		return true;
	}

	
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		s.getCurrentSession().update(user);
		return true;
	}

	
	public boolean deleteUser(User userid) {
		// TODO Auto-generated method stub
		
s.getCurrentSession().delete(userid);		
		return true;
	}

	

	

	public User validate(String username, String password) {
		// TODO Auto-generated method stub
		return 		(User) s.getCurrentSession().createCriteria(User.class).add(Restrictions.eq("username",username)).add(Restrictions.eq("password", password)).uniqueResult();

	}

}
