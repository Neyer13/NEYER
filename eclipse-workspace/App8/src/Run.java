
public class Run {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		A[] tab;
		
		tab = new A[5];
		tab[0]=new B();
		tab[1]=new C();
		tab[2]=new C();
		tab[3]=new B();
		tab[4]=new C();
		for(int i =0; i<tab.length;i++) {
			
			tab[i].decrire();; 
			
		}

	}

}
