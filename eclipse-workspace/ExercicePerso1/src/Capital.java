
public class Capital extends Pays{
	
	String nomCapital;
	
	public Capital(String nomP,int nombrH,String nomC){
		super(nomP,nombrH);
		this.nomCapital=nomC;	
	}
	
	
	public Capital(int nombrH,String nomC){
		super(nombrH);
		nomCapital = nomC;
	}
	
	protected String affiche() {
		
		String afficher;
		
		afficher = super.affiche();
		
		afficher = afficher + " et sa capital est "+nomCapital;
		
		return afficher;
	}
}
