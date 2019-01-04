import java.util.Scanner;

public class Tableau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entre la dimension de la matrice : ");
		
		Scanner sc = new Scanner(System.in);
		
		int matrice = sc.nextInt();
		
		int[][]tab=new int[matrice][matrice];
		
		for(int i = 0;i<tab.length;i++) {
			
			for(int j=0;j<tab.length;j++) {
				System.out.println("Entre le chiffre à la ligne "+i+" et colonne "+j);
				tab[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("La matrice est égale à : ");
		
		for(int i = 0;i<tab.length;i++) {
			
				for(int j=0;j<tab.length;j++) {
					System.out.print(tab[i][j]);
				
			}
				System.out.println("");
		}
		
		System.out.println("La matrice transposée est égale à : ");
		
		for(int i = 0;i<tab.length;i++) {
			
				for(int j=0;j<tab.length;j++) {
					System.out.print(tab[j][i]);
				
			}
				System.out.println("");
		}
	}
}
