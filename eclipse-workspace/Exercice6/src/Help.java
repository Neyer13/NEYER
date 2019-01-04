import java.util.Scanner;

public class Help {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Help : "+"\n");
		System.out.println("1. if");
		System.out.println("2. switch");
		System.out.println("3. for");
		System.out.println("4. while");
		System.out.println("5. do while"+"\n");
		
		System.out.println("Tapez le numero de lié à l'opérateur pour laquelle vous voulez avoir de l'aide :");

		Scanner  sc = new Scanner(System.in);
		byte choix = sc.nextByte();
		
		switch(choix) {
		
		case 1 : 
			System.out.println("if(condition){"+"\n"
					+ "	Instructions;"+"\n"+"}");
			break;
		case 2 :
			System.out.println("switch(variable numérique) {"+"\n"+"case 1 : "+"\n"+"    Instructions;"+"\n"+"break;"+"\n"+"\n"+"case 2 : "+"\n"+"    Instruction;"+"\n"+"break;"+"\n"+"..."+"\n"+"default : "+"\n"+"    Instructions;"+"\n"+"break;"+"\n"+"}");
		    
			break;
		case 3 :
			System.out.println("for(int i; condition ; i++){"+"\n"+"    Instruction;"+"\n"+"}");
			break;
		case 4 :
			System.out.println("while(boolean){"+"\n"+"    Instruction;"+"\n"+"}");
			break;
		case 5 :
			System.out.println("do{"+"\n"+"    Instruction;"+"\n"+"}"+"while(boolean);");
			break;
		default :
				System.out.println("Numero non valide.");
		}
	}

}
