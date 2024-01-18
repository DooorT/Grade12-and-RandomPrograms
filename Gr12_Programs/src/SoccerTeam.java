/*
 * Soccer League Program
 * Soccer Team has a set of Players, AL<> of players
 */
import java.util.ArrayList;
public class SoccerTeam 
{
	private String name;
	private String league;
	private String location;
	private ArrayList<Player> players;
	//Refular will take in as an argument an AL<>
	public SoccerTeam(String name, String league, String location, ArrayList<Player> players) 
	{
		this.name = name;
		this.league = league;
		this.location = location;
		this.players = players; //sets the references/addresses to be equal
	}//end Constructor()
	public SoccerTeam(String name, String league, String location) 
	{
		this.name = name;
		this.league = league;
		this.location = location;
		players = new ArrayList<Player>();
	}//end Constructor()
	public String getName() 
	{
		return name;
	}//end getName()
	public void setName(String name) 
	{
		this.name = name;
	}//end setName()
	public String getLeague() 
	{
		return league;
	}//end getLeague()
	public void setLeague(String league) 
	{
		this.league = league;
	}//end setLeague()
	public String getLocation() 
	{
		return location;
	}//end getLocation()
	public void setLocation(String location) 
	{
		this.location = location;
	}//ent setLocation()
	public ArrayList<Player> getPlayers() 
	{
		return players;
	}//end getPlayers()
	public void setPlayers(ArrayList<Player> players) 
	{
		this.players = players;
	}//end setPlayers()
	public void addPlayer(Player player)
	{
		players.add(player);
	}//end addPlayer()
	public void addPlayerIndex(Player player, int index)
	{
		players.add(index, player);
	}//end addPlayer()
	public void removePlayer(Player player)
	{
		players.remove(player);
	}//end removePLayer()
	public void removePlayerObject(Object object)
	{
		players.remove(object);
	}//end removePLayer()
	public void removePlayerIndex(int index)
	{
		players.remove(index);
	}//end removePlayerIndex()
	public String playerList()
	{
		String list = "";
		for(int i = 0; i < players.size(); i++)
		{
			list += players.get(i) + "\n";
		}//end loop
		return list;
	}//end playerList();
	public String toString() 
	{
		return "Team Name: " + name + 
			   "\nTeam League: " + league + 
			   "\nTeam Location: " + location + 
			   "\nTeam Players:\n\n" + playerList();
	}//end toString()
}//end class

//Create a method that will add a raise to every other plyaer in a team -- use modulus
// public static void addPlayerRaises()
//this method will iterate through the teams and add rauses to every other player