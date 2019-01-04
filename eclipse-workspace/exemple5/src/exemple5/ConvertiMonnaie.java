package exemple5;

public class ConvertiMonnaie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		double euro = 1;
		double malta = 0.5;
		
		double a = 1;
		double b = 1.0;
		
		for(int i = 0 ; i <100 ; i++) {
			
			euro = euro * a;
			malta = malta * b;
			
			System.out.println(euro + " € = " + malta + " malta");
			
			a++;
			b++;
			
			euro = 1;
			malta = 0.5;
		}*/
		
		double malta = 0.5;
		
		for(int i = 1 ; i <= 100 ; i ++) {
			
			System.out.println(i + " € = "+ malta *i + " malta");
		}
		

	}

}
