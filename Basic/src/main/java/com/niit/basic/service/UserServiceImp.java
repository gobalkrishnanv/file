package com.niit.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.basic.DAO.UserDAO;
import com.niit.basic.model.User;

@Service
public class UserServiceImp implements UserService{
 
	@Autowired
	UserDAO u;

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return u.getAllUser();
	}

	@Override
	public User findUserid(int userid) {
		// TODO Auto-generated method stub
		return u.findUserid(userid);
	}

	@Override
	public User findUsername(String username) {
		// TODO Auto-generated method stub
		return u.findUsername(username);
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		
			
			u.addUser(user);
			return true;
	}
	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
			u.updateUser(user);
			return true;
		
		
	}

	@Override
	public boolean deleteUser(int userid) {
		// TODO Auto-generated method stub
	
			u.deleteUser(userid);
			return true;
		
	}
	
	
}
