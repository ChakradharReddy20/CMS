package com.example.contractmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.contractmanagement.model.Amenities;
@Repository
public interface AmenitiesRepository extends JpaRepository<Amenities, Integer> {

}
