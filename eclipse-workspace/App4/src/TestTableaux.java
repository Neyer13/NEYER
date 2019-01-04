
public class TestTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Tableaux t1 = new Tableaux(new int[]{1,4,5,6,9,3,7,9,2,6});
			
			//Tableau t2 = new Tableaux(new int[]());
			
			t1.remplir1();
	        t1.remplir2();
	        t1.remplir3();
	        t1.operation2();
	        t1.operation1();
	        System.out.println("La somme est "+t1.operation3()); 
	        System.out.println("La moyenne est "+t1.operation4());
	        t1.operation5();

		}

	}
