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
public class SupplierTest {
@Autowired
 private SupplierService ss;
 public Supplier s1;

@Test
public void service1(){
   s1=new Supplier(); 
   s1.setId(1);
 
   s1.setName("gobal krishnan");
  
   assertEquals(true, ss.addSupplier(s1));
   
   


}


@Test
public void service2(){
	Supplier s2=new Supplier(); 
	   s2.setId(2);
	   s2.setName("appu");
	  

	   assertEquals(true, ss.addSupplier(s2));

}

}
