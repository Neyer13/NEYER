package com.simplon;

import java.util.HashMap;
import java.util.Map.Entry;


public class Facture {
	
	HashMap <Produit,Integer> listPanier = new HashMap<Produit,Integer>();
	Livraison livraison;
	Client client;
	
	public Facture(Client client, Livraison livraison) {
		
		this.client=client;
		this.livraison=livraison;
	}
	
	public void ajouterProduit(Produit produit,int nbProduit) {
		listPanier.put(produit, nbProduit);
	}

	public HashMap<Produit, Integer> getListPanier() {
		return listPanier;
	}
	
	public double prixTotal() {
		double total = 0;
		
		for(Entry<Produit, Integer> ls : listPanier.entrySet()){
			
			total += ls.getKey().prix*ls.getValue();
		}
		
		total += this.livraison.prixLivraison();
		
		return total;
	}
	
	public void afficheFacture() throws NombreProduitException {
		
		if(listPanier.isEmpty()) {//si la list est vide  
			throw new NombreProduitException();//il execute la class NoP...
		}
		
		int nbProduitDif=1;
		
		System.out.println("----------------------FACTURE-------------------------------");
		System.out.println("------------------------------------------------------------");
		System.out.println("NOM CLIENT : "+client.fullName+"\n"+"ADRESSE : "+client.adresse);
		System.out.println("");
		for(Entry<Produit, Integer> ls : listPanier.entrySet()) {
			System.out.println(nbProduitDif+"- : "+ls.getKey().nom+" "+ls.getKey().marque+" X "+ls.getValue());
			nbProduitDif++;
		}
		System.out.println("");
		System.out.println("Type de livraison : "+this.livraison.infoLivraison()+" - "+this.livraison.prixLivraison()+"€");
		
		System.out.println("");
		System.out.println("TOTAL : "+prixTotal()+"€");
		System.out.println("");
		System.out.println("Merci pour votre achat et à bientôt ;) !");
		
	}
	
	public String afficheLaFacture() {
		String tout = null;
		String tout2 = null;
		int nbProduitDif=1;
		
		String tout1 = "----------------------FACTURE-------------------------------"+"\n"
	                  +"------------------------------------------------------------"+"\n"+
	                  "NOM CLIENT : "+client.fullName+"\n"+"ADRESSE : "+client.adresse+"\n";
		
		for(Entry<Produit, Integer> ls : listPanier.entrySet()) {
			tout2 = nbProduitDif+"- : "+ls.getKey().nom+" "+ls.getKey().marque+" X "+ls.getValue();
			nbProduitDif++;
		}
		
		String tout3 = "\n"+"Type de livraison : "+this.livraison.infoLivraison()+" - "+this.livraison.prixLivraison()+"€"+"\n"
				+"TOTAL : "+prixTotal()+"€"+"\n"+
				"Merci pour votre achat et à bientôt ;) !";
		
		
		return tout=tout1+tout2+tout3;
		
	}
	
}
