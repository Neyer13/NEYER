import java.util.Scanner;

public class Tableax2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entrez la dimention de la matrice : ");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//taille de la matrice
		
		int tabDeux[][]= new int [n][n];
		int deuxTab[][]=new int [n][n];//tab transposé
		
		for(int l = 0;l<n;l++) {//remplir le tableau en parcourant le tableau d'abord par ligne
			
			for(int c=0;c<n;c++) {//en remplie la ligne en parcourant les collones
				
				System.out.println("Entrez un nombre entier pour la rangé "+l+" et la colonne "+c);
				tabDeux[l][c]=sc.nextInt();//on rempli a deux dimension grace au changement d'indice
				deuxTab[l][c]=tabDeux[l][c];//On copie les données dans l'autre tableau
			}
		
		}
		
			
		System.out.println("La matrice original est : ");
		
		for(int i = 0;i<n;i++) {
			
			for(int j=0 ; j<n ; j++) {
				
				System.out.print(tabDeux[i][j]);
				
			}	
			System.out.println(" ");
		}
		
		System.out.println("La matrice transposée est : ");
		
        for(int i = 0;i<n;i++) {
			
			for(int j=0 ; j<n ; j++) {
				
				System.out.print(deuxTab[j][i]);
				
			}	
			System.out.println(" ");
		}
	}

}
