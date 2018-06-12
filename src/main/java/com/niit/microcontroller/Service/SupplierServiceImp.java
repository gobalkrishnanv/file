package com.niit.microcontroller.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.microcontroller.DAO.*;
import com.niit.microcontroller.model.*;
@Service
public class SupplierServiceImp implements SupplierService {
    @Autowired
    SupplierDAO s;
    
	
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		return s.getAllSupplier();
	}

	
	public Supplier findSupplierid(int supplierid) {
		// TODO Auto-generated method stub
		return s.findSupplierid(supplierid);
	}

	
	public Supplier findSuppliername(String suppliername) {
		// TODO Auto-generated method stub
		return s.findSuppliername(suppliername);
	}

	
	public boolean addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
	
			s.addSupplier(supplier);
			return true;
		
		
	}

	
	public boolean updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		
			s.updateSupplier(supplier);
			return true;
		
		}

	
	public boolean deleteSupplier(Supplier supplierid) {
		// TODO Auto-generated method stub
		
			s.deleteSupplier(supplierid);
		    return true;
	}

}
