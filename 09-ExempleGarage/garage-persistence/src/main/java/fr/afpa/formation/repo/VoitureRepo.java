package fr.afpa.formation.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import fr.afpa.formation.entity.Voiture;
@Component
public interface VoitureRepo extends CrudRepository<Voiture, Long> {

}
