/*
 * Inheritance
 */
public class Animal
{
	private String name;
	private String breed;
	private char gender; //m or f
	private int age;
	public Animal(String name, String breed, char gender, int age)
	{
		this.name = name;
		this.breed = breed;
		this.gender = gender;
		this.age = age;
	}//end Regular Constructor
	public void setName(String name)
	{
		this.name = name;
	}//end setName
	public void setSpecies(String breed)
	{
		this.breed = breed;
	}//end setSpecies
	public void setGender(char gender)
	{
		this.gender = gender;
	}//end setGender
	public void setAge(int age)
	{
		this.age = age;
	}//end setAge
	public String getName()
	{
		return name;
	}//end getName
	public String getBreed()
	{
		return breed;
	}//end getSpecies
	public char getGender()
	{
		return gender;
	}//end getGender
	public int getAge()
	{
		return age;
	}//end getAge
	public String toString()
	{
		return "Name: " + name +
				"Breed: " + breed +
				"Gender: " + (gender=='f'?"Female":"Male") +
				"Age: " + age;
	}//end toString()
}//end class Animal
