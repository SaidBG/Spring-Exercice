package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class Location {
	@Id
	@GeneratedValue(
	strategy= GenerationType.AUTO,
	generator="native"
	)
	@GenericGenerator(
	name = "native",
	strategy = "native"
	)
	@Column(name="id_Location")
	long id;
	

	@Column(name="dateDebut")
	Date dateDebut;
	@Column(name="dateFin")
	Date dateFin;
	@Column(name="tarif")
	int tarif;
	@ManyToOne
	@JoinColumn(name="id_Box")
	Box box;
	
	@ManyToOne
	@JoinColumn(name="id_Vehicule")
	Vehicule vehicule;

	public Location(Date dateDebut, Date dateFin, int tarif, Box box, Vehicule vehicule) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.tarif = tarif;
		this.box = box;
		this.vehicule = vehicule;
	}
	
	
}
