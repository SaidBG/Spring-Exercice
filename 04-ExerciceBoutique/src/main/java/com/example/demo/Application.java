package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@SpringBootApplication
public class Application implements CommandLineRunner  {
	
	@Autowired
	CategoryRepository catRep;
	
	@Autowired
	ImageRepository imgRepo;
	
	@Autowired
	ItemRepository itemRep;
	
	@Autowired
	WarrantyRepository warRep;
	
	private static Log log = LogFactory.getLog(Application.class);
	public static void main(String[] args)  {
		SpringApplication.run(Application.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Category cat = new Category(0, "TestCat","Test01", "Ceci est le test");
		Category cat1 = new Category(0, "TestCat","Test02", "Ceci est le test");
		Image img = new Image(0, "altText", "path");
		Image img1 = new Image(0, "altText", "path");
		Item item = new Item(0, "name", "code", "description", 5, null, img1);
		Warranty war = new Warranty(0, "fullTexte", "summaryy", item);
		
		
		imgRepo.save(img);
		imgRepo.save(img1);
		catRep.save(cat);
		catRep.save(cat1);
	}
}

