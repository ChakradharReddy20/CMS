package com.example.contractmanagement.model;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SupplierTest {

	Supplier supplier = new Supplier();
	Types type = new Types();
	
	@Test
	public void testId() {
		supplier.setId(1);
		assertEquals(supplier.getId(), 1);
	}
	
	@Test
	public void testName() {
		supplier.setName("supplier");
		assertEquals(supplier.getName(), "supplier");
	}
	
	@Test
	public void testPassword() {
		supplier.setPassword("supplier");
		assertEquals(supplier.getPassword(), "supplier");
	}
	
	
	@Test
	public void testContactNumber() {
		supplier.setContactNumber("1983323");
		assertEquals(supplier.getContactNumber(), "1983323");
	}
	
	
	@Test
	public void testAddress() {
		supplier.setAddress("address");
		assertEquals(supplier.getAddress(), "address");
	}
	
	
	@Test
	public void testType() {
		type.setId(1);
		type.setType("type1");
		supplier.setTypes(type);
		assertEquals(supplier.getTypes(), type);
	}
	
	@Test
	public void testToString() {
		supplier.setId(1);
		supplier.setName("supplier");
		supplier.setPassword("supplier");
		supplier.setContactNumber("123");
		supplier.setAddress("address");
		type.setId(1);
		type.setType("type1");
		supplier.setTypes(type);
		assertTrue(supplier.toString().contains("supplier"));
	}
}
