package com.simplon;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShopServelet
 */
public class ShopServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public ShopServelet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		//String fullInfo = request.getQueryString();




		//-----------------definition du chemin
		/*if(fullInfo==null) {
			this.getServletContext().getRequestDispatcher("/viewCommande.jsp").forward(request, response);
		}else {
			request.setAttribute("fullinfo",fullInfo);
			this.getServletContext().getRequestDispatcher("/viewAffiche.jsp").forward(request, response);

		}*/
		//-----------------definition du chemin----------------------------------------------------------

		this.getServletContext().getRequestDispatcher("/viewCommande.jsp").forward(request, response);
	}


	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//------------Client

		String nom1 = request.getParameter("nom");
		String adresse1 = request.getParameter("adresse");

		Client c1 = new Client(nom1,adresse1);
		//----------------------------------------------------

		String donnesClient = c1.afficheClient();

		//------------------Produit
		Produit p1 = new Television(12.30, "Trés beau", "Samsung", "4/3", "4K");
		Produit p2 = new Four(60.99, "Trés chaud", "Philips", 50, 900);
		Produit p3 = new Cafetiere(32.99, "Bon cafée", "Nespreso", 5, 2);

//		HashMap<String,String> mapProduit = new HashMap<String,String>();
//
//		String allProduits = request.getParameter("produit");
//		
//		
//		String[] tabProduits = allProduits.split("&");
//		String[] tabParProduit = null;
//		for(int i = 0 ; i < tabProduits.length;i++) {
//
//			tabParProduit= tabProduits[i].split("="); 
//
//		}
//
//
//		for(int i = 0 ; i < tabProduits.length;i++) {
//
//			System.out.println(tabParProduit[i]); 
//
//		}
//
//		for(Entry<String, String> ls : mapProduit.entrySet()) {
//
//
//
//		}


		//--------------------------------------------------------------



		//-------------------livraison

		String choixLivraison = request.getParameter("choixLib");

		Livraison l1 = null;
		l1 = choixLib(choixLivraison);

		//---------------------------------------------------------------------

		//--------------------Facture
		Facture f1 =new Facture(c1,l1);

		f1.ajouterProduit(p1, 2);
		//f1.ajouterProduit(p2, 1);
		//f1.ajouterProduit(p3, 3);
		try {
			f1.afficheFacture();
			
			String facturetous=f1.afficheLaFacture();//String sur le quel on met toute la facture en String
			request.setAttribute("facture", facturetous);
		}catch(NombreProduitException e) {}



		String infoLib = l1.infoLivraison();

		request.setAttribute("livraison",infoLib);


		//		request.setAttribute("leNom",nom1);
		//		request.setAttribute("ladresse", adresse1);

		request.setAttribute("donneesClients", donnesClient);


		this.getServletContext().getRequestDispatcher("/viewAffiche.jsp").forward(request, response);

	}
	
	
	static public Livraison choixLib(String choixLivraison1) {
		
		Livraison tonChoix=null;
		
		switch (choixLivraison1) {

		case "EX":

			tonChoix = new Express(1);
			//			System.out.println("Habitez vous a Paris ?" + "\n" + "OUI - 1" + "\n" + "NON - 2");

			//			Scanner lieu = new Scanner(System.in);
			//			int choixExpress = sc.nextInt();
			//
			//			if (choixExpress == 1) {
			//				l1 = new Express(1);
			//			} else if (choixExpress == 2) {
			//				l1 = new Express(2);
			//			} else {
			//				System.out.println("Votre commande n'est pas valide");
			//			}

			break;

		case "DO":
			tonChoix = new Domicile();
			break;

		case "RM":
			tonChoix = new RetirerMagasin();
			break;

		case "PR":

			System.out.println("Quel est le numéro de votre point relay : ");
			Scanner numRelay = new Scanner(System.in);
			int rel = numRelay.nextInt();
			tonChoix = new Relay(rel);

			
		default:
			System.out.println("votre choix n'existe pas");

		}
		
		return tonChoix;
		
	}
	
}