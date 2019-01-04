import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int prixBillet;
		
		Scanner sc1 = new Scanner(System.in);
		int ageClient;
		
		Scanner sc2 = new Scanner(System.in);
		int montreuil;
		
		System.out.println("Quel Age avez vous ?");
		
		ageClient = sc1.nextInt();
		
		if(ageClient < 3) {
			
			System.out.println("La place pour les enfants de moins de 3 est gratuite.");
			
		}
		
		else if(ageClient > 60) {
			
			System.out.println("La place pour les senor est de 4€");
			
		}else {
			
			System.out.println("Habitez vous à Montreuil ?"+"\n"+"1. Oui"+"\n"+"2. Non");
			
			montreuil = sc2.nextInt();
			
			switch(montreuil) {
			
			case 1 : 
				
				System.out.println("La place est à 5€.");
				
				break;
				
			case 2 :
				
				System.out.println("La place est à 8€.");
				
				default :
					
					System.out.println("");
			}
		}

	}

}
