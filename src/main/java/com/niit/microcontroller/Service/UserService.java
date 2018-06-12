package com.niit.microcontroller.Service;

import java.util.List;

import com.niit.microcontroller.model.*;
public interface UserService {
  public List<User> getAllUser();
  public User findUserid(int userid);
  public User findUsername(String username);
  public boolean addUser(User user);
  public boolean updateUser(User user);
  public boolean deleteUser(User userid);
  public User validate(String name,String password);
}
