
public class Palandrome {
	
	

	/*void Palamdrome(String[] motTab){
		
		this.motTab=motTab;
	}*/
	
	/*public String[] inversion() {
		
		String lettre;
		
		for (int i=0; i>motTab.length;i++) {
			
			lettre = motTab[i];
			System.out.println(lettre);
		}
		return tabMot;	
	 }	*/
	
	
	public static void main(String[] args) {
	
		/*String[] motTab = {"Neyer"};
		int[] tabMot = new int[motTab.length];*/
		
        
        
		/*for (int i = 0; i < motTab.length;i++) {
			
			lettre = motTab[i];
			System.out.println(lettre);
			
		}
		for (int j = 0; j < motTab.length ; j++) {
				
			
			motTab.
				
			System.out.println(lettre);
		}*/
		
		String lettre = "laval";
        String reverse = "";
		
			String sb = new  StringBuilder(lettre).reverse().toString();  // inverse le String
	    	System.out.println("L'inverse de "+lettre+" est "+sb);
	    	/*
	    	 int length = lettre.length();
	         
	         for (int i = length - 1; i >= 0; i--) { // pas compris
	            reverse = reverse + lettre.charAt(i);
	         }
	         */
	         if (lettre.equals(sb))
	             System.out.println(lettre+" est un palindrome.");
	          else
	             System.out.println(lettre+" n'est pas un palindrome.");
	}
}
