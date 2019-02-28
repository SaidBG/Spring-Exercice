package fr.afpa.formation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class GreetingController {
	@Autowired
	ServiceWS service;

	@GetMapping("")
	public String list (Model model) {
		List<SpecieDTO> listSpecie = service.findAll();
		model.addAttribute("list",listSpecie );
		return "greeting";
	}
	@GetMapping("specie/{id}/delete")
	public String delete(@PathVariable("id") Long id) throws Exception {
			service.delete(id);
			return "redirect:/";
	}
	@PostMapping("/create")
	public String create(@RequestBody SpecieDTO sp,Model model) {
		model.addAttribute("specie", sp);
		
		return "redirect:/formCreate";
	}

	@GetMapping("/create")
	public String create(Model model) {
		model.addAttribute("specie", new SpecieDTO());
		return "formCreate";
	}


	@PostMapping("/specie/create")
	public String createSpecie( SpecieDTO sp, Model model) {
		if (sp.getId() == null) {
			service.create(sp); 
		}else {}
		
		return "redirect:/";
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") Long id,Model model) {
		SpecieDTO t = service.findById(id);
		System.out.println("*********************"+ t.toString()+"****************");
		model.addAttribute("specie", t);
		return "formUpdate";
	}
	@PostMapping("/specie/update")
	public String updateSpecie(SpecieDTO specie,Model model) {		
		model.addAttribute("specie", specie);
		System.out.println("*****************************"+ specie.toString()+"***************************");
		service.update(specie);
		return "redirect:/";
	}
	


	
}
