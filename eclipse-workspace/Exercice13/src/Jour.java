
    enum Jour {

	LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;
    	
    	
    	static void action(String nom) {
    		
    		try {
    			Jour jour = Jour.valueOf(nom);
    		
    			switch(jour) {
    		
    				case SAMEDI:
    				case DIMANCHE:
    					System.out.println("Se reposer");
    					break;
    			
    				default :
    					System.out.println("Travailler");
    			}
    		} catch(Exception e) {
    	    	  
    	    	  System.out.println("Votre mot n'est pas valide");
    	      }
    	}
}
