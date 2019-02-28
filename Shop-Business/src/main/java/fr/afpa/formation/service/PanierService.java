package fr.afpa.formation.service;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import fr.afpa.formation.entity.BoutiqueItem;
@Service
public class PanierService {

	private static final String PANIER_KEY="__PANIER";

	private Panier panier;


	public void addListPanierItem(HttpSession session,BoutiqueItem item) {
		panier = (Panier)session.getAttribute(PANIER_KEY);

		if (panier == null) {
			panier = new Panier();
			session.setAttribute(PANIER_KEY, panier);
		} 
		int quantite = 0;
		for (PanierItem pt : panier.getListPanierItem()) {
			if(pt.getCode().equals(item.getCode())) {
				quantite = pt.getQuantite();
				quantite += 1;
				pt.setQuantite(quantite);
				return;
			}
		}

		panier.add(item);
	}

	public void updatePanier(HttpSession session,List<Integer> list) {
		panier = (Panier)session.getAttribute(PANIER_KEY);
		panier.update(list);
	}

	public void deletePanier (HttpSession session,int index) {
		panier = (Panier)session.getAttribute(PANIER_KEY);		
		if (panier == null) {
		}

		panier.delete(index);
	}
	
	public void deleteAll (HttpSession session) {
		getListPanierItem(session).clear();
		
	}

	public PanierItem findById(HttpSession session,String code) {
		for (PanierItem pt : getListPanierItem(session)) {
			if(pt.getCode().equals(code)) {
				return pt;		
			}			
		}
		return null;		
		
	}




	public List<PanierItem> getListPanierItem (HttpSession session) {
		panier = (Panier)session.getAttribute(PANIER_KEY);
		if (panier == null) {
			panier = new Panier();
			session.setAttribute(PANIER_KEY, panier);
		}
		return panier.getListPanierItem();
	}
	public double total () {
		return panier.total();

	}

}
