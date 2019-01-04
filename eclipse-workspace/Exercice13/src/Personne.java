
public class Personne {

	private String nom;
	private Personne ami;
	
	public Personne(String nom) {
		this.nom=nom;
	}
	
	public Personne(String nom, Personne ami) {
		this.nom=nom;
		this.ami=ami;
		
	}
	
	public Personne getAmi() {//recuperer
		return ami;
	}

	public void setAmi(Personne ami) {//ecrire //Set s'emploi pour "écrire" n'attribut de la classe. je lui donne un ami
		this.ami = ami;
	}

	public String toString() {
		
		String reponse;
		
		if(ami==null) {
			reponse =nom+" n'a pas d'amis";
		}else {
			reponse = nom +" est l'ami de "+ami.nom;//je donne le nom de l'ami
		}
		
		return reponse;  
	}
	
}
