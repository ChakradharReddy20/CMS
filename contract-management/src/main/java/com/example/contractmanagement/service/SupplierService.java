package com.example.contractmanagement.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.contractmanagement.model.AuthResponse;
import com.example.contractmanagement.model.Supplier;

public interface SupplierService extends UserDetailsService {
	public Supplier login(@RequestBody Supplier supplierlogincredentials);
	public Supplier signup(@RequestBody Supplier suppliersignupcredentials);
	public AuthResponse getValidity(@RequestHeader("Authorization") final String token);
}
