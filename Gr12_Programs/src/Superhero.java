/*
 * D. Carreira
 * Superhero class
 * April 6th 2022
 * Interactions between objects.
 */
public class Superhero 
{
	private String name;
	private String superPower;
	private int  powerStrength;//1-10  -- range 1-10
	public Superhero(String name, String superPower, int powerStrength)
	{
		this.name = name;
		this.superPower = superPower;
		this.powerStrength = powerStrength;
	}//end Regular Constructor
	public Superhero()
	{
		name = "Generic Superhero";
		superPower = "Stength";
		powerStrength = 5;
	}//end Default Constructor
	public Superhero(String name, String superPower)
	{
		this.name = name;
		this.superPower = name;
		powerStrength = 5;
	}//end Default Constructor
	public void setName(String name)
	{
		this.name = name;
	}//end setName()
	public void setSuperPower(String superPower)
	{
		this.superPower = superPower;
	}//end setsuperPower()
	public void setPowerStrength(int powerStrength)
	{
		this.powerStrength = powerStrength;
	}//end setPowerStrength()
	public String getName()
	{
		return name;
	}//end getName()
	public String getSuperPower()
	{
		return superPower;
	}//end getSuperPower()
	public int getPowerStrength()
	{
		return powerStrength;
	}//end getPowerStrength()
	public void add1Strength()
	{
		if(powerStrength<=9)
		{
			powerStrength++;
		}//end if
	}//end add1Strength()
	public void add2Strength()
	{
		if(powerStrength<=8)
		{
			powerStrength+=2;
		}//end if
	}//end add2Strength()
	public void reduce1Strength()
	{
		if(powerStrength>=2)
		{
			powerStrength--;
		}//end if
	}//end reduce1Strength()
	public void reduce2Strength()
	{
		if(powerStrength>=3)
		{
			powerStrength-=2;
		}//end if
	}//end reduce2Strength()
	public String toString()
	{
		return ("Superhero Name: " + name +
				"\nSuperpower: " + superPower +
				"\nSuperhero Strength: " + powerStrength + "\n");
	}//end toString()
}//end Superhero