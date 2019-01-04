
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pays p1 = new Pays("Canada",12);
		Pays p2 = new Pays(1233);
		Capital c1 = new Capital("France", 1, "Paris");
		Capital c2 = new Capital(12,"Paris");
		
		
		
		System.out.println(p1.affiche());
		System.out.println(p2.affiche());
		System.out.println(c1.affiche());
		System.out.println(c2.affiche());
		

	}

}
