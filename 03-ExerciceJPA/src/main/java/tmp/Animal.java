package tmp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import fr.afpa.formation.entity.Specie;

@Entity
public class Animal {
	
	
	public Animal(String name, String sex, String coatColor, Specie specie) {
		super();
		this.name = name;
		this.sex = sex;
		this.coatColor = coatColor;
		this.specie = specie;
	}
	
	
	
	
	
	public Animal(long id, String name, String sex, String coatColor, Specie specie) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.coatColor = coatColor;
		this.specie = specie;
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
	@Column(name="id_Animal")
	long id;
	@Column(name="Name")
		String name;
	@Column(name="Sex")
		String sex;
	@Column(name="CoatColor")
		String coatColor;
	@Column(name="id_Specie")
	Specie specie;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
