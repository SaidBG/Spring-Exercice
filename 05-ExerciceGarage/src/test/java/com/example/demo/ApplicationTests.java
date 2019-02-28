package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.repo.AddressRepo;


@RunWith(SpringRunner.class) 
@DataJpaTest
@ContextConfiguration(classes=SmallApp.class)
public class ApplicationTests {
	@Autowired
	private TestEntityManager testManage;
	@Autowired
	AddressRepo testAdress;

	@Before
	public void setUp() {
		///////////PROPRIETAIRE///////////		
		Date date = new Date();
		//--------------------------//
		Address adress = new Address(34070, "Montpellier");
		testManage.persist(adress);

		//------------------------------//
		Person p = new Person("Said","Bg");
		testManage.persist(p);
		//------------------------------------//
		Garage garage = new Garage("Garage de Dede", adress, p);
		testManage.persist(garage);
		/////////////////////////////////////////////////////////

		///////////PROPRIETAIRE///////////
		Person p1 = new Person("Said", "Pasbg");
		Person p2 = new Person("Nathan", "Pasbg");
		Person p3 = new Person("SaiDeux","PasBg");
		Person p4 = new Person("NathDeux", "PasBgG");
		testManage.persist(p1);
		testManage.persist(p2);
		testManage.persist(p3);
		testManage.persist(p4);
		///////////////////////////////////////////

		////////////VOITURES///////////		
		Voiture voiture1 = new Voiture("bmw", "Classe-E", date);
		Voiture voiture2 = new Voiture("nissan","Skyline", date);
		Voiture voiture3 = new Voiture("honda","CRX-VTEC",date);
		Voiture voiture4 = new Voiture("mercedes","SLS", date);
		testManage.persist(voiture1);
		testManage.persist(voiture2);
		testManage.persist(voiture3);
		testManage.persist(voiture4);
		////////////////////////////////////////////////////


		////////////BOX/////////////
		Box box1 = new Box(5656, 45);
		Box box2 = new Box(8989,20);
		Box box3 = new Box(7373,65);
		Box box4 = new Box(2222,30);
		testManage.persist(box1);
		testManage.persist(box2);
		testManage.persist(box3);
		testManage.persist(box4);
		///////////////////////////

		///////////VEHICULES///////////		
		Vehicule vehicule1 = new Vehicule("45-566-AR", p2, voiture2);
		Vehicule vehicule2 = new Vehicule("78-69-MS", p3, voiture3);
		Vehicule vehicule3 = new Vehicule("21-43-BY", p4, voiture4);
		//---------------------------------------------------------//
		////////////////////UNE PERSON DEUX VEHICULE////////////////////
		Vehicule vehicule = new Vehicule("56-89-PO", p, voiture1);		
		Vehicule vehicule1bis = new Vehicule("45-566-AR",p,voiture2);
		testManage.persist(vehicule1);
		testManage.persist(vehicule2);
		testManage.persist(vehicule3);
		testManage.persist(vehicule);
		testManage.persist(vehicule1bis);		
		//////////////////////////////////////////////////////////////



		///////////LOCATION///////////
		Location location = new Location(date, date, 1000, box1, vehicule);
		Location location1 = new Location(date,date, 2000,box2,vehicule1);
		Location location2 = new Location(date,date, 3000,box3,vehicule2);
		Location location3 = new Location(date,date, 4000,box4,vehicule3);
		testManage.persist(location);
		testManage.persist(location1);
		testManage.persist(location2);
		testManage.persist(location3);		
		//////////////////////////////////////////////////		
	}
	@Test
	public void testAddress() {
		Address adress = new Address(34070, "Montpellier");
		Address adress1 = new Address(78787, "Nimes");
		testAdress.save(adress);
		testAdress.save(adress1);
		List<Address> list = (List<Address>) testAdress.findAll();
		
		int size = list.size();
		assertEquals(3,size);

	}


































}

