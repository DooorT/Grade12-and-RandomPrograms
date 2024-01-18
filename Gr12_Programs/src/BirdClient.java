/*
 * D. Carreira
 * March 8th, 2022
 * Bird Object
 * The assigment was to create a Bird Object as well as a Bird client.
 */
public class BirdClient 
{
	public static void main(String[] args) 
	{
		//Variable Declarations & Initializations
		Bird Bubba = new Bird("Bubba", "Falcon", "Brown", 'M', 15);
		Bird Tweety = new Bird("Tweety", "Northern Cardinal", "Red", 'F', 2);
		//Bird Nigel = new Bird("Nigel", "White", 23);
		Bird Hatchling = new Bird();
		System.out.println(Bubba);
		Bubba.eat();
		Tweety.setAge(6);
		System.out.println(Tweety);
		Tweety.fly();
		//System.out.println(Nigel);
		//System.out.println("The age of Nigel is: " + Nigel.getAge() + "\n");
		//Nigel.speak();
		System.out.println(Hatchling);
		//System.out.println(Nigel.toString());
	}//end main()
}//end class