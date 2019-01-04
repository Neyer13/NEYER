import java.util.Random;

public class AleatoireEleve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tabEleve[] = {"Samba","Marie","Neyer","Benjamin","Yann","Jeslie","Kevin","Arthur","Nahla","Leila","Kumba","Tony","Hamza","Nabil","Abdel","Raed","Sami"};
		
		int aleatoire = new Random().nextInt(tabEleve.length);
		
		System.out.println(tabEleve[aleatoire]);
	}

}
