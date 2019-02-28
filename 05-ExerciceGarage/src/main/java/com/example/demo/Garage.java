package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
@Entity

public class Garage {
	
	@Id
	@GeneratedValue(
	strategy= GenerationType.AUTO,
	generator="native"
	)
	@GenericGenerator(
	name = "native",
	strategy = "native"
	)
	@Column(name="id_Garage")
	long id;
	@Column(name="nom")
	String nom;
	@ManyToOne
	@JoinColumn(name="id_Adresse")
	Address adresse;
	@ManyToOne
	@JoinColumn(name="id_Person")
	Person proprio;
	@OneToMany
	@JoinTable(name="garage_box", joinColumns=@JoinColumn(name="id_Garage"), inverseJoinColumns=@JoinColumn(name="id_Box"))	
	Set<Box> boxes = new HashSet<>();
	public Garage(String nom, Address adresse, Person proprio) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.proprio = proprio;
		
	}
	
}
