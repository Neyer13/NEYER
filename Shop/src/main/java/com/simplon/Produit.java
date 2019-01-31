package com.simplon;

public class Produit {
	
	String nom;
	Double prix;
	String description;
	String marque;
	public Produit(String nom, Double prix, String description, String marque) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.description = description;
		this.marque = marque;
	}
	@Override
	public String toString() {
		return "Produit [nom=" + nom + ", prix=" + prix + ", description=" + description + ", marque=" + marque + "]";
	}
	
	
	
}
