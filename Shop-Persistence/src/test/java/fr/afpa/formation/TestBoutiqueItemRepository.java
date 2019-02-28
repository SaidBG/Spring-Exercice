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
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import fr.afpa.formation.entity.BoutiqueItem;
import fr.afpa.formation.entity.Commande;
import fr.afpa.formation.repository.BoutiqueItemRepository;
import fr.afpa.formation.repository.CommandeRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes=SmallApp.class)
@DirtiesContext(classMode=DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD) 
public class TestBoutiqueItemRepository {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	BoutiqueItemRepository boutiqueItemRepository;

	@Autowired
	CommandeRepository commandeRepository;
	
	@Before
	public void setUp() {

		BoutiqueItem bt1 = new BoutiqueItem(null,"33Dr","Cassette VHS", 1.2);
		BoutiqueItem bt2 = new BoutiqueItem(null,"78t","Disque vinyle", 2.52);

		entityManager.persist(bt1);
		entityManager.persist(bt2);

	}

	@Test
	public void findAll() {
		List<BoutiqueItem> boutiqueItems = (List<BoutiqueItem>) boutiqueItemRepository.findAll();
		assertEquals(2, boutiqueItems.size());
	}

	/*@Test
	public void create() {
	Commande cmd1 = new Commande(3, new Date());
	assertNotNull(cmd1);
	commandeRepository.save(cmd1);
	assertEquals(3, cmd1.getNombre());
		
	
	}
	*/

}


