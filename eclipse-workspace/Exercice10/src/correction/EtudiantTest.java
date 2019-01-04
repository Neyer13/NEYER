package correction;

public class EtudiantTest {
	
	public static void main(String[] args) {
	    Etudiant john = new Etudiant("Jean Dupont");
	    john.saisieNotes(3);

	    System.out.println("calcul de la moyenne"+ john.moyenne());
	    System.out.println("Note minimale" + john.minimum());
	    System.out.println("Note maximale" + john.maximum());
	    System.out.println("Annee valide ? => " + john.valide());

	  }


}
