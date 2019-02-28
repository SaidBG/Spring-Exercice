package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="warranty")
public class Warranty {
	@Id
	@GeneratedValue(
	strategy= GenerationType.AUTO,
	generator="native"
	)
	@GenericGenerator(
	name = "native",
	strategy = "native"
	)
	@Column(name="id_Warranty")
	long id;
	@Column(name="fullTexte")
		String fullTexte;
	@Column(name="summaryy")
		String summaryy;
	
	@OneToOne
	@JoinColumn(name="id_Item")
	Item item;
	public Warranty(long id, String fullTexte, String summaryy, Item item) {
		super();
		this.id = id;
		this.fullTexte = fullTexte;
		this.summaryy = summaryy;
		this.item = item;
	}
	
}
