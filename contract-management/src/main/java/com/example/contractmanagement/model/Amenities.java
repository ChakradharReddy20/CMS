package com.example.contractmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "amenities")
@NoArgsConstructor
public class Amenities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "ContractId")
	private Contract contract;
	
	@Column(name="Aminity", length = 500)
	private String aminity;

	@Override
	public String toString() {
		return "Amenities [id=" + id + ", aminity=" + aminity + "]";
	}

	
	
	
}
