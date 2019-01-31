package com.simplon;

import java.util.Scanner;

public class TestShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client c1 = new Client("Martin MATIN", "13 rue de la matinée");
		Client c2 = new Client("Martin Mystere", "12 rue de l'évouvant");

		Produit p1 = new Television(12.30, "Trés beau", "Samsung", "4/3", "4K");
		Produit p2 = new Four(60.99, "Trés chaud", "Philips", 50, 900);
		Produit p3 = new Cafetiere(32.99, "Bon cafée", "Nespreso", 5, 2);
		// ---------------LIVRAISON-----------------------------------------
		System.out.println("Quel mode de livraison souhaitez vous ?");
		System.out.println("1 - Express");
		System.out.println("2 - Domicile");
		System.out.println("3 - Retirer au magasin");
		System.out.println("4 - Point Relay");
		Livraison l1 = null;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {

		case 1:

			System.out.println("Habitez vous a Paris ?" + "\n" + "OUI - 1" + "\n" + "NON - 2");

			Scanner lieu = new Scanner(System.in);
			int choixExpress = sc.nextInt();

			if (choixExpress == 1) {
				l1 = new Express(1);
			} else if (choixExpress == 2) {
				l1 = new Express(2);
			} else {
				System.out.println("Votre commande n'est pas valide");
			}

			break;

		case 2:
			l1 = new Domicile();
			break;

		case 3:
			l1 = new RetirerMagasin();
			break;

		case 4:

			System.out.println("Quel est le numéro de votre point relay : ");
			Scanner numRelay = new Scanner(System.in);
			int rel = numRelay.nextInt();
			l1 = new Relay(rel);

		default:
			System.out.println("votre choix n'existe pas");

		}

		// ------------------------------------------------------

		Facture f1 = new Facture(c1, l1);
		
		f1.ajouterProduit(p1, 2);
		f1.ajouterProduit(p3, 1);
		f1.ajouterProduit(p2, 1);

		//		System.out.println(c1.afficheClient()); 
		//		System.out.println(c2.afficheClient());
		//		System.out.println("");
		//		System.out.println(p1.toString());
		//		System.out.println(p2.toString());
		//		System.out.println(p3.toString());
		//		System.out.println("");
		//		System.out.println(l1.infoLivraison());
		//		System.out.println("");
		//		
		//		System.out.println(f1.getListPanier());
		//		System.out.println(f1.prixTotal());

		try {
		f1.afficheFacture();
		}catch(NombreProduitException e){}
	}
}