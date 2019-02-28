package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")
	@Column(name="id_Person")
	long id;	
	@Column(name="prenom")
	String prenom;
	@Column(name="nom")
	String nom;	
	@OneToMany(fetch = FetchType.EAGER,mappedBy= "person", cascade= CascadeType.REFRESH)
	Set<Vehicule> vehicule = new HashSet<>();
	
	public Person(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		
	}
	
}
