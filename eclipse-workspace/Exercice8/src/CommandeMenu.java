import java.util.Scanner;

public class CommandeMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);//nombre de menu
		int nombreMenu;
		int compteur = 1;
		
		Scanner sc2 = new Scanner(System.in); //Choix Menu
		int choixMenu;
		
		Scanner sc3 = new Scanner(System.in);//Choix Accompagnement
		int choixAccompagne;
		
		Scanner sc4 = new Scanner(System.in);//Choix Boisson
		int boisson;
		
		String tabMenu[]= {"Aucun","Poulet","Boeuf","Végétarien"};//tableau Menu
		String tabAccompagne[]= {"Aucun","Légumes","Legumes","Frite"};//tableau Accopagnement
		String tabBoisson[]= {"Aucun","Eau plate","Eau gazeuse","Soda"};//tableau Boisson
		String tabRiz[]= {"rien","avec du riz","sans riz"};//choix de riz
		
		
		System.out.println("Bien venue dans notre restaurant !"+"\n"+"Combiens de menu voulez vous ?");
		
		nombreMenu = sc.nextInt();
		
		do {
			
			System.out.println("\n"+"Menu : "+compteur+"\n");
			
			System.out.println("Nous avons trois menu à la carte : "+"\n"+"1. Poulet"+"\n"+"2. Boeuf"+"\n"+"3. Végétarien");
			
			System.out.println("Tapez le numero lier à votre choix : ");
			
			choixMenu = sc2.nextInt();
			
			if (choixMenu==1) { //***********Poulet*********************
				
				System.out.println("Vous avez pris le menu Poulet.");
				System.out.println("Quel accompagnement voulez vous avec votre menu ?");
				System.out.println("1. Légumes frais"+"\n"+"2. Frites"+"\n"+"3. Riz");
				
				choixAccompagne = sc3.nextInt();
				
				switch(choixAccompagne) {
				
				case 1 : 
					System.out.println("Légumes, compris!");
					break;
				case 2 :
					System.out.println("Frites, compris !");
					break;
				case 3 :
					System.out.println("Riz, compris !");
					break;
					
					default :
						System.out.println("Pas d'accompagnement, compris !");
				}	
				
				System.out.println("votre menu à le droit à une boisson !");
				System.out.println("1. Eau plate"+"\n"+"2. Eau gazeuse"+"\n"+"3. Soda");
				
				boisson = sc4.nextInt();
				
				switch(boisson) {
				
				case 1 : 
					System.out.println("Eau plate, compris!");
					break;
				case 2 :
					System.out.println("Eau gazeuse, compris !");
					break;
				case 3 :
					System.out.println("Soda, compris !");
					break;
					
					default :
						System.out.println("Pas de boisson, compris !");
				}
				
				System.out.println("\n"+"Menu : "+compteur+"\n");
				
				System.out.println("Vous avez pris le menu "+tabMenu[choixMenu]+", "
				+tabAccompagne[choixAccompagne]+" comme accompagnemet et "+tabBoisson[boisson]+
				" comme boisson.");
			}//*************Poulet************
					
			
			if(choixMenu == 2) { //************************Boeuf***********************
				
				System.out.println("Vous avez pris le menu Boeuf.");
				System.out.println("Quel accompagnement voulez vous avec votre menu ?");
				System.out.println("1. Légumes frais"+"\n"+"2. Frites"+"\n"+"3. Riz");
				
				choixAccompagne = sc3.nextInt();
				
				switch(choixAccompagne) {
				
				case 1 : 
					System.out.println("Légumes, compris!");
					break;
				case 2 :
					System.out.println("Frites, compris !");
					break;
				case 3 :
					System.out.println("Riz, compris !");
					break;
					
					default :
						System.out.println("Pas d'accompagnement, compris !");
				}						
				
                System.out.println("\n"+"Menu : "+compteur+"\n");
				
				System.out.println("Vous avez pris le menu "+tabMenu[choixMenu]+" et "
				+tabAccompagne[choixAccompagne]+" comme accompagnemet.");
				
			}//**********Boeuf**********************
			
			
			
			if(choixMenu==3) { //******************végétarien**************
				
				System.out.println("Vous avez pris le menu Végétarien.");
				System.out.println("Voulez vous du riz avec votre menu ?");
				System.out.println("1. Oui"+"\n"+"2. Non");
				
				choixAccompagne = sc3.nextInt();
				
				switch(choixAccompagne) {
				
				case 1 : 
					System.out.println("Avec du riz, compris!");
					break;
				case 2 :
					System.out.println("Sans riz, compris!");
					break;	
					default :
						System.out.println("Pas d'accompagnement, compris !");
				}	
				
				System.out.println("votre menu à le droit à une boisson !");
				System.out.println("1. Eau plate"+"\n"+"2. Eau gazeuse"+"\n"+"3. Soda");
				
				boisson = sc4.nextInt();
				
				switch(boisson) {
				
				case 1 : 
					System.out.println("Eau plate, compris!");
					break;
				case 2 :
					System.out.println("Eau gazeuse, compris !");
					break;
				case 3 :
					System.out.println("Soda, compris !");
					break;
					
					default :
						System.out.println("Pas de boisson, compris !");
				}
				
                System.out.println("\n"+"Menu : "+compteur+"\n");
				
				
                System.out.println("Vous avez pris le menu "+tabMenu[choixMenu]+", "
        				+tabRiz[choixAccompagne]+" et "+tabBoisson[boisson]+
        				" comme boisson.");
			}//**********************végétarien****************
				
			compteur++;
			
		}while(compteur <= nombreMenu);

	}
	
	
}
