package com.niit.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.basic.DAO.SupplierDAO;
import com.niit.basic.model.Supplier;

@Service
public class SupplierServiceImp implements SupplierService {
    @Autowired
    SupplierDAO s;
    
	@Override
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		return s.getAllSupplier();
	}

	@Override
	public Supplier findSupplierid(int supplierid) {
		// TODO Auto-generated method stub
		return s.findSupplierid(supplierid);
	}

	@Override
	public Supplier findSuppliername(String suppliername) {
		// TODO Auto-generated method stub
		return s.findSuppliername(suppliername);
	}

	@Override
	public boolean addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
	
			s.addSupplier(supplier);
			return true;
		
		
	}

	@Override
	public boolean updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		
			s.updateSupplier(supplier);
			return true;
		
		}

	@Override
	public boolean deleteSupplier(int supplierid) {
		// TODO Auto-generated method stub
		
			s.deleteSupplier(supplierid);
		    return true;
	}

}
