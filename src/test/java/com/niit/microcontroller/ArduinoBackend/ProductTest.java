package com.niit.microcontroller.ArduinoBackend;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.microcontroller.Service.ProductService;
import com.niit.microcontroller.config.ApplicationContext;
import com.niit.microcontroller.model.Product;
@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ApplicationContext.class)

public class ProductTest {
   @Autowired
   private ProductService ps;
   Product p,p1,p2;
   
   @Test
   public void setup(){
	   p=new Product();
	   p.setId(1);
	   p.setName("atmega8");
	   p.setPrice("150");
	   p.setType("L");
	   ps.addProduct(p);
	
	   p1=new Product();
	   p1.setName("atmega16");
	   p1.setPrice("180");
	   p1.setType("L");
	   ps.addProduct(p1);
	
	   p2=new Product();
	   p2.setName("atmega32");
	   p2.setPrice("145");
	   p2.setType("L");
	   ps.addProduct(p2);
	  
	   p.setPrice("125");
       assertEquals(true,ps.updateProduct(p));
       
       
   }
   
  
   
   
   
   
}
