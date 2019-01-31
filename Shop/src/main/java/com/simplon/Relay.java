package com.simplon;

import java.util.Scanner;

public class Relay implements Livraison{
	
	int numRelay;
	
	public Relay(int numRelay) {
		
		this.numRelay=numRelay;
		
	}

	public double prixLivraison() {
		double prix = 0;
		
		
		if(numRelay>0&&numRelay<=22) {
			prix = 0;
		}else if (numRelay>=23&&numRelay<=47) {
			prix = 2.99;
		}else if(numRelay>47) {
			prix=4.99;
		}else {
		    prix = 4.99;
		}
		return prix;
	}

	public String infoLivraison() {
		// TODO Auto-generated method stub
		return "Relay - A retirer dans un point relay";
	}
}
