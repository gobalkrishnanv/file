package com.niit.microcontroller.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.microcontroller.model.*;
@Repository("supplierDao")
@Transactional
public class SupplierDAOImp implements SupplierDAO{
    @Autowired
	SessionFactory sf;
	
	
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().createCriteria(Supplier.class).list();
	}

	
	public Supplier findSupplierid(int supplierid) {
		// TODO Auto-generated method stub
		return (Supplier)sf.getCurrentSession().get(Supplier.class,supplierid);
	}

	
	public Supplier findSuppliername(String suppliername) {
		// TODO Auto-generated method stub
		return (Supplier)sf.getCurrentSession().createCriteria(Supplier.class).add(Restrictions.eq("suppliername", suppliername)).uniqueResult();
	}

	
	public boolean addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(supplier);
		return true;
	}

	
	public boolean updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(supplier);
		return true;
	}

	
	public boolean deleteSupplier(Supplier supplierid) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(supplierid);
		return true;
	}

}
