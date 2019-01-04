
public class Affiche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ville v2 = new Ville("Paris ");
		v2.presentToi();
		
		Ville v1 = new Ville("Canada ", 10);
		v1.presentToi();
		
		Capital c1 = new Capital(" ile de france ", 12, "Paris");
		c1.presentToi();
		
		Capital c2 = new Capital("ile de france ","Paris");
		c2.presentToi();*/
		
		Ville v1 = new Ville("Lyon",10000);
		Ville v2 = new Ville("Nice");
		
		Capital c1 = new Capital("Paris", "France", 10000);
		Capital c2 = new Capital("Berlin", "Allemagne");
		
		System.out.println(v1.presenteToi());
		System.out.println(v2.presenteToi());
		System.out.println(c1.presenteToi());
		System.out.println(c2.presenteToi());
	
	}
}
