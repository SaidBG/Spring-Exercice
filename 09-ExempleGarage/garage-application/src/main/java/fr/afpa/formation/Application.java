package fr.afpa.formation;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.afpa.formation.entity.Voiture;
import fr.afpa.formation.service.VoitureService;

@SpringBootApplication
public class Application implements CommandLineRunner {
@Autowired
VoitureService service;


public static void main(String[] args ) {
	SpringApplication.run(Application.class, args);
}

	@Override
	public void run(String... args) throws Exception {
		Date date = new Date();
		Voiture benz = new Voiture("Mercedes-Benz", "SLG-AMG", date);	
		
		
		service.create(benz);
		
		
	}

}
