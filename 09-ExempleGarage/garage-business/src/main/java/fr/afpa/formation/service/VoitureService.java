package fr.afpa.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.formation.entity.Voiture;
import fr.afpa.formation.repo.VoitureRepo;

@Service
public class VoitureService {
	@Autowired
	VoitureRepo repo;
	
	
	public List<Voiture> list() {
	return (List<Voiture>) repo.findAll();
	}
	
	public Voiture create(Voiture e) {
	return repo.save(e);
	}
	
}
