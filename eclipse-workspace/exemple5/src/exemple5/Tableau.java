package exemple5;

public class Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated lmethod stub
/*
		char tabAlpha[] = {'a','e','i','o','u','y'} ; 
		
		//tabAlpha.length = taille de ton tableau
		
		for(int i =0; i < tabAlpha.length ;i++) {
		
		System.out.println("A l'emplacement " + i +" du tableau nous avons = "+ tabAlpha[i]);
	    }
*/
		//puissance de 2,option 1
		/*int resultat;
		int e;
		
		for(int i = 0 ; i <=9 ; i++) {
			
			resultat = 1;
			
			e = i;
			
			while(e > 0) {
				resultat = resultat * 2;
				e--;
			}
			
			System.out.println("2 à la puissance "+ i + " est "+ resultat);
		}*/
		
		//*******option 2
		
		int resultat;
		
		for (int i = 0; i<=9;i++) {
			System.out.println((int)Math.pow(2,i));
		}
	
	}	
}
