package com.test;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Proposer une carte de Restauration à un client et Afficher son choix
		
		System.out.println("Bienvenue dans notre Restaurent !");
		//System.out.println("Voici les 3 menus qu'on vous propose, tapez le numero lier au choix de votre menu ");
		System.out.println("Voici les 3 menus qu'on vous propose, entrez le nom de votre menu : ");
		System.out.println("1 : Poulet");
		System.out.println("2 : Boeuf");
		System.out.println("3 : Végétarien");
		
		System.out.println("Entrer le nom de votre choix : ");
		
		Scanner sc = new Scanner(System.in);
		//int menu = sc.nextInt();
		String menu = sc.nextLine();// Permet à l'utilisateur de taper une chaine de caractere
		//pour récuperer le mot : menu.equals(poulet);
		
		//********************Avec des if
		/*if(menu == 1) {
			
			System.out.println("Vous avez choisi le menu poulet, merci !");
		}
		else if (menu == 2) {
			System.out.println("Vous avez choisi le menu Boeuf, merci !");
		}
		else if (menu == 3) {
			System.out.println("Vous avez choisi le menu végétarien, merci !");
		}
		else {
			System.out.println("Votre choix n'est pas dans la liste des menu.");
		}
		*/
		
		
		//*******************Avec le switch
		
		/*switch(menu){
		
		case 1 :
			
			System.out.println("Vous avez choisi le menu poulet, merci !");
			
			break;
			
		case 2 :
			
			System.out.println("Vous avez choisi le menu Boeuf, merci !");
			
			break;
			
		case 3 :
			
			System.out.println("Vous avez choisi le menu végétarien, merci !");
			
			break;
			
		default :
			
			System.out.println("Votre choix n'est pas dans la liste des menu.");
			
			break;
			
		}*/
		
		//Avec des chaine des caratères et des if 
		
		if(menu.equals("Poulet")){
			
			System.out.println("Vous avez pris le menu Poulet !");
			
		}
		
		else if(menu.equals("Boeuf")) {
			
			System.out.println("Vous avez pris le menu Boeuf !");
		}
				
		else if(menu.equals("Végétarien")) {
			
			System.out.println("Vous evez pris le menu Végétarien ! ");
		}
		
		else {
			System.out.println("Votre choix n'est pas valide.");
		}
		
		
		
		//************* Avec des chaines de caracteres avec switch
		/*
		switch(menu) {
		
		case "Poulet" : 
		case "poulet" : 
			System.out.println("Vous avez choisi le menu poulet, merci !");
			
			break;
			
		case "Boeuf" :
		case "boeuf" :
			
			System.out.println("Vous avez choisi le menu Boeuf, merci !");
			
			break;
			
		case "Vegetarien" :
		case "vegetarien" :
			
			System.out.println("Vous avez choisi le menu végétarien, merci !");
			
			break;
			
		default :
			
			System.out.println("Votre choix n'est pas dans la liste des menu.");
			
			break;
		
		}
		*/
		
		

	}

}
