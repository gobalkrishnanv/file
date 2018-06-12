package com.niit.microcontroller.ArduinoBackend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;


import com.niit.microcontroller.config.ApplicationContext;
import com.niit.microcontroller.model.*;
import com.niit.microcontroller.Service.*;
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
	c1.setCash(5000);
	c1.setId(1);
	c1.setName("Superman");
	assertEquals(true,cs.addCart(c1));
   
	c2=new Cart();
	c2.setCash(5652);
	c2.setId(2);
	c2.setName("BATMAN");
	assertEquals(true,cs.addCart(c2));

	c3=new Cart();
	c3.setCash(50000);
	c3.setId(3);
	c3.setName("SPIDERMAN");
	assertEquals(true,cs.addCart(c3));

   
 }

}
