/*
 * D. Carreira
 * April 6th 2022
 * Battle of the Superheros <== corny
 * REQUIREMENTS
 * 1. Create 2 heroes
 * 2. Superhero Interaction: 
 * 
 *    CASE 1 :if super1 strength is 1 or more greater:
 *                                  -add 1 strength to him
 *                                  -decrease 1 strength from the opponent
 *                                  -declare the winner
 *                                  -chicken dinner
 *   CASE 2: if super 1 is 3 or more greater:
 *   								-add 2 strength to him
 *   								-decrease 2 from the other
 *   								-declare ze winner
 *   
 *   CREATE A CLIENT METHOD CALLED superHeroBattle() THAT TAKES AS ARGUMENTS
 *   2 Superhero OBJECTS. THEY WILL ENGAGE IN THE BATTLE THAT WILL RESULT IN
 *   DOZENS OF CIVILLIAN DEATHS, AND THE CASES DESCRIBED ABOVE. 
 *   RETURN THE VICTORIOUS HERO AS A STRING.
 */
public class SuperPowers_Client 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		Superhero Spiderman = new Superhero("Spiderman", "Cum Webs", 4);
		Superhero Superman = new Superhero("Superman", "Anal Prolapse", 7);
		//Print Them CUH
		System.out.println("Super Hero 1: \n" + Spiderman);
		System.out.println("Super Hero 2: \n" + Superman);
		//Superhero Battle:
		
		System.out.println("The winner is: " + superHeroBattle(Spiderman, Superman) + "\n");
		System.out.println(Spiderman);
		System.out.println(Superman);
	}//end main()
	public static String superHeroBattle(Superhero hero1, Superhero hero2)
	{
		int diff = 0;
		String winner = "";
		diff = hero1.getPowerStrength() - hero2.getPowerStrength();
		if(diff>0)
		{
			winner = hero1.getName();
			if(diff>=3)
			{
				hero1.add2Strength();
				hero2.reduce2Strength();
			}
			else
			{
				hero1.add1Strength();
				hero2.reduce1Strength();
			}//end if
		}
		else if(diff<0)
		{
			winner = hero2.getName();
			if(diff<=-3)
			{
				hero2.add2Strength();
				hero1.reduce2Strength();
			}
			else
			{
				hero2.add1Strength();
				hero1.reduce1Strength();
			}//end if
		}
		else
		{
			winner = "No Winner";
		}///end if
		return winner;
	}//end superheroBattle()
}//end class