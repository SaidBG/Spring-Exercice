package fr.afpa.formation.squelette.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.formation.squelette.dao.GensRepository;
import fr.afpa.formation.squelette.persistence.Gens;

@Service

public class GensService {
	@Autowired
	GensRepository repo;
	
	public List<Gens> list() {
		return (List<Gens>)repo.findAll();
	}
	
	
	public Gens create (Gens s) {
		return repo.save(s);
	}


	public void delete(long id) {
		repo.deleteById(id);
		
	}


	

}
