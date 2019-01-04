
public class B extends A{
	
	boolean verite;
	B b = new B(true);
	int valeur;
	B() {
	System.out.println(b);
	System.out.println("constructeur B()");
	}
	
	B(boolean verite) {
	this.verite = verite;
	System.out.println("constructeur B(boolean)");
	}
	B(boolean verite, int valeur) {
	this(valeur);
	this.verite = verite;
	System.out.println("constructeur B(boolean, int)");
	}
	public String toString() {
	return "B : (" + verite + ", " + valeur +")\n";
	}

}
