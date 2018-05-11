package com.niit.basic.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.basic.model.User;
@Repository("userDao")
@Transactional
public class UserDAOImp implements UserDAO{
    @Autowired
	SessionFactory s;
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return s.getCurrentSession().createQuery("from user").list();
	}

	@Override
	public User findUserid(int userid) {
		// TODO Auto-generated method stub
		return (User) s.getCurrentSession().createQuery("from user where id"+userid).uniqueResult();
	}

	@Override
	public User findUsername(String username) {
		// TODO Auto-generated method stub
	
		
		return (User) s.getCurrentSession().createQuery("from user where name"+username).uniqueResult();
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		s.getCurrentSession().save(user);
		return true;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		s.getCurrentSession().update(user);
		return true;
	}

	@Override
	public boolean deleteUser(int userid) {
		// TODO Auto-generated method stub
		
		s.getCurrentSession().createQuery("delete from user where name='sdf'").uniqueResult();
		
		return true;
	}

}
