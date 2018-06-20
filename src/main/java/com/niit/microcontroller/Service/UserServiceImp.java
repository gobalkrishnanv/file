package com.niit.microcontroller.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.microcontroller.DAO.*;
import com.niit.microcontroller.model.*;

@Service
public class UserServiceImp implements UserService{
 
	@Autowired
	UserDAO u;

	
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return u.getAllUser();
	}

	
	public User findUserid(int userid) {
		// TODO Auto-generated method stub
		return u.findUserid(userid);
	}

	
	public User findUsername(String username) {
		// TODO Auto-generated method stub
		return u.findUsername(username);
	}

	
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		
			
			u.addUser(user);
			return true;
	}
	
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
			u.updateUser(user);
			return true;
		
		
	}

	
	public boolean deleteUser(User userid) {
		// TODO Auto-generated method stub
	
			u.deleteUser(userid);
			return true;
		
	}


	public User validate(String name, String password) {
		// TODO Auto-generated method stub
		return u.validate(name, password);
	}
	
	
}
