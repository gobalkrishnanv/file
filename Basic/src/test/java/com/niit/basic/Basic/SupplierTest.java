package com.niit.basic.Basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.basic.config.ApplicationContext;
import com.niit.basic.model.Supplier;
import com.niit.basic.service.SupplierService;
import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ApplicationContext.class)
public class SupplierTest {
@Autowired
 private SupplierService ss;
 public Supplier s1;

@Test
public void service1(){
   s1=new Supplier(); 
   s1.setId(1);
 
   s1.setName("gobal krishnan");
   s1.setNumber("5645465"); 
   s1.setCompany_name("Atmel");
   s1.setAddress("abc");
   assertEquals(true, ss.addSupplier(s1));
   
   


}


@Test
public void service2(){
	Supplier s2=new Supplier(); 
	   s2.setId(2);
	   s2.setName("appu");
	   s2.setNumber("65745646541"); 
	   s2.setCompany_name("power");
	   s2.setAddress("xyz");

	   assertEquals(true, ss.addSupplier(s2));

}

}
