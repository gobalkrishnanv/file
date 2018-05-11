package com.niit.basic.DAO;

import java.util.List;

import com.niit.basic.model.Supplier;

public interface SupplierDAO {
public List<Supplier> getAllSupplier();
public Supplier findSupplierid(int supplierid);
public Supplier findSuppliername(String suppliername);
public boolean addSupplier(Supplier supplier);
public boolean updateSupplier(Supplier supplier);
public boolean deleteSupplier(int supplierid);
}
