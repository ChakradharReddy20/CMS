package com.example.contractmanagement.model;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ContractTest {

	Contract contract = new Contract();
	@Test
	void testId() {
		contract.setId(1);
		assertEquals(contract.getId(), 1);
	}
	
	@Test
	void testContractType() {
		contract.setContractType("Some Text");
		assertEquals(contract.getContractType(), "Some Text");
	}
	@Test
	void testContractDuration() {
		contract.setContractDuration(1);
		assertEquals(contract.getContractDuration(), 1);
	}
	
	@Test
	void testContractTermsAndConditions() {
		contract.setTermsAndConditions("Some Text");
		assertEquals(contract.getTermsAndConditions(), "Some Text");
	}
	
	@Test
	void testStatus() {
		contract.setStatus("dummy status");
		assertEquals(contract.getStatus(), "dummy status");
	}
	
	@Test
	void testAminites() {
		Amenities amenities = new Amenities();
		amenities.setId(1);
		amenities.setAminity("Amenities1, Amenities2");
		amenities.setContract(null);
		contract.setAmenities(amenities);
		assertEquals(contract.getAmenities(),amenities);
	}
	
	@Test
	void testSupplier() {
		contract.setId(1);
		contract.setContractType("Some Text");
		contract.setContractDuration(1);
		contract.setTermsAndConditions("Some Text");
		contract.setStatus("dummy status");
		Supplier supplier = new Supplier();
		supplier.setId(1);
		contract.setSupplier(supplier);
		
		Amenities amenities = new Amenities();
		amenities.setId(1);
		amenities.setAminity("Amenities1, Amenities2");
		amenities.setContract(null);
		contract.setAmenities(amenities);
		log.info(contract.toString());
		String tostring="Contract [id=1, contractType=Some Text, contractDuration=1, termsAndConditions=Some Text, supplier=1, status=dummy status, amenities=Amenities [id=1, aminity=Amenities1, Amenities2]]";
		assertEquals(contract.toString(), tostring);
	}

	
}
