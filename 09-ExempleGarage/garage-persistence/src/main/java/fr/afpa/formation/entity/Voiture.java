package fr.afpa.formation.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Voiture {
	@Id
	@GeneratedValue(
			strategy= GenerationType.AUTO,
			generator="native"
			)
	@GenericGenerator(
			name = "native",
			strategy = "native"
			)
	@Column(name="id_Voiture")
	long id;
	@Column(name="modele")
	String modele;
	@Column(name="marque")
	String marque;
	@Column(name="annee")
	Date annee;
	/*@OneToMany(fetch = FetchType.EAGER,mappedBy= "voiture", cascade= CascadeType.REFRESH)
	Set<Vehicule> listVehicule = new HashSet<>();*/
	public Voiture(String modele, String marque, Date annee) {
		super();
		this.modele = modele;
		this.marque = marque;
		this.annee = annee;

	}






}
