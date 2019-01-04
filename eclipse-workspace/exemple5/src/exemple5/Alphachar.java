package exemple5;

import java.util.Scanner;

public class Alphachar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*char lettre = 'A';
		
		
		//System.out.println("Entrer un caractère les lettres suivant le caratère dans l'alphabet apparaîtrant !");
		
		//Scanner sc = new Scanner(System.in);
		//lettre = sc.nextLine().charAt(0);
		
		while(lettre < 'Z'){ // Tant que c'est plus petit que Z c'est vrai sino sa passe à faux
			
			System.out.println(lettre);	
			lettre += 1;
			
		}
		System.out.println("fin");
		*/
		
		char lettre = 'A';
		char lettre2 = 'Z';
		
		while(lettre <= 'Z') {
			System.out.println(lettre);
			lettre++;
		    }
		
		while(lettre >='A') {
			System.out.println(lettre);
			lettre--;
		 }	
	}
}
