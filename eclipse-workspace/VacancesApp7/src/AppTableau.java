
public class AppTableau {
	
	int[] tab;
	
	public AppTableau(int[] tab) {
		
		this.tab=tab;
		
	}
	
	public void afficheTableau() {
		
		System.out.print("Le tableau initial : (");
		
		for(int i = 0; i < tab.length ; i++) {
			
			System.out.print(tab[i]);
			
			if ((i-1)!=tab.length) {
				System.out.print(",");
			}
				
		}
		System.out.println(")");	
	}
	
	public void longeurTableau() {
		
		System.out.println("La longeur du tableau est : "+tab.length);	
		
	}
	
	public void sommeTableau() {
		
		int somme=0;
		
		for(int i =0; i < tab.length ; i++) {
			
			somme += tab[i];
		}
		
		System.out.println("La somme du tanbleau est : "+somme);
	}
	
	public void indiceMax() {
		
		int indiceMax=0;
		int max = 0;
		
		for(int i = 0 ; i < tab.length ; i++) {
			
			if(max<tab[i]){
				max=tab[i];
			   indiceMax=i;
			   
			}	
		}
		System.out.println("L'indice qui comporte le nombre le plus grand est : "+indiceMax);
	}
	
	public void ajout(int ajout) {
		
		System.out.println("Apres l'ajout de : "+ajout);
		
		afficheTableau();
		
	}

	public void setTab(int[] tab) {
		this.tab = tab;
	}
	
	public void affiche2() {
		for(int i = 0 ; i < tab.length ; i++) {
			
			System.out.println(tab[i]);
			
		}
	}
	
}
