package com.niit.basic.Basic;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

import com.niit.basic.config.ApplicationContext;
import com.niit.basic.model.Product;
import com.niit.basic.service.ProductService;

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
	   p.setQuantity("1");
	   p.setType("L");
	   ps.addProduct(p);
	
	   p1=new Product();
	   p1.setId(2);
	   p1.setName("atmega16");
	   p1.setPrice("180");
	   p1.setQuantity("2");
	   p1.setType("L");
	   ps.addProduct(p1);
	
	   p2=new Product();
	   p2.setId(3);
	   p2.setName("atmega328");
	   p2.setPrice("145");
	   p2.setQuantity("5");
	   p2.setType("L");
	   ps.addProduct(p2);
	  
	   p.setPrice("125");
       assertEquals(true,ps.updateProduct(p));
       
       
       assertEquals(true,ps.deleteProduct(1));   
   }
   
  
   
   
   
   
}
