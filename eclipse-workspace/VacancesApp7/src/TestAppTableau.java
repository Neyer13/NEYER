
public class TestAppTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AppTableau tab1 = new AppTableau(new int[]{7,8,-4,3,55}); 
		
		tab1.afficheTableau();
		tab1.longeurTableau();
		tab1.sommeTableau();
		tab1.indiceMax();
		tab1.ajout(29);
		tab1.setTab(new int[]{2});
		tab1.affiche2();
	}

}
