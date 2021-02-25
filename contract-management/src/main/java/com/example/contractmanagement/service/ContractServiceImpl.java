package com.example.contractmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contractmanagement.exceptionhandling.NoCreatedContractsException;
import com.example.contractmanagement.exceptionhandling.SupplierNotFoundException;
import com.example.contractmanagement.model.Contract;
import com.example.contractmanagement.model.Supplier;
import com.example.contractmanagement.repository.ContractRepository;
import com.example.contractmanagement.repository.SupplierRepository;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ContractServiceImpl implements ContractService {

	@Autowired
	private ContractRepository contractRepo;
    @Autowired
	private SupplierRepository supplierRepo;
	@Override
	public String createContract(String contractType, Integer duration, String tnc,Integer supplierId, String status) {
		log.info("START");
		Contract contract = new Contract();
		contract.setContractType(contractType);
		contract.setContractDuration(duration);
		contract.setTermsAndConditions(tnc);
		Supplier supplier = supplierRepo.findById(supplierId).orElse(null);
		if (supplier == null) {
			log.error("Supplier Not Found. Throwing SupplierNotFound Exception");
			throw new SupplierNotFoundException();
		}
		contract.setSupplier(supplier);
		contract.setStatus(status);
		contractRepo.save(contract);
		log.info("END");
		return "Updated successfully";
	}
	@Override
	public List<Contract> getCreatedContracts(String status) {
		log.info("START");
		List<Contract> contracts = contractRepo.findByStatusContains(status);
		if(contracts.isEmpty()) {
			log.error("Found no contractors. Throwing NoContractorsException");
			throw new NoCreatedContractsException();
		}
		log.info("END");
		return contracts;
	}

}
