package com.example.contractmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contractmanagement.model.Contract;

public interface ContractorRepository extends JpaRepository<Contract, Integer> {

}
