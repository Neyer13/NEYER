package com.simplon;

import java.util.Scanner;

public class Express implements Livraison{

	int region;

	public Express(int region) {
		this.region=region;
	}

	public double prixLivraison() {

		double prix=0;

		switch(region) {

		case 1 : prix=6.99;
		break;

		case 2 : prix = 9.99;
		break;

		default : prix = 9.99;
		break;

		}

		return prix;
	}

	public String infoLivraison() {
		return "EXPRESSE - Livrée dans dans les 24h";
	}
}
