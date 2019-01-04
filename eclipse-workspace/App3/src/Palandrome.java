
public class Palandrome {
	
	String mot;
	String inverse;
	
	public Palandrome(String mot) {
		
		this.mot=mot;
		
	}
	
	public void inverser() {
		
		inverse = new StringBuilder(mot).reverse().toString();
		
		System.out.println("L'inverse de "+mot+" est "+inverse);
		
	}
	
	public void testPalindrome() {
		
		if(inverse.equals(mot)) {
			
			System.out.println(mot+" est un palindrome");
			
		}else {
			System.out.println(mot+" n'est pas un palindrome");
		}
		
	}

}
