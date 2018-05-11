package com.niit.basic.Basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.basic.config.ApplicationContext;
import com.niit.basic.model.User;
import com.niit.basic.service.UserService;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ApplicationContext.class)
public class UserTest {
@Autowired
private UserService us;
public User u1,u2;

@Test
public void user1(){
	u1=new User();
	u1.setId(1);
	u1.setName("abc");
	u1.setPassword("abce");
	u1.setEmail("a@gmail.com");
	u1.setAddress("sdfasfsdf");
	u1.setNumber("6546546554");
	assertEquals(true,us.addUser(u1));

	u2=new User();
	u2.setId(2);
	u2.setName("sdf");
	u2.setNumber("6546546554");
	u2.setPassword("abce");
	u2.setEmail("a@gmail.com");
	u2.setAddress("sdfasfsdf");
	assertEquals(true,us.addUser(u2));

    assertEquals(true, us.deleteUser(2));

}

}
