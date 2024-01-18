//Soccer Player
public class Player 
{
	private String name;
	private int jerseyNum;
	//private double salary: every year the salary increases by 700k
	//would add public void salaryRaise
	public Player(String name, int jerseyNum)
	{
		this.name = name;
		this.jerseyNum = jerseyNum;
	}//end Regular Constructor
	public Player()
	{
		name = "Unknown";
		jerseyNum = -1;
	}//end Default Constructor
	public String getName() 
	{
		return name;
	}//end getName()
	public int getJerseyNum() 
	{
		return jerseyNum;
	}//end getJerseyNum()
	public void setName(String name) 
	{
		this.name = name;
	}//end setName()
	public void setJerseyNum(int jerseyNum) 
	{
		this.jerseyNum = jerseyNum;
	}//end setJerseyNum()
	public String toString() 
	{
		return "Name: " + name + 
			   "\nJersey Number: " + jerseyNum + "\n";
	}//end toString()
}//end class