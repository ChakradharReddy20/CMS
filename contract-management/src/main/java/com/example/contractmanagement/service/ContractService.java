package com.example.contractmanagement.service;

import java.util.List;

import com.example.contractmanagement.model.Contract;

public interface ContractService {

	public String createContract(String contractType, Integer duration, String tnc, Integer supplierId, String status);
	public List<Contract> getCreatedContracts(String status);
}
