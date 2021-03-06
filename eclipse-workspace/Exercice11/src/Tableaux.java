import java.util.Arrays;

public class Tableaux {
	
	public static void main(String args[]) {
        // Construction d'un tableau:
        int[] tab = {3, 7, 1, 9, 2, 8, 9, 1, 2, 5};
        // Opérations sur le tableau:
        tableaux(tab);
 
        // La même chose pour d'autres tableaux:
        int[] tab1 = remplir1(5);
        tableaux(tab1);
 
        int[] tab2 = remplir2(10);
        tableaux(tab2);
 
        int[] tab3 = remplir3(5);
        tableaux(tab3);
    }
 
    /**
     * Cette méthode retourne un tableau int[] de nb éléments
     * initialisés en ordre croissant de 0 à 4.
     * @param nb
     * @return
     */
    static int[] remplir1(int nb) {
        int[] tab = new int[nb];
     // A compléter
        for(int i = 0; i < tab.length;i++){
        	
        	tab[i]=i;	
        }
 
        return tab;
    }
 
    /**
     * Cette méthode retourne un tableau int[] de nb éléments
     * initialisés en ordre croissant à partir de 5.
     * @param nb
     * @return
     */
    static int[] remplir2(int nb) {
        int[] tab = new int[nb];
        
        for (int i = 0 ; i < tab.length;i++) {
        	tab[i]=i+5;
        }
        // A compléter
        return tab;
    }
 
    /**
     * Cette méthode retourne un tableau int[] de nb éléments
     * initialisés en ordre décroissant de nb à 1.
     * @param nb
     * @return
     */
    static int[] remplir3(int nb) {
        int[] tab = new int[nb];
        // A compléter
        
        for(int i = 0; i<tab.length;i++) {
        	
        	tab[i]=nb-i;
        	//tab[i]=tab.length-i;
        }
        return tab;
    }
 
    static void tableaux(int[] tab) {
        afficher(tab);
        operation1(tab);
        operation2(tab);
        operation3(tab);
        operation4(tab);
        operation5(tab);
    }
 
    /**
     * Cette méthode affiche tous les éléments du tableau reçu en
     * paramètre sur une même ligne. Les éléments sont séparés par
     * deux espaces.
     * @param tab
     */
    static void afficher(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            // A compléter
        	System.out.print(tab[i]+"  ");
        }
       // System.out.println(Arrays.toString(tab)+"\n");    // Saut de ligne à la fin de l'affichage :solution 1
    }                                                       
 
    /**
     * Cette méthode calcule et affiche le nombre d'éléments de valeur
     * 9 dans le tableau. La variable nb sert à compter les éléments
     * trouvés. Elle est initialisée à 0 et incrémentée dans la boucle
     * qui parcourt le tableau chaque fois que l'on trouve un 9.
     * @param tab
     */
    static void operation1(int[] tab) {
        int nb = 0;
     // A compléter
        for (int i = 0 ; i < tab.length;i++) {
        	if(tab[i]==9) {
        		nb++;
        	}
        }
        
       System.out.println("Il y a " + nb + " éléments de valeur 9 dans le tableau");
        
    }
 
    /**
     * Cette méthode calcule et affiche le nombre d'éléments qui sont
     * plus grand que 4 OU plus petit que 2.
     * @param tab
     */
    static void operation2(int[] tab) {
        // A compléter
    	
    	int count = 0;
    	for (int i = 0 ; i < tab.length;i++) {
    		
    		
    		
    		if (tab[i]<2 || tab[i]>4) {
    			
    			count ++;
    		}	
    	}
    	System.out.println("il y a "+count+" nombres plus grands que 4 et plus petit que 2");
    }
 
    /**
     * Cette méthode calcule et affiche le somme de tous les éléments du tableau.
     * @param tab
     */
    static void operation3(int[] tab) {
        // A compléter
    	int somme=0;
    	
    	for (int i=0; i<tab.length;i++) {
    		somme = somme + tab[i];
    	}
    	System.out.println("Somme " + somme);
    }
 
    /**
     * Cette méthode calcule et affiche la moyenne arithmétique de
     * tous les éléments du tableau.
     * @param tab
     */
    static void operation4(int[] tab) {
        // A compléter
    	int moyenne;
    	int somme=0;
    	
    	for(int i=0 ; i<tab.length;i++) {
    		somme = somme + tab[i];
    	}
    	System.out.println("moyenne : " +somme/tab.length);
    }
 
    /**
     * Cette méthode calcule et affiche le plus grand élément du tableau.
     * @param tab
     */
    static void operation5(int[] tab) {
        // A compléter
    	int max = tab[0];
    	
    	for(int i=0; i < tab.length ; i++) {
    		if (max>tab[0]){
    			
    			max=tab[i];	
    		}
    	}
    	System.out.println("le plus grand nombre est "+max);
    }

}
