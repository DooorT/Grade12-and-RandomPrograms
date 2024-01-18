public class Bird extends Animal
{
	/*
	private String name;
	private String species;
	private String colour;
	private char gender;
	private int age;
	*/
	private String colour;
	public Bird(String name, String species, String colour, char gender, int age)
	{
		super(name, species, gender, age);
		this.colour = colour;
	}//end Regular Constructor
	/*
	public Bird(String name, String colour, int age)
	{
		this.name = name;
		species = "Parrot";
		this.colour = colour;
		gender = 'M';
		this.age = age;
	}//end
	*/
	public Bird()
	{
		super("Unknown", "Unknown", 'f', 0);
		colour = "blue";
	}//end
	public void setColour(String colour)
	{
		this.colour = colour;
	}//end setColour
	
	public String getColour()
	{
		return colour;
	}//end getColour
	public void speak()
	{
		System.out.println("Caw Caw\n");
	}//end speak()
	public void fly()
	{
		System.out.println(getName() + " flies in circles.\n");
	}//end fly()
	public void eat()
	{
		System.out.println(getName() + " eats some seeds.\n");
	}
	public String toString()
	{
		return ("Name: " + getName() +
				"\nSpecies: " + getBreed() +
				"\nColour: " + colour +
				"\nGender: " + (getGender()=='F'?"Female":"Male") +
				"\nAge: " + getAge() + 
				"\nColour: " + colour + "\n");
	}//end toString()
}//end Bird