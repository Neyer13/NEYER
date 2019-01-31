package com.simplon;

public class Cafetiere extends Produit{
	
	int capacite;
	int nbTasse;
	static String nom = "Cafetière";

	public Cafetiere(Double prix, String description, String marque, int capacite, int nbTasse) {
		super(nom, prix, description, marque);
		this.capacite = capacite;
		this.nbTasse = nbTasse;
	}

	@Override
	public String toString() {
		return "Cafetiere [capacite=" + capacite + ", nbTasse=" + nbTasse + ", nom=" + nom + ", prix=" + prix
				+ ", description=" + description + ", marque=" + marque + "]";
	}
	
	

}
