
public class Segment {

	int segMax;
	int segMin;
	int testSegment;
	
	public Segment(int segMax,int segMin){
		this.segMax=segMax;
		this.segMin=segMin;
	}
	
	public void calculeLongueur() {
		int longueur=0;
		if(segMax<segMin) {
			int cash = segMin;
			segMin = segMax;
			segMax=cash;
		}
		
		longueur = segMax-segMin;
		
		System.out.println("Longeur du segment ["+segMin+","+segMax+"] : "+longueur);
		
	}
	
	public void abscisseTest(int abscisse) {
		
		if (abscisse >= segMin && abscisse <= segMax) {
			System.out.println(abscisse+" appartient au segment.");
		}else {
			System.out.println(abscisse+" n'appartient pas au segment.");
		}
		
	}
	
}
