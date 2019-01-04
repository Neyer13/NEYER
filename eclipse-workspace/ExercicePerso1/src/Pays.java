
public class Pays {
	
	protected String nomPays;
	protected int nombrHabitant;
	
	public Pays(String nomP, int nombrH){
		
		this.nomPays = nomP;
		this.nombrHabitant = nombrH;	
	}
	
	public Pays(int nombrH) {
		
		this.nombrHabitant=nombrH;
		
	}
	
	protected String affiche() {
		
		String afficher;
		
		afficher = "Le pays est "+nomPays+ "et a "+nombrHabitant+" comme nombre d'habitant.";
		
		return afficher;
	}
}
