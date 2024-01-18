/*
 * D. Carreira
 * Mon, may 30, 2022
 * File Reading Intro
 *     - We will read a file dynamically into an ArrayList<>
 *     -Program will read every line dynamically
 *     - Each line will be read as long as lines exist ( while loop)
 *     - Each ArrayList<> element will store one line from the file
 *     -Then we will print the contesnts of ArrayList<>
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class R_File_Reading_Intro 
{
	//exception handlers allows programs to continue running 
	//despite encoutering runtime errors
	//when an errors happens, the handler will "catch" the error
	//and "handle" it: will give you explicit info about the error
	//and continue to run to the best of it's ability
	public static void main(String[] args) throws IOException
	{
		// Variable Declarations & Initializations
		Scanner file = new Scanner(new File("info.txt"));
		//create ArrayList<> that will store the file data
		ArrayList<String> quotes = new ArrayList<>();
		//read the file as long as there are lines to read ie; file.hasNext() == true
		while(file.hasNext())
		{
			//add the next line from the file & store it in AL<>
			//using file.nextLine()
			//trim the line of any trailing spaces or unwanted hiddedn characters using trim()
			quotes.add(file.nextLine().trim());
		}//end loop
		printArray(quotes);
	}//end main()
	public static void printArray(ArrayList<String> array)
	{
		for(int i = 0; i < array.size(); i++)
		{
			System.out.println(array.get(i));
		}//end loop
	}//end printArray()
}//end class