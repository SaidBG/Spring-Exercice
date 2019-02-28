package fr.afpa.formation.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import fr.afpa.formation.entity.Specie;
@Component
public interface SpecieRepository extends CrudRepository<Specie, Long> {

}
