package segment;

public class Segment {
	
	int segMin;
	int segMax;
	int longeurSeg=0;
	int verif;
	
	public Segment(int segMin, int segMax, int verif) {
		
		this.segMin=segMin;
		this.segMax=segMax;
		this.verif=verif;
		
	}
	
	public void calculeLongeur() {
		
		if(segMin>0) {
			longeurSeg= segMax-(segMin-1);
			
		}else {
			longeurSeg= segMax-segMin;
		}
			
		System.out.println("Longeur du segment ["+segMin+", "+segMax+"] : "+longeurSeg);
	}
	
	public void verifeAbscice() {
		
		if(verif >= segMin && verif <= segMax) {
			System.out.println(verif+" appartient au segment");
		}else {
			System.out.println(verif+" n'appartient pas au segment");
		}
	}
}