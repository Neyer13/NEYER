
public class Capital extends Ville{
	
	//protected String nomVille;
	//protected int hab;
	/*protected String capital;
	
	public Capital(String v, int h, String c ) {
		super(v,h);
		this.capital = c;
	}
	
	public Capital(String v,String c) {
		super(v);
		this.capital = c;
	}
	
	public void presentToi(){
		
		String var;
		
		if(hab>0) {
			var = "= "+hab;
		}
		else {
			var = "inconnue";
		}
		
		System.out.println("Ville "+ville+"nombre d'habitants "+var+" et capital  "+capital);
		
	}*/
	
	private String pays;
	//constructeurs
	public Capital(String leNom, String lePays)
	{ super(leNom); //appel du constructeur de Ville. nbHab est initialisé à –1 par ce constructeur
	pays = lePays; }
	public Capital(String leNom, String lePays, int leNbHab)
	{ super(leNom, leNbHab);
	pays = lePays; }
	//accesseurs supplémentaires
	public String getPays( )
	{ return pays; }
	public void setPays(String nomPays)
	{ pays = nomPays; }
	//méthode presenteToi( ) redéfinie , polymorphisme car la metode est redefinie
	public String presenteToi( )
	{ String presente = super.presenteToi( );
	presente = presente + ", Capitale de "+ pays;
	return presente;
	}
}