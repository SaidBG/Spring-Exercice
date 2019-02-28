package fr.afpa.formation;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.afpa.formation.entity.BoutiqueItem;
import fr.afpa.formation.service.BoutiqueItemService;
import fr.afpa.formation.service.CommandeItemService;
import fr.afpa.formation.service.CommandeService;
import fr.afpa.formation.service.PanierItem;
import fr.afpa.formation.service.PanierService;

@Controller
public class ShopController {
	@Autowired
	BoutiqueItemService boutiqueService;
	@Autowired
	PanierService panierService;
	@Autowired
	CommandeItemService commandeItemService;
	@Autowired
	CommandeService commandeService;

	List<PanierItem> listPanier = new ArrayList<>();
	
	@GetMapping("/")
	public String list(Model model) {
		List<BoutiqueItem> list = boutiqueService.findAll();    	
		model.addAttribute("list",list);
		return "Start";
	}
	
	 @PostMapping("/panier/update")
	    public String listure(@RequestParam(name="nb") int[] nbs,Model model,HttpServletRequest request) {
	    	listPanier = panierService.getListPanierItem(request.getSession()); 
	        int i = 0;
	        for (PanierItem truc:listPanier) {
	        	truc.setQuantite(nbs[i]);
	        	i++;
	        }
	        model.addAttribute("list",listPanier);
	        return "redirect:/panier";
	    }
	
	
	
	
	
	
	@GetMapping("/add/{id}")
	public String add(@PathVariable("id")long id, HttpServletRequest request) {

		BoutiqueItem bI = boutiqueService.findById(id); 
		panierService.addListPanierItem(request.getSession(),bI);
		return "redirect:/panier";

	}
	@GetMapping("/panier")
	public String list(HttpServletRequest request,Model model) {	
	listPanier = panierService.getListPanierItem(request.getSession());
		model.addAttribute("total",panierService.total());
		model.addAttribute("listItem",listPanier);
		return "panier";

	}
	
	@GetMapping("/recap")
	public String recapitulatif(HttpServletRequest request,Model model) {
		List<PanierItem> list = panierService.getListPanierItem(request.getSession());    	
		model.addAttribute("list",list);
		model.addAttribute("total",panierService.total());
	return "recap";	
	}
	
	@GetMapping("/cb")
	public String cb(HttpServletRequest request,Model model) {
		List<PanierItem> list = panierService.getListPanierItem(request.getSession());	
		
		model.addAttribute("list",list);
	return "cb";	
	}
	
	@PostMapping("/cb")
	public String cb1(HttpServletRequest request,Model model) {
		List<PanierItem> list = panierService.getListPanierItem(request.getSession());	
		commandeService.create(list);
		request.getSession().removeAttribute("__PANIER");
	return "redirect:/";	
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("num")int numLine,HttpServletRequest request) {
		panierService.deletePanier(request.getSession(), numLine);
		return "redirect:/panier";
	}




	@GetMapping("/update/{}")
	public String update(HttpServletRequest request, List<Integer> quantites) {

		return "redirect:/panier";
	}

	public String clear(HttpServletRequest session) {
		return "";
	}

}


