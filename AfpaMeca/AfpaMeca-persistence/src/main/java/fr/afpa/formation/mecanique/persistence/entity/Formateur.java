package fr.afpa.formation.mecanique.persistence.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue(value="FOR")
public class Formateur  extends Utilisateur {

	
	/**
	 * <b>CONSTRUCTEUR SANS ARGUMENT</b>
	 */
	public Formateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * <b>CONSTRUCTEUR AVEC LES ARGUMENTS SUIVANTS :</b><br/>
	 * TOUS LES ATTRIBUTS Y COMPRIS L'ID.<br/>
	 * (UTILISE LORS DES OPERATIONS DE RECHERCHE ET D'EXTRACTION 'findBy'). <br/>
	 */

	public Formateur(Long id, String mail, String nom, String prenom, String telephone, String identifiant,
			String motDePasse, Date dateInscription, Date dateRadiation) {
		super(id, mail, nom, prenom, telephone, identifiant, motDePasse, dateInscription, dateRadiation);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <b>CONSTRUCTEUR AVEC LES ARGUMENTS SUIVANTS :</b><br/>
	 * TOUS LES ATTRIBUTS SAUF L'ID.<br/>
	 * (UTILISE LORS DES OPERATIONS DE CREATION 'create'). <br/>
	 */
	public Formateur(String mail, String nom, String prenom, String telephone, String identifiant,
			String motDePasse, Date dateInscription, Date dateRadiation) {
		super( mail, nom, prenom, telephone, identifiant, motDePasse, dateInscription, dateRadiation);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
