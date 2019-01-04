
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

	public Personne getAmi() {
		return ami;
	}

	public void setAmi(Personne ami) {
		this.ami = ami;
	}
	
	
	public String toString() {
		
		String reponse = " ";
		
		if(ami==null) {
			
			reponse = nom+" n'a pas d'amis";
		} else {
			
			reponse = nom+" a comme ami "+ami.nom;
		}
		
		return reponse;
	}
}
