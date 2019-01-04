
public class RunIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal("Tigre",4);
		
		String animalTigre = animal1.formulerMonNom();
		//System.out.println(animalTigre);
        animal1.parler();
        Animal.afficherNombreDAnimaux();
        
        Animal animal2 = new Animal("Serpent",0);
        
        animal2.parler();
        
        Animal.afficherNombreDAnimaux();
        
        String animalSerpent = animal2.formulerMonNom();
        
        System.out.println(animal2.nom);
               
	}
}