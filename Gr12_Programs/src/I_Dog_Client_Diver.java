/*
 * Mar 4, 2022
 * Class Driver -- executable file -- contains main()
 * INSTANTIATION is the physical creation of an object in memory
 * 
 * BIG IDEAS: Reusability, Modularity
 */
import java.util.Scanner;
public class I_Dog_Client_Diver 
{
	public static void main(String[] args) //client tester
	{
		// Variable Declarations & Initializations
		@SuppressWarnings({ "resource", "unused" })
		Scanner myScan = new Scanner(System.in);  // "new" INSTANTIATE an object
		
		//Want to Create COMPLEX OBJECTS
		//ex Dog Rover = new Dog(parameters)
		//ex. Person Christian = new Person(name, age, weight, credit score, crimes, murders)
		//The definition file for person is the Class. Specifies that i need to pass in a name
		// 											   weight, a height, to create a person object
		
		Dog Rover = new Dog("Rover", "Lab", "black", 'M', 2);
		Dog Luke = new Dog("Luke", "French Bulldog", "Brown", 'M' , 3);
		//Dog Sunshine = new Dog("Sunshine", 'F');
		Dog Puppy = new Dog();
		System.out.println(Rover);
		System.out.println("\n" + Luke);   // when you print an object the toString() is invoked
		
		
		//PIV's are private and therefore we CANNOT update attributes directly
		/**      Luke.breed = "Francais Dog";      **/  //MUST USE MUTATOR METHODS IN OBJECT
		Luke.setSpecies("Francais Dog");
		System.out.println("\n" + Luke);
		
		//Print one attribute only
		//Must access one attribute using the get methods in Dog Class.
		/***   System.out.println(Luke.age);  ***/
		System.out.println("\nThe age of " + Luke.getName() + " is " + Luke.getAge() + " years old.");
		//System.out.println("\n" + Sunshine);
		System.out.println("\n" + Puppy);
		System.out.println("\nGet Name method: " + Puppy.getName());	
		System.out.println("Get Breed method: " + Puppy.getBreed());
		Luke.speak();
	}//end main()
}//end class()
