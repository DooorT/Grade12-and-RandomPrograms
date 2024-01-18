/*
 * D. Carreira
 * March 22, 2022
 * Classes & ArrayLists<>  -- Recall AL<>'s store OBJECTS
 * classes can inherit from a superclass
 * 						SUPERCLASS - PARENT CLASS EX
 * 							MAMMAL
 *                         /      \
 *                       DOG      CAT  < SUBCLASS
 *                       
 * Benefit: child classes only need to specify attributes that are not common to superclass
 * practical: You can have an ArrayList<Mammals> & store subclass objects in that list
 * 							ANIMAL
 * 							  |
 * 							MAMMAL
 *                         /      \
 *                       DOG      CAT
 */
//Pet shop will now have an ArrayList of Animals ie. mixture of Dogs and Birds
import java.util.ArrayList;
public class PetShop 
{
	//Variable Declarations & Initializations
	private String name;
	private String address;
	private String phoneNum;
	//Create an ArrayList<> of birds and dogs  DO NOT INSTANTIATE ARRAYLIST<> HERE ("new" not here)
	private ArrayList<Animal> animals;
	//private ArrayList<Bird> birds;
	//private ArrayList<Dog> dogs;
	
	//Default constructor - Create new instances of pets to sell
	public PetShop()
	{
		name = "Beuf Dogs & Birds";
		address = "Somewhere on Steeles Ave W.";
		phoneNum = "xxx-xxx-xxxx";
		//birds = new ArrayList<Bird>();
		//dogs = new ArrayList<Dog>();
		animals = new ArrayList<Animal>();
	}//end PetShop() Default Constructor
	
	//Regular Constructor - User option to pass in instantiated ArrayLists<>
	public PetShop(String name, String address, String phoneNum, ArrayList<Animal> animals)
	{
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		//this.birds = birds;
		//this.dogs = dogs;
		this.animals = animals;
	}//end Regular Constructor 1
	public PetShop(String name, String address, String phoneNum)
	{
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		//this.birds = new ArrayList<Bird>();
		//this.dogs = new ArrayList<Dog>();;
		animals = new ArrayList<Animal>();
	}//end PetShop()
	//Mutator/Set Methods
	public void setName(String name)
	{
		this.name = name;
	}//end setName
	public void setAddress(String address)
	{
		this.address = address;
	}//end setAddress
	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}//end setPhoneNum
	/*
	public void setBirds(ArrayList<Bird> birds)     //Replaces one arraylist of birds/dogs with 
	{												//an entirely new arraylist of birds/dogs
		this.birds = birds;
	}//end setBirds
	public void setDogs(ArrayList<Dog> dogs)
	{
		this.dogs = dogs;
	}//end setDogs
	*/
	public void serAnimals(ArrayList<Animal> animals)
	{
		this.animals = animals;
	}
	//Accessor/Get Methods
	public String getName()
	{
		return name;
	}//end getName
	public String getAddress()
	{
		return address;
	}//end getAddress
	public String getPhoneNum()
	{
		return phoneNum;
	}//end getPhoneNum
	//Allow users to retrieve the ArrayLists<>
	
	/*public ArrayList<Bird> getBirds()
	{
		return birds;
	}//end getBirds
	public ArrayList<Dog> getDogs()
	{
		return dogs;
	}//end getDogs
	*/
	//NOTE: whenever there are ArrayLists<> in the class -- You must have a way of adding & Deleting ArrayList<> items!!
	public void addBird(Bird newBird)
	{
		animals.add(newBird);
	}//end addBird()
	public void addDog(Dog newDog)
	{
		animals.add(newDog);
	}//end addDog()
	public void addAnimal(Animal newAnimal)
	{
		animals.add(newAnimal);
	}
	public ArrayList<Animal> getAnimals()
	{
		return animals;
	}
	//GIVE USERS THE  ABILITY TO DELETE Bird and Dog OBJECTS ex. IF THEY ARE SOLD OR KICK THE BUCKET
	public void deleteBird(Bird birdToRem)
	{
		animals.remove(birdToRem);
	}//end removeBird()
	public void deleteDog(Dog dogToRem)
	{
		animals.remove(dogToRem);
	}//end removeDog()
	public void deleteAnimal(Animal animalToRem)
	{
		animals.remove(animalToRem);
	}
	//Allow users to remove an object by index <== unusual & not user friendly
	public void deleteBird(int indexOfBirdToRem)
	{
		animals.remove(indexOfBirdToRem);
	}//end removeBird()
	public void deleteDog(int indexOfDogToRem)
	{
		animals.remove(indexOfDogToRem);
	}//end removeDog()
	public void deleteAnimal(int indexOfAnimalToRem)
	{
		animals.remove(indexOfAnimalToRem);
	}
	//Also MUST have a way to return the ArrayList as Strings & as objects (objects is the get methods)
	/*
	public String birdsList()
	{
		String list = "";
		for(int i = 0; i < birds.size(); i++)
		{
			list+=birds.get(i) + "\n";
		}//end loop
		return list;
	}//end birdsList()
	public String dogsList()
	{
		String list = "";
		for(int i = 0; i < dogs.size(); i++)
		{
			list+=dogs.get(i) + "\n";
		}//end loop
		return list;
	}//end dogsList()
	*/
	public String animalList()
	{
		String animalL = "";
		for(int i = 0; i < animals.size(); i++)
		{
			animalL += animals.get(i) + "\n";
		}
		return animalL;
	}
	public String toString()
	{ 
		return ("Name: " + name +
				"\nAddress: " + address +
				"\nPhone Number: " + phoneNum +
				"\n\nAnimal Inventory: \n" + animalList() + "\n");
	}//end toString()
}//end class petShop