package exemple5;

import java.util.Scanner;

public class Avant10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Entrez un chiffre avant 11 :");
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		while(numero < 11) {
			System.out.println(numero);
			numero ++;
		}

	}

}
