/*
 * D. Carreira
 * March 7th, 2022
 * ArrayLists Quiz
 * This program will take score input for an array of teams using ArrayLists. Then will use a print method, lowest score method, sum of scores method, and a method that adds 30 points to each odd index
 */
//BONUS: METHOD THAT ADDS 30 POINTS TO EVERY ODD ELEMENT
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		String[] team = {"Brebotics", "Relatively Quantum", "Robodawgs", "WARP7", "NextGen"};
		ArrayList<Integer> score = new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < team.length; i++)
		{
			System.out.println("Please enter the score for team " + team[i] + ": ");
			score.add(Integer.parseInt(input.nextLine()));
		}//end loop
		printArrays(team, score);
		System.out.println("\n" + team[lowestScore(score)] + "the lowest score of: " + score.get(lowestScore(score)) + " points.");
		System.out.println("The sum of all scores is: " + sumScores(score));
		add30Odds(score);
		System.out.println("\n30 Points added to Odd indeces.");
		printArrays(team, score);
	}//end main()
	public static void printArrays(String[] team, ArrayList<Integer> score)
	{
		System.out.println("\nTeam\t\tScores");
		System.out.println("--------------------------");
		for(int i = 0; i < team.length; i++)
		{
			System.out.println(team[i] + "\t\t" + score.get(i));
		}//end loop
	}//end printArrays()
	public static int lowestScore(ArrayList<Integer> score)
	{
		int index = 0;
		int minimum = score.get(0);
		for(int i = 0; i < score.size(); i++)
		{
			if(score.get(i) < minimum)
			{
				minimum = score.get(i);
				index = i;
			}//end if
		}//end loop
		return index;
	}//end lowestScore()
	public static int sumScores(ArrayList<Integer> score)
	{
		int total = 0;
		for (int i = 0; i < score.size(); i++)
		{
			total += score.get(i);
		}//end loop
		return total;
	}//end sumScores()
	public static void add30Odds(ArrayList<Integer> score)
	{
		for (int i = 0; i < score.size(); i++)
		{
			if(i%2 != 0) 
			{
				score.set(i, (score.get(i) + 30));
			}//end if;
		}//end loop
	}//end add30Odds();
}//end class()