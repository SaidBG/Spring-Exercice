package fr.afpa.formation.squelette.test;


import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.afpa.formation.squelette.SmallApp;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes=SmallApp.class)
public class GensMyTest {}
   /* @Autowired
    private TestEntityManager entityManager;

    /@Autowired
    private GensRepository repo;	
    
	private int all;

    @Before
	public void setUp() {
		System.out.println("Before");
		Gens sp = new Gens();
		sp.setName("COMMON");
		sp.setFirstName("LATIN");
		entityManager.persist(sp);
		sp = new Gens();
		sp.setName("COMMON");
		sp.setFirstName("LATIN");
		entityManager.persist(sp);
		sp = new Gens();
		sp.setName("COMMON");
		sp.setFirstName("LATIN");
		entityManager.persist(sp);
		all = 3;
		
	}
    private Gens addSpecie() {
		Gens sp = new Gens();
		sp.setName("Test");
		sp.setFirstName("Test1");
		entityManager.persist(sp);
		
		return sp;
    }
	@Test
	public void insert() {
		Gens sp = addSpecie();
		assertEquals(repo.count(),all+1);
		Gens test = repo.findById(sp.getId()).get();
		assertEquals(test.getName(),sp.getName());
		assertEquals(test.getFirstName(),sp.getFirstName());
	}
	@Test
	public void update() {
		Gens sp = addSpecie();
		String common = "Machin";
		sp.setName(common);
		repo.save(sp);
		Gens test = repo.findById(sp.getId()).get();
		assertEquals(test.getName(),sp.getName());
		assertEquals(test.getFirstName(),sp.getFirstName());
	}
	@Test
	public void delete() {
		Gens sp = addSpecie();
		assertEquals(all+1,repo.count());
		repo.delete(sp);
		assertEquals(all,repo.count());
	}
	@Test
	public void findList() {
		assertEquals(repo.count(),all);
	}
}*/
