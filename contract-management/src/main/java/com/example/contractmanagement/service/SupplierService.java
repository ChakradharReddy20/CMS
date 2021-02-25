package com.example.contractmanagement.service;

import java.util.Map;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.contractmanagement.model.AuthResponse;
import com.example.contractmanagement.model.Supplier;
import com.example.contractmanagement.model.SupplierDetails;

public interface SupplierService extends UserDetailsService {
	public Map<String, String> login(@RequestBody Supplier supplierlogincredentials);
	public Supplier signup(@RequestBody SupplierDetails suppliersignupcredentials);
	public AuthResponse getValidity(@RequestHeader("Authorization") final String token);
}
