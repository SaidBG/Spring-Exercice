package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="item")
public class Item {
	@Id
	@GeneratedValue(
	strategy= GenerationType.AUTO,
	generator="native"
	)
	@GenericGenerator(
	name = "native",
	strategy = "native"
	)
	@Column(name="id_Item" )
	long id;
	@Column(name="name", nullable = false, length = 30)
		String name;
	@Column(name="code",nullable = false, columnDefinition = "varchar(30)")
		String code;
	@Column(name="description", nullable = false, columnDefinition = "varchar(255)")
		String description;
	@Column(name="price", nullable = false, precision = 8, scale = 2)
		double prix;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name="item_category",joinColumns=@JoinColumn(name="id_Item"),inverseJoinColumns=@JoinColumn(name="id_Category"))	
	Set<Category> category = new HashSet<>();
	
	@OneToOne
	@JoinColumn(name="id_Warranty")	
	Warranty garantie;
	
	@ManyToOne
	@JoinColumn(name="id_Image")	
	Image image;
	
	
	
	
	public Item(long id, String name, String code, String description, double prix,
			Warranty garantie, Image image) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.description = description;
		this.prix = prix;		
		this.garantie = garantie;
		this.image = image;
	}
	
	

		
		

	
	
}


