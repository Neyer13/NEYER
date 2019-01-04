
public class EssaiAmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne personneSeule;
		Personne ami1;
		Personne ami2;
		
		personneSeule = new Personne("Suzanne"); 
		ami1 = new Personne("Marc");
		ami2 = new Personne("Stan", ami1);
		 
		ami1.setAmi(ami2);//je donne a ami1 comme ami l'ami 2
	
		
		System.out.println(personneSeule.toString());
		
		System.out.println(ami1.toString());
		
		System.out.println(ami2.toString());
		
		/*ami2 = new Personne("Marc","louise");
		
		ami2.getami();
		ami2.setami();
		
		ami2.toString();*/
		
		

	}

}
