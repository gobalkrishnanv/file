package com.niit.basic.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.basic.model.Supplier;

@Repository("supplierDao")
@Transactional
public class SupplierDAOImp implements SupplierDAO{
    @Autowired
	SessionFactory sf;
	
	@Override
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().createQuery("from supplier").list();
	}

	@Override
	public Supplier findSupplierid(int supplierid) {
		// TODO Auto-generated method stub
		return (Supplier)sf.getCurrentSession().createQuery("from supplier where supplierid"+supplierid).uniqueResult();
	}

	@Override
	public Supplier findSuppliername(String suppliername) {
		// TODO Auto-generated method stub
		return (Supplier)sf.getCurrentSession().createQuery("from supplier where suppliername"+suppliername).uniqueResult();
	}

	@Override
	public boolean addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(supplier);
		return true;
	}

	@Override
	public boolean updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(supplier);
		return true;
	}

	@Override
	public boolean deleteSupplier(int supplierid) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(findSupplierid(supplierid));
		return true;
	}

}
