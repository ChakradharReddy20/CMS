package com.example.contractmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.contractmanagement.model.AuthResponse;
import com.example.contractmanagement.model.Contractor;
import com.example.contractmanagement.model.Supplier;
import com.example.contractmanagement.service.ContractorSerivce;
import com.example.contractmanagement.service.SupplierService;

@RestController
public class AuthController {

	@Autowired
	private SupplierService supplierDetailsService;
	
	@Autowired
	private ContractorSerivce contractAdminDetailsService;


	@RequestMapping(value = "/supplierlogin", method = RequestMethod.POST)
	public Supplier login(@RequestBody Supplier supplierlogincredentials) {
		return supplierDetailsService.login(supplierlogincredentials);
	}
	
	@RequestMapping(value = "/adminlogin", method = RequestMethod.POST)
	public Contractor login(@RequestBody Contractor adminlogincredentials) {
		return contractAdminDetailsService.login(adminlogincredentials);
	}

	@RequestMapping(value = "/suppliervalidate", method = RequestMethod.GET)
	public AuthResponse getSupplierValidity(@RequestHeader("Authorization") final String token) {
		return supplierDetailsService.getValidity(token);
	}
	
	@RequestMapping(value = "/adminvalidate", method = RequestMethod.GET)
	public AuthResponse getAdminValidity(@RequestHeader("Authorization") final String token) {
		return contractAdminDetailsService.getValidity(token);
	}

	@RequestMapping(value="/signup", method = RequestMethod.POST)
	public Supplier signUp(@RequestBody Supplier supplierlogincredentials) {
		return supplierDetailsService.signup(supplierlogincredentials);
	}
	

}
