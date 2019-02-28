package fr.afpa.formation.squelette;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import fr.afpa.formation.squelette.dao.GensRepository;
import fr.afpa.formation.squelette.persistence.Gens;
import fr.afpa.formation.squelette.service.GensService;	
@RunWith(MockitoJUnitRunner.class)
public class TestBoutiqueItemServiceMock {
	@Mock
	private GensRepository gensMock; 

	@InjectMocks
	private GensService gensService;

	List <Gens> gensList = new ArrayList<>();
	int gensListSize;

	@Before
	public void setUp() {
		Gens boutiqueItem1 = new Gens();
		Gens boutiqueItem2 = new Gens();
		gensList.add(boutiqueItem1);
		gensList.add(boutiqueItem2);
		gensListSize = 2;

	}
	
	@Test
	public void findAll() {
		when( gensMock.findAll()).thenReturn(gensList);
		
		assertEquals(gensListSize, gensService.list().size());

	}
	
	@Test
	public void create() {
		doAnswer(new Answer<Void>() {

			@Override
			public Void answer(InvocationOnMock invocation) throws Throwable {
				Object[] os = invocation.getArguments();
				if(os!= null && os.length != 0 && os[0] != null) {
					Gens bt = (Gens)os[0];
					bt.setId(3L);
					gensList.add(bt);
				}
				return null;
			}
		}).when(gensMock).save(Mockito.any(Gens.class));
		Gens boutiqueItem1 = new Gens(); 
	
		boutiqueItem1.setName("moto");
		boutiqueItem1.setFirstName("allo");
		assertNotNull(boutiqueItem1);
		 gensService.create(boutiqueItem1);
		 assertEquals("moto", boutiqueItem1.getName());
		}
	}
	

	
	

