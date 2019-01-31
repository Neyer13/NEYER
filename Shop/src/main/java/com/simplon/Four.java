package com.simplon;

public class Four extends Produit{
	
	double temperatureMax;
	int puissanceMax;
	static String nom = "Four";
	
	public Four(Double prix, String description, String marque,double temperatureMax, int puissanceMax) {
		super(nom, prix, description, marque);
		this.temperatureMax=temperatureMax;
		this.puissanceMax=puissanceMax;
	}

	@Override
	public String toString() {
		return "Four [temperatureMax=" + temperatureMax + ", puissanceMax=" + puissanceMax + ", nom=" + nom + ", prix="
				+ prix + ", description=" + description + ", marque=" + marque + "]";
	}

	
	
}
