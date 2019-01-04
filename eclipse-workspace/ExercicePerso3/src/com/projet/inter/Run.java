package com.projet.inter;

import java.sql.Date;


public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne directeur = new Personne(new Profil("DG","rde"),"VALERIANO","Neyer",new Date(2014-12-03),12);
		directeur.affiche();

		Personne employe = new Personne(new Profil("EM","employé"),"LEE","Bruce",new Date(2014-12-13),12);
		employe.affiche();
	}
}
