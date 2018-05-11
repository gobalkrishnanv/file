package com.niit.basic.Basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.basic.config.ApplicationContext;
import com.niit.basic.model.Cart;
import com.niit.basic.service.CartService;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ApplicationContext.class)


public class CartTest {
@Autowired
private CartService cs;
public Cart c1,c2,c3;
@Test
  public void setup(){
	c1=new Cart();
	c1.setAccount_number(1234556);
	c1.setCash(5000);
	c1.setId(1);
	c1.setName("Superman");
	c1.setPassword(5789);
	assertEquals(true,cs.addCart(c1));
   
	c2=new Cart();
	c2.setAccount_number(234235);
	c2.setCash(5652);
	c2.setId(2);
	c2.setName("BATMAN");
	c2.setPassword(5234);
	assertEquals(true,cs.addCart(c2));

	c3=new Cart();
	c3.setAccount_number(2352345);
	c3.setCash(50000);
	c3.setId(3);
	c3.setName("SPIDERMAN");
	c3.setPassword(5789234);
	assertEquals(true,cs.addCart(c3));

   
 }

}
