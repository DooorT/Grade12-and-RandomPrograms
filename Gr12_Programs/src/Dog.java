/*March 4th, 8th, 2022
 * This is not an executable file
 * Class File: TEMPLATE/DEFINITION FOR A DOG OBJECT
 * Class files are also called SERVER files -- 
 * ALL OBJECTS HAVE: 1 STATE   2 BEHAVIOUR
 * State: attributes/characteristics
 * Behaviour: methods that degine the action of that object
 * 
 * HIERARCHY OF INHERITANCE: All objets inheriti from the Ultimate Supercalss: Object  
 * 
 * 
 * 
 * RUBRIC FOR THURDAY QUIZ
 * -Name object properly (Dog, Robot, Bird, Genocide, etc.)
 * -declare private instance variables (attributes) (variable types too)
 * -
 * 
 * 5 Main pats to the Anatomy of a Class that defines an object
 *  
 */
public class Dog extends Animal
{
		// 1. PRIVATE INSTANCE VARIABLES -- ATTRIBUTES
	/*
	private String name;
	private String breed;
	private String colour;
	private char gender;
	private int age;
	*/
	private String colour;
		// 2. COSTRUCTORS== when "new" is used the constructor is INVOKED
							//-- creates the state ie it aattaches the attributes to the object
							// allows for the instantiation of object in memory
		// NAMED THE SAME AS CLASS
	public Dog(String name, String breed, String colour, char gender, int age)  //TEMPLATE- creates the object with respect to the parameters defined
																				//exists in memory 
	{
		//"this" keyword refers to the class instance variables  (Used when the parameters have the 
		//same names as the PIV names)  (this refers to the variable that is local, rather than the paramters
		super(name, breed, gender, age);
		this.colour = colour;
	}//end Regular Constructor
	
	//CONSTRUCTORS CAN BE OVERLOADED: Default constructors & Regular constructors
	//Default constructor: will set one or more attributes to a default value
	//   ex. A Golden Retriever breeder doesnt need the breed or age passed as an argument,
	//       they can be set as default values. 
	/*
	public Dog(String name, char gender)
	{
		super("Unknown", "Golden Retriever", 'M', 0);
		colour = "Golden";
		this.name = name;
		this.gender = gender;
		colour = "Golden";
		breed = "Golden Retriever";
		age = 0;
	}
	*/
	public Dog()
	{
		super("Unknown", "Golden Retriever", 'M', 0);
		colour = "Golden";
	}
	//3. Accessor/get methods AND Mutator/set methods
	//SET METHODS ARE VOID METHODS, THAT ALLOW FOR PIVs TO BE UPDATED
	public void setColour(String colour)
	{
		this.colour = colour;
	}//end setColour()
	public String getColour()
	{
		return colour;
	}//end getColour()
	//4. Class methods  -- denote the behaviour of the object. 
	public void speak()
	{
		System.out.println("\nRoof Roof Cuh, no cap, no kizzy, I'm dog");
	}
	
	//5. toString()
	
	//CLASS HIERARCHY -- Classes can be SUBCLASSES OF OTHER CLASSES
	//ONE "MASTER" OR ULTIMATE MEGA WARLORD SUPER CLASS where every class is a subclass of this class: CLASS OBJECT
	//Every class inherists from Object: the one thing that is already defined in object is toString()
	
	//toString() is inherited from the superclass Object
	//when printing objects, toString() is AUTOMATICALLY invoked
	
	public String toString() //prints an object
	//need to program how we want the program to be "printed"
	//must return a String that shows how to print.
	{
		return("Name: " + getName() + "\n" +
				"Breed: " + getBreed() + "\n" + 
				"Colour: " + colour + "\n" + 
				"Gender: " + getGender() + "\n" +
				"Age: " + getAge() + "\n");
	}//end toString()
}//end class Dog