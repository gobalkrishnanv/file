package com.niit.basic.DAO;

import java.util.List;

import com.niit.basic.model.User;

public interface UserDAO {
  public List<User> getAllUser();
  public User findUserid(int userid);
  public User findUsername(String username);
  public boolean addUser(User user);
  public boolean updateUser(User user);
  public boolean deleteUser(int  userid);
  
}
