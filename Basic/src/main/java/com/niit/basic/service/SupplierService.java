package com.niit.basic.service;

import java.util.List;

import com.niit.basic.model.Supplier;

public interface SupplierService {
  public List<Supplier> getAllSupplier();
  public Supplier findSupplierid(int supplierid);
  public Supplier findSuppliername(String suppliername);
  public boolean addSupplier(Supplier supplier);
  public boolean updateSupplier(Supplier supplier);
  public boolean deleteSupplier(int supplierid);
}
