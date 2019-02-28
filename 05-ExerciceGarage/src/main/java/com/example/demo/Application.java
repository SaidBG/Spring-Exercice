package com.example.demo;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.AddressRepo;
import com.example.demo.repo.BoxRepo;
import com.example.demo.repo.GarageRepo;
import com.example.demo.repo.LocationRepo;
import com.example.demo.repo.PersonRepo;
import com.example.demo.repo.VehiculeRepo;
import com.example.demo.repo.VoitureRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private static Log log = LogFactory.getLog(Application.class);
	@Autowired
	AddressRepo adressRepo;
	@Autowired
	BoxRepo boxRepo;
	@Autowired
	GarageRepo garageRepo;
	@Autowired
	LocationRepo locationRepo;
	@Autowired
	PersonRepo personRepo;
	@Autowired
	VehiculeRepo vehiculeRepo;
	@Autowired
	VoitureRepo voitureRepo;
	
	public static void main(String[] args ) {
		SpringApplication.run(Application.class, args);
	}

	
	public void run(String... args) throws Exception {
		String honda = "Honda";
		String nissan = "Nissan";
		String mercedes = "Mercedes";
		String bmw = "BMW";		
		
		///////////PROPRIETAIRE///////////		
		Date date = new Date();
		//--------------------------//
		Address adress = new Address(34070, "Montpellier");
		adressRepo.save(adress);
		log.info(adress.toString());
		//------------------------------//
		Person p = new Person("Said","Bg");
		personRepo.save(p);
		//------------------------------------//
		Garage garage = new Garage("Garage de Dede", adress, p);
		garageRepo.save(garage);
		/////////////////////////////////////////////////////////
		
		///////////PROPRIETAIRE///////////
		Person p1 = new Person("Said", "Pasbg");
		Person p2 = new Person("Nathan", "Pasbg");
		Person p3 = new Person("SaiDeux","PasBg");
		Person p4 = new Person("NathDeux", "PasBgG");
		personRepo.save(p1);
		personRepo.save(p2);
		personRepo.save(p3);
		personRepo.save(p4);
		///////////////////////////////////////////
		
		////////////VOITURES///////////		
		Voiture voiture1 = new Voiture(bmw, "Classe-E", date);
		Voiture voiture2 = new Voiture(nissan,"Skyline", date);
		Voiture voiture3 = new Voiture(honda,"CRX-VTEC",date);
		Voiture voiture4 = new Voiture(mercedes,"SLS", date);
		voitureRepo.save(voiture1);
		voitureRepo.save(voiture2);
		voitureRepo.save(voiture3);
		voitureRepo.save(voiture4);
		////////////////////////////////////////////////////
		
		
		////////////BOX/////////////
		Box box1 = new Box(5656, 45);
		Box box2 = new Box(8989,20);
		Box box3 = new Box(7373,65);
		Box box4 = new Box(2222,30);
		boxRepo.save(box1);
		boxRepo.save(box2);
		boxRepo.save(box3);
		boxRepo.save(box4);
		///////////////////////////
		
		///////////VEHICULES///////////		
		Vehicule vehicule1 = new Vehicule("45-566-AR", p2, voiture2);
		Vehicule vehicule2 = new Vehicule("78-69-MS", p3, voiture3);
		Vehicule vehicule3 = new Vehicule("21-43-BY", p4, voiture4);
		//---------------------------------------------------------//
		////////////////////UNE PERSON DEUX VEHICULE////////////////////
		Vehicule vehicule = new Vehicule("56-89-PO", p, voiture1);		
		Vehicule vehicule1bis = new Vehicule("45-566-AR",p,voiture2);
		vehiculeRepo.save(vehicule1);
		vehiculeRepo.save(vehicule2);
		vehiculeRepo.save(vehicule3);
		vehiculeRepo.save(vehicule);
		vehiculeRepo.save(vehicule1bis);		
		//////////////////////////////////////////////////////////////

		
				
		///////////LOCATION///////////
		Location location = new Location(date, date, 1000, box1, vehicule);
		Location location1 = new Location(date,date, 2000,box2,vehicule1);
		Location location2 = new Location(date,date, 3000,box3,vehicule2);
		Location location3 = new Location(date,date, 4000,box4,vehicule3);
		locationRepo.save(location);
		locationRepo.save(location1);
		locationRepo.save(location2);
		locationRepo.save(location3);		
		//////////////////////////////////////////////////
		
		
		
				
		
		
		
	
		
	}

}

