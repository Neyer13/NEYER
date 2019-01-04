import java.util.Scanner;

public class RunEleveMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EleveMoyenne n1 = new EleveMoyenne();
		
		
		
		System.out.println("Entrez le nom de l'élève.");
		String nomE = n1.nomEleve();
		
		System.out.println("Entrez le prenom de l'élève.");
		String prenomE = n1.prenomEleve();
		
		System.out.println("Combien de notes voulez vous rentrer ?");
		n1.notesEleve();
		
		
		
		double moyenne= n1.moyenne();
		double max = n1.noteMax();
		double min = n1.noteMin();

		System.out.println("Elève "+nomE+" "+prenomE+" : "+"\n"+"Moyenne : "+moyenne);
		System.out.println("Meilleur note : "+max+"\n"+"Pire note : "+min);
		
	    n1.passage();

	}
}
