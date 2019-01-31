package com.simplon;

import javax.swing.text.html.StyleSheet.ListPainter;

@SuppressWarnings("serial")
public class NombreProduitException extends Exception{

	public NombreProduitException() {
		
		System.out.println("Votre Panier est vide");
		
	}
	
}
