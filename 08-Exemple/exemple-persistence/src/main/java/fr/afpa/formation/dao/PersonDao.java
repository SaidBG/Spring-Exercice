package fr.afpa.formation.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.afpa.formation.entity.Person;
@Component
@Service
public class PersonDao {
	
	private List<Person> listPerson = null;
	
	//////////////////PERSON///////////////
	Person first = new Person("Said","Bg",23);
	Person second = new Person("Nathan","Bg",23);
	////////////////////////////////////////////
	
	public List list() {
		listPerson = new ArrayList();
		listPerson.add(first);
		listPerson.add(second);
		return listPerson;
		
	}

}
