package com.simplon;

public class Client {
	
	String fullName;
	String adresse;
	static int id=0;

	public Client(String fullName, String adresse) {
		super();
		this.fullName = fullName;
		this.adresse = adresse;
		this.id=id;
		id++;
		
	}

	public String afficheClient() {
		String leClient= "NOM DU CLIENT : "+fullName+"\n"+"ADRESSE CLIENT : "+adresse+" id : "+id; 
		return leClient; 
		
	}
	

}
