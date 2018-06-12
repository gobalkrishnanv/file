package com.niit.microcontroller.DAO;

import java.util.List;

import com.niit.microcontroller.model.*;
public interface UserDAO {
  public List<User> getAllUser();
  public User findUserid(int userid);
  public User findUsername(String username);
  public boolean addUser(User user);
  public boolean updateUser(User user);
  public boolean deleteUser(User  userid);
  public User validate(String username,String password);
}
