
public class EssaiAmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne personneSeul = new Personne("Jean");
		Personne ami1 = new Personne("Neyer");
		Personne ami2 = new Personne("Bruce",ami1);
		
		//ami1.setAmi(ami2);
		
		ami1.setAmi(ami2);
		
		
		System.out.println(personneSeul);
		System.out.println(ami1);
		System.out.println(ami2);
		
	}

}
