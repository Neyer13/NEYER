package com.projet.inter;

public class Profil {

	static int id;
	Profil libelle;//directeur, employé
	String code;//EP ou DG
	
	public Profil(int id, Profil libel) {
		
		this.id=id;
		this.libelle=libel;
		id++;
		
	}	
}