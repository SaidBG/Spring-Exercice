package tmp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import fr.afpa.formation.exception.AnimalNotAvailableException;
import fr.afpa.formation.service.IService;

public class Service implements IService<Animal, Exception> {
	@Autowired
	AnimalRepository repoAnimal;
	
	
	
	
	

	@Override
	public List<Animal> findAll() throws Exception {
		return (List<Animal>) repoAnimal.findAll();
	}

	@Override
	public Animal findById(Long id) throws Exception {
		return repoAnimal.findById(id).get();
	}
	@Override
	public void delete(Long id) throws Exception {
		Long getId = repoAnimal.findById(id).get().getId();
		repoAnimal.deleteById(getId);
	}

		
	

	@Override
	public Animal create(Animal t) throws Exception {
		return repoAnimal.save(t);
	}

	@Override
	public Animal update(Animal t) throws Exception {
		 Long get = t.getId();
			
			if(repoAnimal.findById(get).get().getId() == get) {
				
			} else {
			repoAnimal.save(t);
			}
			return null;
				
	}

	
}/*public List<Animal> list() throws AnimalNotAvailableException{
		

	}

	public Animal create(Animal animal) {
		return repoAnimal.save(animal);
	}
	public  Animal update(Animal animal) {
	

	}
	
	
	public Animal getById(Long id) {
		 
	}*/

