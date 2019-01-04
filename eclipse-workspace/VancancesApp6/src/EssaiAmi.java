
public class EssaiAmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne personneSeule=new Personne("Ben");
		Personne ami1 = new Personne("Jerry");
		Personne ami2 = new Personne("Tom",ami1);
		
		ami1.setAmi(ami2);
		
		System.out.println(personneSeule);
		System.out.println(ami2);
		System.out.println(ami1);
		
		
		
		

	}

}
