package com.example.contractmanagement.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmenitiesTest {

	Amenities amenities = new Amenities();
	@Test
	void testId() {
		amenities.setId(1);
		assertEquals(amenities.getId(), 1);
	}

	@Test
	void testAminity() {
		amenities.setAminity("Amenities1, Amenities2");
		assertEquals(amenities.getAminity(), "Amenities1, Amenities2");
	}
	
	@Test
	void testToString() {
		amenities.setAminity("Amenities1, Amenities2");
		amenities.setId(1);
		String tostring="Amenities [id=1, aminity=Amenities1, Amenities2]";
		assertEquals(amenities.toString(), tostring);
	}
	
	@Test
	void testContract() {
		Contract contract = new Contract();
		contract.setId(1);
		contract.setContractType("Some Text");
		contract.setContractDuration(1);
		contract.setTermsAndConditions("Some Text");
		contract.setStatus("dummy status");
		amenities.setContract(contract);
		
		assertEquals(amenities.getContract(), contract);
	}
}
