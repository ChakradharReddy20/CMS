package com.example.contractmanagement.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;


class ContractorTest {

	Contractor contractor = new Contractor();
	
	
	@Test
	void testId() {
		contractor.setId(1);
		assertEquals(contractor.getId(), 1);
		
	}

	@Test
	void testName() {
		contractor.setName("contractor");
		assertEquals(contractor.getName(), "contractor");
	}

	@Test
	void testPassword() {
		contractor.setPassword("contractor");
		assertEquals(contractor.getPassword(),"contractor");
	}

	
	@Test
	void testToString() {
		contractor.setId(1);
		contractor.setName("contractor");
		contractor.setPassword("contractor");
		String tostring="Contractor(id=1, name=contractor, password=contractor)";
		assertEquals(contractor.toString(), tostring);
	}

}
