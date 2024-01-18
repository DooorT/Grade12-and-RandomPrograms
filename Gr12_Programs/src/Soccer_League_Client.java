/*
 * D. Carreira
 * June 6th, 2022
 * Review: Classes with ArrayList
 * Soccer League
 * Classes: SoccerTeam, Player
 * Client will serve as the league 
 */
import java.util.ArrayList;
public class Soccer_League_Client 
{
	public static void main(String[] args) 
	{
		//Variable Delarations & Initialization
		ArrayList<Player> RMDPlayers = new ArrayList<Player>();
		Player karim = new Player("Karim", 9);
		Player mendy = new Player("Mendy", 22);
		Player ronaldo = new Player("Ronaldo", 7);
		Player degea = new Player("Degea", 99);
		RMDPlayers.add(karim);
		RMDPlayers.add(mendy);
		RMDPlayers.add(ronaldo);
		SoccerTeam RMD = new SoccerTeam("Real Madrid", "La Liga", "Madrid, Spain", RMDPlayers);
		SoccerTeam MU = new SoccerTeam("Manchester United", "Premier League", "Manchester, UK");
		MU.addPlayer(degea);
		ArrayList<SoccerTeam> SoccerLeague = new ArrayList<SoccerTeam>();
		SoccerLeague.add(RMD);
		SoccerLeague.add(MU);
		//Print all the teams in this league.
		//     -print each team
		//     -and peint each player
	   System.out.println("Soccer League Teams & Players: ");
		for(int i = 0; i < SoccerLeague.size(); i++)
	   {
		   System.out.println("Soccer Team " + (i + 1) + ":\n\n" + 
				              SoccerLeague.get(i) + 
				              SoccerLeague.get(i).playerList());
	   }
	}//end main()
}//end class