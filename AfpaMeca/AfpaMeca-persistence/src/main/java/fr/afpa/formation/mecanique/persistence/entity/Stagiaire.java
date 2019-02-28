package fr.afpa.formation.mecanique.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;

@DiscriminatorValue(value="STA")
public class Stagiaire extends Utilisateur {
	
	
	@Column(unique=true)
	private String numeroCarte;
	
	
	
	/**
	 * <b>CONSTRUCTEUR SANS ARGUMENT</b>
	 */
	
	public Stagiaire() {
		super();
	}
	
	/**
	 * <b>CONSTRUCTEUR AVEC LES ARGUMENTS SUIVANTS :</b><br/>
	 * TOUS LES ATTRIBUTS SAUF L'ID.<br/>
	 * (UTILISE LORS DES OPERATIONS DE CREATION 'create'). <br/>
	 */

	public Stagiaire(Long id, String mail, String nom, String prenom, String telephone, String identifiant,
			String motDePasse, Date dateInscription, Date dateRadiation, String numeroCarte) {
		super(id, mail, nom, prenom, telephone, identifiant, motDePasse, dateInscription, dateRadiation);
		this.numeroCarte = numeroCarte;
		// TODO Auto-generated constructor stub
	}
	public Stagiaire(String mail, String nom, String prenom, String telephone, String identifiant,
			String motDePasse, Date dateInscription, Date dateRadiation, String numeroCarte) {
		super( mail, nom, prenom, telephone, identifiant, motDePasse, dateInscription, dateRadiation);
		this.numeroCarte = numeroCarte;
		// TODO Auto-generated constructor stub
	}

	public String getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(String numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	@Override
	public String toString() {
		return "Stagiaire numeroCarte = " + numeroCarte;
	}
	
	

	




		














}
