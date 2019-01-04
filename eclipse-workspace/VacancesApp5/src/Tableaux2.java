import java.util.Scanner;

public class Tableaux2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez la taille de la matrice : ");
		
		int matrice = sc.nextInt();
		
		int[][] tab = new int [matrice][matrice];
		int[][] tab2 = new int [matrice][matrice];
		
		for (int i = 0 ; i < matrice ; i++) {
			
			for(int j = 0 ; j < matrice ; j++) {
				
				System.out.println("Entre le chiffe dans la ligne "+i+" et colone "+j+" : ");
				
				tab[i][j] = sc.nextInt();
				tab2[i][j] = tab[i][j];
			
			}
			
		}
		System.out.println("La matrice est : ");
		for (int i = 0 ; i < matrice ; i++) {
			
			for(int j = 0 ; j < matrice ; j++) {
				
				System.out.print(tab[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("La matrice transposée est : ");
		for (int i = 0 ; i < matrice ; i++) {
			
			for(int j = 0 ; j < matrice ; j++) {
				
				System.out.print(tab2[j][i]);
			}
			System.out.println("");
		}
		
	}

}
