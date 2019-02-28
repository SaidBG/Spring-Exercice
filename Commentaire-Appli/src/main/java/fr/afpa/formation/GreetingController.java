package fr.afpa.formation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.afpa.formation.entity.Gens;
import fr.afpa.formation.squelette.service.GensService;

@Controller
public class GreetingController {
	@Autowired
	GensService gensService;

	@GetMapping("/")
	public String list(Model model) {
		List<Gens> list = gensService.list();    	
		model.addAttribute("list",list);
		return "greeting";
	}
	
	@GetMapping("/add")
	public String add(Model model) {		
		model.addAttribute("gens",new Gens());
		return "formAdd";
	}
	
	@PostMapping("/add/formAdd")
	public String form(Gens sp, Model model) {
		gensService.create(sp);
		return "redirect:/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		gensService.delete(id);
		return "redirect:/";
	}

}
