package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
@Entity

public class Box {
	@Id
	@GeneratedValue(
			strategy= GenerationType.AUTO,
			generator="native"
			)
	@GenericGenerator(
			name = "native",
			strategy = "native"
			)
	@Column(name="id_Box")
	Long id;
	
	@Column(name="numero")
	int numEmplacement;
	@Column(name="surface")
	double surface;

	
	public Box(int numEmplacement, double surface) {
		super();
		this.numEmplacement = numEmplacement;
		this.surface = surface;		
	}
	
	
	
}
