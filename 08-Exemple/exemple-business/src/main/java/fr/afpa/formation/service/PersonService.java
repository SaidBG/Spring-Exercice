package fr.afpa.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.afpa.formation.dao.PersonDao;
import fr.afpa.formation.entity.Person;
@Service
public class PersonService {
@Autowired
PersonDao dao;


public List<Person> list() {
	return dao.list();
	
}

}
