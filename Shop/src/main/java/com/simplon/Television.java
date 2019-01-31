package com.simplon;

public class Television extends Produit{

	String taillEcrant;
	String technologie;
	static String nom = "Télévision";

	
	public Television(Double prix, String description, String marque, String taillEcrant,
			String technologie) {
		super(nom, prix, description, marque);
		this.taillEcrant = taillEcrant;
		this.technologie = technologie;
	}

	@Override
	public String toString() {
		return "Television [taillEcrant=" + taillEcrant + ", technologie=" + technologie + ", nom=" + nom + ", prix="
				+ prix + ", description=" + description + ", marque=" + marque + "]";
	}

	
	
}
