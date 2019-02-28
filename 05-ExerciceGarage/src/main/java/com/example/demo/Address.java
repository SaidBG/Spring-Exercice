package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
@Entity

public class Address {
	@Id
	@GeneratedValue(
	strategy= GenerationType.AUTO,
	generator="native"
	)
	@GenericGenerator(
	name = "native",
	strategy = "native"
	)
	@Column(name="id_Adress")
	Long id;
	@Column(name="postal")
		int code;
	@Column(name="ville")
		String ville;
	public Address(int code, String ville) {
		super();
		this.code = code;
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Adresse : "
				+ " Code Postal = "+ code +""
				+ " Ville = " + ville;
	}	
	
	
	
}
