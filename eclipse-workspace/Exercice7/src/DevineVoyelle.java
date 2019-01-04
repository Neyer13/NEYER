import java.util.Scanner;

public class DevineVoyelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char tabVoyelle[]= {'a','e','i','o','u'};
		
		Scanner	sc = new Scanner(System.in);
		char choix;
		
		Scanner sc2 = new Scanner(System.in);
		char fin;
		
		do {
			
			System.out.println("Devinez les mots de mon tableau : ");
			
			choix = sc.nextLine().charAt(0);
			
			for(int i =0 ; i < tabVoyelle.length;i++) {
				
				char verifie = tabVoyelle[i];
				
				if(verifie == tabVoyelle[i]) {
					
					System.out.println("Votre lettre est dans mon tableau et est la lettre "+ choix);
					break;
				}else {
					System.out.println("La lettre "+choix+"n'est pas dans mon tableau");
				}
			}
			
			System.out.println("Voulez vous continuer O/N");
			
			fin = sc2.nextLine().charAt(0);
			
			}while(fin=='O');
		
		System.out.println("Au revoir !");
		}
}
	

    /*char tabVoyelle[]= {'a','e','i','o','u'};
	
	Scanner sc = new Scanner(System.in);
	char choix = sc.nextLine().charAt(0);
	
	char fin= sc.nextLine().charAt(0);*/
	
	//boolean verifie = true;
	
	//for(int i = 0; i < tabVoyelle.length;i++) {
		
		/*if(choix == tabVoyelle[i]) {
			verifie = 1;
		}else {
			verifie = 2;
		}*/
	//}
	
	
	
	/*switch (choix) {
	case 'a' :
		System.out.println("La lettre se trouve dans le tableau !");
		break;
	case 'e' :
		System.out.println("La lettre ne se trouve pas dans le tableau");
		break;
	}*/
	
	
	/*boolean verifie = false;
	
	
	for(int i = 0; i < tabVoyelle.length;i++) {
		
		if (choix == tabVoyelle[i]) {
			verifie = true;
		
	    }else {
	    	verifie = false;
	    }
	}
				
		
		if (verifie==true) {
			
			System.out.println("La lettre se trouve dans le tableau !");
		
		}else {
			System.out.println("La lettre ne se trouve pas dans le tableau");
						
		}
		
	
	System.out.println(); */
