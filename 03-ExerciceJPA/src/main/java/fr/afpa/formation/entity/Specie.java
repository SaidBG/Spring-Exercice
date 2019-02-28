package fr.afpa.formation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;




@Entity
@Table(name= "Specie")
public class Specie {
	public Specie() {
		
	}
	
	
	public Specie( String commonName, String latinName) {
		super();
		this.commonName = commonName;
		this.latinName = latinName;
	}
	
	
	public Specie(long id, String commonName, String latinName) {
		super();
		this.id = id;
		this.commonName = commonName;
		this.latinName = latinName;
	}
	
	@Id
	@GeneratedValue(
	strategy= GenerationType.AUTO,
	generator="native"
	)
	@GenericGenerator(
	name = "native",
	strategy = "native"
	)
	@Column(name="id_Specie")
	long id;
	@Column(name="CommonName")
		String commonName;
	@Column(name="LatinName")
		String latinName;
	@Override
	public String toString() {
		return "Specie [id=" + id + ", commonName=" + commonName + ", latinName=" + latinName + "]";
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCommonName() {
		return commonName;
	}


	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}


	public String getLatinName() {
		return latinName;
	}


	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
	
	
	
	

}
