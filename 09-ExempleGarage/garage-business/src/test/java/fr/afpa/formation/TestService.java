package fr.afpa.formation;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import fr.afpa.formation.entity.Voiture;
import fr.afpa.formation.repo.VoitureRepo;
import fr.afpa.formation.service.VoitureService;

@RunWith(MockitoJUnitRunner.class)
public class TestService {
@Mock
VoitureRepo repoMock;
@InjectMocks
VoitureService service;

private List<Voiture> list = null;



@Before
public void setUp() {
	list = new ArrayList();
	/////////////////VOITURE///////////////////////
	Date date = new Date();
	Voiture voiture1 = new Voiture("bmw", "Classe-E", date);
	Voiture voiture2 = new Voiture("nissan","Skyline", date);
	Voiture voiture3 = new Voiture("honda","CRX-VTEC",date);
	Voiture voiture4 = new Voiture("mercedes","SLS", date);
	list.add(voiture1);
	list.add(voiture2);
	list.add(voiture3);
	list.add(voiture4);
	///////////////////////////////////////////////////////
	
	
}






@Test
public void list() {
	when(repoMock.findAll()).thenReturn(list);
	assertEquals(4,service.list().size());
}
}
