package com.projet.inter;

import java.util.Date;

public class Personne implements Ipersonne{
	
	static int id;
	String nom;
	String prenom;
	Date dateNais;
	double salaire;
	Profil profil;
	double vraiSalaire;
	
	public Personne(Profil profil,String nom, String prenom, Date dateNais, double salaire) {
		this.nom=nom;
		this.prenom=prenom;
		this.dateNais=dateNais;
		this.salaire=salaire;
		id++;
	}
	
	
	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
        
        
        if (profil.code.equals("EM")) {
        	vraiSalaire = salaire + (salaire*0.1);
        }
		if(profil.code.equals("DG")) {
			vraiSalaire = salaire + (salaire*0.2);
		}
		return vraiSalaire;	
	}


	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		
		System.out.println("Je suis"+profil.libelle+nom+" "+prenom+" né le "+dateNais+", mon salaire mensuel est "+vraiSalaire+" Euro.");
		System.out.println(id);
	}
}
