package fr.afpa.formation.service;

import fr.afpa.formation.entity.BoutiqueItem;

public class PanierItem  {
	
	private String code;
	private String label; 
	private double price;
	private double unitPrice;
	private int quantite;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
		this.price = this.quantite*this.unitPrice;
	}
	
	
	public PanierItem(BoutiqueItem item) {
		super();
		this.code = item.getCode();
		this.label =  item.getLabel();
		this.unitPrice = this.price =  item.getPrice();
		this.quantite = 1;
		
	}
	public PanierItem() {
		
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	
}
