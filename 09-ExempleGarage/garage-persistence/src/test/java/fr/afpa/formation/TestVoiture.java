package fr.afpa.formation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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

import fr.afpa.formation.entity.Voiture;
import fr.afpa.formation.repo.VoitureRepo;


@RunWith(SpringRunner.class) 
@DataJpaTest
@ContextConfiguration(classes=SmallApp.class)
public class TestVoiture {
	@Autowired
	private TestEntityManager testManage;
	@Autowired
	VoitureRepo repo; 




	@Before
	public void setUp() {
		////////////VOITURES///////////		
		Date date = new Date();
		Voiture voiture1 = new Voiture("bmw", "Classe-E", date);
		Voiture voiture2 = new Voiture("nissan","Skyline", date);
		Voiture voiture3 = new Voiture("honda","CRX-VTEC",date);
		Voiture voiture4 = new Voiture("mercedes","SLS", date);
		testManage.persist(voiture1);
		testManage.persist(voiture2);
		testManage.persist(voiture3);
		testManage.persist(voiture4);
		////////////////////////////////////////////////////
	}

	@Test
	public void testCreate() {
		Date date = new Date();
		Voiture test = new Voiture("Test","test",date);
		assertNotNull(test);
		repo.save(test);
		List<Voiture> list = (List<Voiture>) repo.findAll();
		int size = list.size();
		assertEquals(5,size);
	}


}






























