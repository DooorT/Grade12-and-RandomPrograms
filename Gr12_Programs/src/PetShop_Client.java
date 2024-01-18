import java.util.ArrayList;
public class PetShop_Client 
{
	public static void main(String[] args) 
	{
		//Variable Declarations & Initializations
		Bird Bubba = new Bird("Bubba", "Falcon", "Brown", 'M', 15);
		Bird Tweety = new Bird("Tweety", "Northern Cardinal", "Red", 'F', 2);
		Dog Rover = new Dog("Rover", "Lab", "black", 'M', 2);
		Dog Luke = new Dog("Luke", "French Bulldog", "Brown", 'M' , 3);
		@SuppressWarnings("unused")
		ArrayList<Dog> canines = new ArrayList<Dog>();
		@SuppressWarnings("unused")
		ArrayList<Bird> flyers = new ArrayList<Bird>();
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		PetShop PetShmat = new PetShop("PetShmat", "123 Right There dr." , "951-262-3062" , animalList);
		PetShmat.addDog(Rover);
		PetShmat.addBird(Bubba);
		PetShmat.addDog(Luke);
		PetShmat.addBird(Tweety);
		animalList.add(Rover);
		animalList.add(Bubba);
		animalList.add(Luke);
		animalList.add(Tweety);
		
		System.out.println(PetShmat);
		//System.out.println(PetShmat);
	}//end main()
}//end class