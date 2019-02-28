package fr.afpa.formation.service;

import java.util.ArrayList;
import java.util.List;

import fr.afpa.formation.entity.BoutiqueItem;


public class Panier {


	private List<PanierItem> listPanierItem = new ArrayList<>();
	
	
	
	public List<PanierItem> getListPanierItem() {
		return listPanierItem;
	}
	public void setListPanierItem(List<PanierItem> listPanierItem) {
		this.listPanierItem = listPanierItem;
	}
	public void add(BoutiqueItem item) {
		
		listPanierItem.add(new PanierItem(item));
	}

	public void update(List<Integer> list) {
	int i = 0;
	for (PanierItem pt : listPanierItem) {
	pt.setQuantite(list.get(i));
	i++;
	}
		
	}
	
	public void delete(int index) {
	listPanierItem.remove(index);	
	}
	
	public double total () {
		double price = 0;
		for (PanierItem pt : listPanierItem) {
			price += pt.getPrice();
			
		}
		return price;
	}

}
