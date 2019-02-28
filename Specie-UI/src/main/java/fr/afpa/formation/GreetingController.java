package fr.afpa.formation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.afpa.formation.entity.Specie;
import fr.afpa.formation.service.ServiceSpecie;

@RestController
@RequestMapping("/rest/species")
public class GreetingController {
	@Autowired
	ServiceSpecie service;

	@GetMapping("")
	public List<Specie> list () {
		List<Specie> listSpecie = service.findAll();	
		return listSpecie;
	}
	@GetMapping("/{id}")
	public void delete(@PathVariable("id") long id) throws Exception {
			service.delete(id);
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
	@PostMapping("")
	public long create(@RequestBody Specie sp) {
		service.create(sp);
		return sp.getId();
	}


	/*@PostMapping("")
	public String createSpecie(@RequestBody Specie sp, Model model) {
		service.create(sp); 
		return "redirect:/";}*/
}
