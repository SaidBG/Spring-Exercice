package fr.afpa.formation.service;

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
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import fr.afpa.formation.entity.BoutiqueItem;
import fr.afpa.formation.repository.BoutiqueItemRepository;

@RunWith(MockitoJUnitRunner.class)
public class TestBoutiqueItemServiceMock {
	@Mock
	private BoutiqueItemRepository boutiqueItemRepositoryMock; 

	@InjectMocks
	private BoutiqueItemService boutiqueItemService;

	List <BoutiqueItem> boutiqueItems = new ArrayList<>();
	int boutiqueItemsSize;

	@Before
	public void setUp() {
		BoutiqueItem boutiqueItem1 = new BoutiqueItem(null, "12gt", "test-balai", 250.65);
		BoutiqueItem boutiqueItem2 = new BoutiqueItem(null, "B-TW1N", "test-velo", 29.36);
		boutiqueItems.add(boutiqueItem1);
		boutiqueItems.add(boutiqueItem2);
		boutiqueItemsSize = 2;

	}
	
	@Test
	public void findAll() {
		when( boutiqueItemRepositoryMock.findAll()).thenReturn(boutiqueItems);
		
		assertEquals(boutiqueItemsSize, boutiqueItemService.findAll().size());

	}
	
	/*@Test
	public void create() {
		doAnswer(new Answer<Void>() {

			@Override
			public Void answer(InvocationOnMock invocation) throws Throwable {
				Object[] os = invocation.getArguments();
				if(os!= null && os.length != 0 && os[0] != null) {
					BoutiqueItem bt = (BoutiqueItem)os[0];
					bt.setId(3L);
					boutiqueItems.add(bt);
				}
				return null;
			}
		}).when(boutiqueItemRepositoryMock).save(Mockito.any(BoutiqueItem.class));
		BoutiqueItem boutiqueItem1 = new BoutiqueItem(); 
		boutiqueItem1.setCode("24f");
		boutiqueItem1.setLabel("moto");
		boutiqueItem1.setPrice(4000.5);
		assertNotNull(boutiqueItem1);
		 boutiqueItemService.create(boutiqueItem1);
		 assertEquals("24f", boutiqueItem1.getCode());
		}
	}
	*/
}
	
	

