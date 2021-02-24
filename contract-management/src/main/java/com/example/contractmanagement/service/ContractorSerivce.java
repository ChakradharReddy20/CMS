package com.example.contractmanagement.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.contractmanagement.model.AuthResponse;
import com.example.contractmanagement.model.Contractor;

public interface ContractorSerivce extends UserDetailsService{
	public Contractor login(@RequestBody Contractor adminlogincredentials);
	public AuthResponse getValidity(@RequestHeader("Authorization") final String token);
}

