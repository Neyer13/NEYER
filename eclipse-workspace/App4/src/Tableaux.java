
public class Tableaux {
	
	int[] tab;
	
	
	public Tableaux(int[] tab) {
		this.tab=tab;
	}
	
	public void remplir1() {
		
		for(int i = 0 ; i < 4 ; i++) {
			
			tab[i]=i;
			
		}
		affiche();
	}
	
	public void remplir2() {
		
		for (int i = 0 ; i < tab.length ; i++) {
			
			tab[i]=i+5;
		}
		affiche();
	}
	
	public void remplir3() {
		
		
		for (int i = 0; i < tab.length; i++) {
			
			tab[i]=tab.length-i;
			
		}
		affiche();
	}
	
	public void affiche() {
		
		for(int i=0;i<tab.length;i++) {
			
			System.out.print(tab[i]);
			
		}
		System.out.println("");
	}
	
	public void operation2() {
		
		int compteur=0;
		
		for(int i=0;i<tab.length;i++) {
			
			
			if(tab[i]<2 || tab[i]>4 ) {
				
				compteur++;
				
			}
		}
		System.out.println("Il y a "+compteur+" nombres plus petit que 2 et plus grand que 4");
	}
	
	public void operation1() {
		
		int compteur=0;
		
			for(int i=0;i<tab.length;i++) {
			
			
				if(tab[i]==9 ) {
				
					compteur++;
				
				}
		
	        }
			System.out.println("il y a "+compteur+" nombres égale à 9");
	}
	
	public int operation3() {
		
		int somme = 0;
		
		for(int i = 0;i<tab.length;i++) {
			somme += tab[i];
		}
		return somme;
	}
	
	public double operation4() {
		double moyenne=0;
		
		moyenne= operation3()/tab.length;
		
		return moyenne;
	}
	
	public void operation5() {
		
		int max = tab[0];
		
		for(int i =0;i<tab.length;i++) {
			
			if(tab[i]>max) {
				max=tab[i];
			}
			
		}
		System.out.println("L'élément le plus grand du tableau est "+max);
	}
	
}
