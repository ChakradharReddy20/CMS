package com.example.contractmanagement.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AmenitiesTest {

	Amenities amenities = new Amenities();
	private Validator validator;
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
	
	@BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
	
	@Test
	void testValidations() {
		String ctype="";
		for (int i = 0; i<=600; i++)
			ctype = ctype+"a";
		amenities.setAminity(ctype);
		Set<ConstraintViolation<Amenities>> violations = validator.validate(amenities);
		assertFalse(violations.isEmpty());
	}
}
