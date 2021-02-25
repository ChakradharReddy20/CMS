package com.example.contractmanagement.repository;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.example.contractmanagement.model.Supplier;



@DataJpaTest
public class SupplierRepositoryTest {
	
	@Autowired
	private SupplierRepository supplierrepo;
	
	@Test
	@Rollback(false)
	void createSupplierTest() {
		Supplier supplier = new Supplier();
		supplier.setId(1);
		supplier.setName("supplier");
		supplier.setPassword("supplier");
		supplier.setContactNumber("123");
		supplier.setAddress("address");
		
		Supplier savedSupplier = supplierrepo.save(supplier);
		
		assertNotNull(savedSupplier);
	}

}
