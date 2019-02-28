package tmp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
@Component
public interface AnimalRepository extends CrudRepository<Animal, Long>  {

}
