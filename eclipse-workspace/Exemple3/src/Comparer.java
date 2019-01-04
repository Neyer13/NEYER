import java.util.Scanner;

public class Comparer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//**********************exercice 1******************************
		//comparer 2 nombres entier et afficher le plus petit
		
		/*
		System.out.println("Entrer votre premiere valeur : ");
		
		Scanner sc = new Scanner(System.in);
		int nbre = sc.nextInt();
		
		System.out.println("Entrer votre deuxieme valeur : ");
		
		Scanner sc2 = new Scanner(System.in);
		int nbre2 = sc2.nextInt();
		
		if(nbre < nbre2) {
			System.out.println("La valeur la plus petite des deux est "+nbre);
		}
		else if (nbre2 < nbre) {
			System.out.println("La valeur la plus petite des deux est "+nbre2);
		}
		else {
			System.out.println("Vos deux chiffres sont égaux");
		}
		*/
		
		
		//***************************exercice 2*****************************
		//Dire si une valeur est negatif, positif ou nul
		
		/*
        System.out.println("Entrer une valeur : ");
		
		Scanner sc = new Scanner(System.in);
		int nbre = sc.nextInt();
		
		if(nbre < 0) {
			System.out.println("Vous avez entrez le nombre "+nbre+" qui est negatif"); 
		}
		else if(nbre>0) {
			System.out.println("Vous avez entrez le nombre "+nbre+" qui est positif");	
		}
		else {
			System.out.println("Vous avez entrez un nombre nul");
		}
		
		*/
		//*************************exercice 3**********************************
		//verifier pour un nombre entier si il est dans l'interval [50,100]
		
		System.out.println("Entrer une valeur entre 50 et 100 : ");
		
		Scanner sc = new Scanner(System.in);
		int nbre = sc.nextInt();
		
		if ((nbre >= 50) && (nbre <= 100)){
			System.out.println("Votre valeur est entre 50 et 100");
		}
		else {
			System.out.println("Votre valeur n'est pas etre 50 et 100");
		}	
	}
}
