package com.test;
import java.util.Scanner;

public class Evaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Entrer la note de l'élève pour définir sa mention : ");
		
		Scanner sc = new Scanner(System.in);
		int note = sc.nextInt();
		
		 
		switch(note){
		
		 case 0:case 1 : case 2 : case 3 : case 4 : case 5 : case 6 : case 7 : case 8 : case 9 :
			  
			  System.out.println("Mention : Travaillez plus !");
			  
			  break;
		  case 10 : case 11 :
			  
			  System.out.println("Mention : Passable");
			  
		  case 12 : case 13 :
			  System.out.println("Mention : Assez bien");
			  
		  case 14 : case 15 :
			  System.out.println("Bien");
			  
		  case 16 : case 17 : case 18 : case 19 : case 20 :
			  
			  System.out.println("Très bien");
		
		default:
			
			System.out.println("La note n'est pas valide");
		}		

	}

}
