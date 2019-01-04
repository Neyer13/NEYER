package com.projet2.inter;

public class Complexe implements Operation {
	
	double re;
	double im;
	
	public Complexe(double re, double im) {
		this.re=re;
		this.im=im;
	}
	
	public Object moin(Object obj) { // la class Reel pourra bénéfisier de cette class
		
		Complexe plus = (Complexe) obj;
		
		double resultatRe = this.re + plus.re;
		double resultatIm = this.im + plus.im;
		
		
		
		return obj;
		
	}
	
	public void plus() {
		
	}
	
	public void affiche() {
		
	}

}
