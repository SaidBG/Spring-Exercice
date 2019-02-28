package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Vehicule {
	@Id
	@GeneratedValue(
			strategy= GenerationType.AUTO,
			generator="native"
			)
	@GenericGenerator(
			name = "native",
			strategy = "native"
			)
	@Column(name="id_Vehicule")
	long id;
	@Column(name="plaque")
	String plaque;
		
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_Person")
	Person person;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_Voiture")
	Voiture voiture;
	public Vehicule(String plaque, Person person, Voiture voiture) {
		super();
		this.plaque = plaque;
		this.person = person;
		this.voiture = voiture;
	}




}
