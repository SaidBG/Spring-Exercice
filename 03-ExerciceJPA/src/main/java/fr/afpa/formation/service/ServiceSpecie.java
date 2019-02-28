package fr.afpa.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afpa.formation.entity.Specie;
import fr.afpa.formation.repo.SpecieRepository;

@Component
public class ServiceSpecie {
@Autowired
SpecieRepository repoSpecie;





	
	public List<Specie> findAll()  {
		return (List<Specie>) repoSpecie.findAll();
	}

	
	public Specie findById(Long id) {
		return repoSpecie.findById(id).get();
	}
	
	public void delete(Long id) throws Exception {
		Long getId = repoSpecie.findById(id).get().getId();
		repoSpecie.deleteById(getId);
	}



	public Specie create(Specie t)  {
		return repoSpecie.save(t);
	}


	public Specie update(Specie t) {
		 Long get = t.getId();
			
			if(repoSpecie.findById(get).get().getId() == get) {
				
				repoSpecie.save(t);
			} else {
			repoSpecie.save(t);
			}
			return null;
				
	}

}
