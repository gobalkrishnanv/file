package com.niit.microcontroller.Service;

import java.util.List;

import com.niit.microcontroller.model.*;
public interface SupplierService {
  public List<Supplier> getAllSupplier();
  public Supplier findSupplierid(int supplierid);
  public Supplier findSuppliername(String suppliername);
  public boolean addSupplier(Supplier supplier);
  public boolean updateSupplier(Supplier supplier);
  public boolean deleteSupplier(Supplier supplierid);
}
