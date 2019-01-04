package etudiant;

public class Etudiant {
	
	private String nom;
	
	public Etudiant(String nom) {
		this.nom=nom;
	}

	public void travailler() {
		
		if(nom=="toto") {
			System.out.println(nom+" se met au travail !");
		}
		else {
			System.out.println(nom+" travail");
		}
		
	}
	
	public void seReposer() {
		if(nom=="toto") {
			System.out.println(nom+" se repose");
		}
	}
}
