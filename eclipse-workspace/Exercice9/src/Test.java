import java.util.Scanner;

public class Test {
	
	int ageClient;
	int habitMontreuil;
	int nombreClient;
	
	public Test(int age,int habit,int nombrC) {
		
		this.ageClient= age;
		this.habitMontreuil=habit;
		this.nombreClient=nombrC;
		
	}
	
	Scanner sc = new Scanner(System.in);

	public int ageClient(){
		
	    int age;
		
       System.out.println("Bonjour quel age avez-vous ?");
       
       age = sc.nextInt();       
       
       return age;
       
	}
	
	
	public int habitMontreuil() {
		
		int habite;
		
		System.out.println("Habitez-vous à Montreuil ?"+"\n");
		
		habite = sc.nextInt();
		
		return habite;
		
	}
	
	public void calcule() {
		
		ageClient();
		
		
		
	}

}
