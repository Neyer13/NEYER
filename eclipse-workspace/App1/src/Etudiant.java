
public class Etudiant {
	
	private String nom;
	
	public Etudiant(String nom) {
		
		this.nom = nom;
		
	}
	
	public void travailler() {
		
		System.out.println(nom+" se met au travail!");
		
	}
	
	public void seReposer() {
		
		System.out.println(nom+" ne fait rien");
		
	}

}
