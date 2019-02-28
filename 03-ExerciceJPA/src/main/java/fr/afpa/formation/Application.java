package fr.afpa.formation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.afpa.formation.repo.SpecieRepository;
import tmp.AnimalRepository;

//@SpringBootApplication
public class Application implements CommandLineRunner {
@Autowired
SpecieRepository sp;
AnimalRepository rp;



	private Log log = LogFactory.getLog(Application.class);
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		long id = 13;
		log.info(rp.findAll().toString());
	}

}

