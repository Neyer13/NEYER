package com.projet.inter;

import java.util.Date;

public class Personne implements IPersonne{// "extend" = "implements" pour heriter d'une interface
	
	int idP;//nombre de personel de l'entreprise, il faut diferencier deux id salarie et directeur
	String nomP;
	String prenomP;
	Date dateNais;
	double salaireP;
	Profil profil;
	
	public Personne(/*Profil profil,*/ String nom, String prenom,Date dateN,double salaire){//constructeur
		
		/*this.libelle=libel;*/
		this.nomP=nom;
		this.prenomP=prenom;
		this.dateNais=dateN;
		this.salaireP=salaire;
		
		idP++;
	}
	
	
	public void setProfil(Profil profil) {
		this.profil = profil;
	}


	public void affiche() {
		
		System.out.println("Je suis"+/*profil.libelle+*/","+nomP+prenomP+" né le "+dateNais+", mon salaire mensuel est "+calculerSalaire()+" Euro");
		
	}
	
	
	public double calculerSalaire() {
	
	/*	if(profil.libelle.equals("DG")) {
			
			
			
		}else if(profil.libelle.equals("EN")) {
			
			salaireP= salaireP+(salaireP*0.1);
		}*/
		
		return salaireP;
	}
	

}
