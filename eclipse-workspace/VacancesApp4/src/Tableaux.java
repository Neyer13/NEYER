
public class Tableaux {
	
	int[] tab;
	
	int[] tab1;
	
	public Tableaux(int[]tab) {
		this.tab = tab;
	}
	
	public void replir1() {
		
		for(int i = 0; i < 4 ; i++) {
			
			tab[i]=i;
			//tab1[i]=i;
		}
		
		affiche();
	}
	
	public void remplir2(int[]tab) {
		for(int i = 0; i<tab.length;i++) {
			
			tab[i]=i+5;	
		}
		
		affiche();
	}
	
	public void remplir3() {
		
		int nb = tab.length;
		
		for(int i = 0; i < tab.length; i++) {
			
			tab[i]=nb-i;
			
		}
		affiche();
		
	}
	
	public void operation2() {
		
		int compteur=0;
		
		for(int i = 0 ; i < tab.length ; i++) {
			
			if(tab[i]<2 || tab[i]>4) {
				compteur++;
			}
			
		}
		System.out.println("il y a "+compteur+" chiffres plus petit que 2 et plus grand que 4");
	}
	
	public void operation1() {
		
		int compteur=0;
		
		for(int i = 0 ; i < tab.length ; i++) {
			
				if(tab[i]==9) {
				compteur++;
			}
			
		}
		System.out.println("il y a "+compteur+" chiffres égale à 9");
		
	}
	
	public void operation3() {
		
		int somme = 0;
		
		for(int i = 0 ; i < tab.length ; i++) {
			
			somme = somme + tab[i];
		}
		System.out.println("La somme est "+somme);
		
	}
	
	
	
	public void affiche() {
		
		for(int j = 0; j < tab.length;j++) {
			
			System.out.print(tab[j]);
			
		}
		System.out.println("");
	}
}
