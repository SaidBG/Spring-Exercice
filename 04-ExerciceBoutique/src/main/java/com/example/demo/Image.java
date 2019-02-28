package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="image")
public class Image {
	@Id
	@GeneratedValue(
	strategy= GenerationType.AUTO,
	generator="native"
	)
	@GenericGenerator(
	name = "native",
	strategy = "native"
	)
	@Column(name="id_Image")
	long id;
	@Column(name="altText")
		String altText;
	@Column(name="path")
		String path;
	
	
	@ManyToOne
	@JoinColumn(name="id_Item")
	Item item;
	
    



	public Image(long id, String altText, String path) {
		super();
		this.id = id;
		this.altText = altText;
		this.path = path;
	}
	

	
}
