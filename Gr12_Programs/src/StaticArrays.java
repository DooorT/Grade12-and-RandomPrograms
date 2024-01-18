/*
 * D. Carreira
 * Static Arrays with Methods Quiz
 * Feb 25, 2022
 */
import java.util.Scanner;
public class StaticArrays 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		String[] teacher = {"Mr. Codeit", "Ms. Javascript", "Mrs. ILuvJava", "Mr. Runthis", "Ms. Compileit"};
		int[] commuteTime = new int[5];
		Scanner input = new Scanner (System.in);
		for(int i = 0; i < teacher.length; i++)
		{
			System.out.println("Please enter " + teacher[i] + "'s commute time: ");
			commuteTime[i] = Integer.parseInt(input.nextLine());
		}//end loop
		printArrays(teacher, commuteTime);
		System.out.println("\n" + teacher[highestCommute(commuteTime)] + " has the highest commute time of " + commuteTime[highestCommute(commuteTime)] + " minutes.");
		System.out.println("The average commute time is " + avgCommute(commuteTime) + " minutes.");
		input.close();
	}//end main()
	public static void printArrays(String[] teachers, int[] commuteTime)
	{
		System.out.println("Teacher\t\tCommute Time (min)");
		System.out.println("-----------------------------------");
		for(int i = 0; i < teachers.length; i++)
		{
			System.out.println(teachers[i] + "\t\t" + commuteTime[i]);
		}//end loop
	}//end printArrays()
	public static int highestCommute(int[]commuteTime)
	{
		int index = 0;
		for (int i = 0; i < commuteTime.length;i++)
		{
			if(commuteTime[i] > commuteTime[index])
			{
				index = i;
			}//end if
		}//end loop
		return index;
	}//end highestCommute
	public static double avgCommute(int[] commuteTime)
	{
		double total = 0;
		for (int i = 0; i < commuteTime.length;i++)
		{
			total += commuteTime[i];
		}//end loop
		return (total/commuteTime.length);
	}//end avgCommute()
}//end class()
