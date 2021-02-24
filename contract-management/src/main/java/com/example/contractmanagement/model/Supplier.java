package com.example.contractmanagement.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "suppliers")
@NoArgsConstructor
@Getter
@Setter
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "Name", length = 50)
	@Size(max = 50, min = 4, message = "Name should have a minimum of 4 characters and maximum of 50 characters")
	private String name;
	
	@Column(name="Password", length = 50)
	@Size(max = 50, min = 8, message = "Password should have a minimum of 8 characters and maximum of 50 characters")
	private String password;
	
	@Column(name="ContactNumber", length = 10)
	@Size(max=10, min=10, message="Contact number should have only 10 numbers")
	private String contactNumber;
	
	@Column(name="Address", length = 500)
	@Size(max=500,message="Addresss should have a maximum of 500 characters")
	private String address;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="typeId")
	private Types type;
	
	
	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", password=" + password + ", contactNumber=" + contactNumber
				+ ", address=" + address + ", type=" + type.getType() + "]";
	}
}
