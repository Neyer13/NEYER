import java.util.Scanner;

public class EleveMoyenne {
	
	Scanner sc = new Scanner(System.in);
	double notes;
	double tabNote[];
	int nbrN;
	
	public EleveMoyenne(){
		
		
	}
	
	
	public String nomEleve() {
		
		String nomE;
		
		nomE = sc.nextLine();
		
		return nomE;
	}
	
	
	public String prenomEleve() {
		String prenomE;
		prenomE = sc.nextLine();		
		return prenomE;
	}
	
	
    public void notesEleve() {
    	
    	nbrN = sc.nextInt();
    	
    	tabNote= new double[nbrN];
    	
    	
    	for(int i = 0 ; i<nbrN ; i++) {
    		
    		do {
    			
    			System.out.println("Entrez la Note "+ (i+1)+" : ");
    		    notes =sc.nextDouble();
    		
    		if (notes < 0) {
    			System.out.println("La note ne doit pas etre négatif");
    			}
    		else if(notes>20) {
    			System.out.println("La note ne doit pas depasser 20");
    		}
    		}while(notes<0 || notes >20);
    		
    		tabNote[i]= notes;
    	}
	}
	
    
    public double moyenne() {
    	double in=1;
    	
    	double somme=0;
    	double moyenne;
    	
    	for(int i=0; i<tabNote.length;i++) {
    		
    		somme = somme + tabNote[i];
    		
    	}
    	
    	moyenne = somme/tabNote.length;
    	
    	return moyenne;
    }
	
	public double noteMax() {
		double max;
		
		max = tabNote[0];
		
		for(int i = 0; i< tabNote.length;i++) {
			
			if(max < tabNote[i]) {
				max=tabNote[i];
			}	
		}
		return max;
	}
	
	public double noteMin() {
		double min;
		
		min = tabNote[0];
		
		for(int i =0 ; i < tabNote.length;i++) {
			
			if(min > tabNote[i]) {
				
				min = tabNote[i];
				
			}	
		}
		return min;
	}
	
	public void passage() {
		
		double moyenne = moyenne();
		
		if (moyenne<10) {
			System.out.println("L'élève redouble");
		}else {
			System.out.println("L'élève passe l'année");
		}
		
	}
}
	
