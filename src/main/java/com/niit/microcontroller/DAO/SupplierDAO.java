package com.niit.microcontroller.DAO;

import java.util.List;

import com.niit.microcontroller.model.*;
public interface SupplierDAO {
public List<Supplier> getAllSupplier();
public Supplier findSupplierid(int supplierid);
public Supplier findSuppliername(String suppliername);
public boolean addSupplier(Supplier supplier);
public boolean updateSupplier(Supplier supplier);
public boolean deleteSupplier(Supplier supplierid);
}
