package fr.afpa.formation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.afpa.formation.entity.Specie;
import fr.afpa.formation.service.ServiceSpecie;

@Controller
public class GreetingController {
	@Autowired
	ServiceSpecie service;

	@GetMapping("/")
	public String greeting(Model model) {
		List<Specie> listSpecie = service.findAll();    	
		model.addAttribute("list",listSpecie);
		return "greeting";
	}
	@GetMapping("/specie/{id}/delete")
	public String delete(@PathVariable("id") long id) {
		try {
			service.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/";
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") long id,Model model) {
		Specie t = service.findById(id);
		model.addAttribute("specie", t);
		return "formUpdate";
	}
	@PostMapping("/specie/update")
	public String updateSpecie(Specie specie,Model model) {		
		model.addAttribute("specie", specie);
		service.update(specie);
		return "redirect:/";
	}
	@GetMapping("/create")
	public String create(Model model) {
		model.addAttribute("specie", new Specie());
		return "formCreate";
	}


	@PostMapping("/specie/create")
	public String createSpecie( Specie sp, Model model) {
		service.create(sp); 
		return "redirect:/";


	}
}
