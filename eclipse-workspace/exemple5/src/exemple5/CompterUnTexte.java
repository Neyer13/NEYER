package exemple5;

public class CompterUnTexte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dire le nombre de mots, lignes et caractères
		
		String text = " Trente rayons convergent au moyeu "+ "mais c'est le vide median" + "qui fait marcher le char."+"\n"+"On faconne l'argile pour en faire des vases,"+"mais c'est du vide interne que depend leur usage. "+"\n";
		
		/*String tabText = text;
		
		int nombreLettre = 0;
		
		for(int i = 0 ; i < tabText.length();i++) {
			
			
			nombreLettre ++;
			
			if(tabText[i] == " ") {
				
			}
			
		}
		
		
		
		System.out.println("Nombre de lettre : "+nombreLettre);*/
		
		
		int nbCarac = 0, nbLignes=0, nbMots = 0;
		for(int i = 0 ; i < text.length();i++) {
			char c = text.charAt(i);//recuperer les caractères un par un 
			
			if(c == ' ') {
				nbMots++;
			}
			if(c == '\n') {
				nbLignes++;
			}	
			nbCarac++;
			//System.out.println(c);
		}	
		System.out.println(nbCarac+" lettres, "+nbMots+" mots et "+nbLignes +" lignes");
	}
	
}
