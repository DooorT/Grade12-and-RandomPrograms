/*
 * D. Carreira
 * Feb 24, 2022
 * Enhance For Lopps: Shortcut to the for loop ie. shorter syntax
 * Advantages and Disadvantages
 */
import java.util.Scanner;
public class H_Enhanced_For_Loops 
{
	public static void main(String[] args) 
	{
		// Variable Declarations and Initializations
		int[] hoursWorked = new int[3];
		String[] weekDays = {"Mon", "Tues", "Wed"};
		Scanner scan = new Scanner(System.in);
		//To test program, hard-code values before assigning dynamically with loop
		for (int i = 0; i< weekDays.length; i++)
		{
			System.out.println("Please enter the hours worked on " + weekDays[i] + ": ");
			hoursWorked[i] = Integer.parseInt(scan.nextLine());
		}//end loop
		printArray(hoursWorked, weekDays);
		System.out.println("\n\nUsing enhanced for loop: \n" );
		printArray2(hoursWorked);
		scan.close();
	}//end main()
	public static void printArray(int[] intArray, String[] weekArray) //arrays are objects .: passed by reference; do not need to return them back.
	{
		System.out.println("Week Day \t Hours");
		for(int i = 0; i < weekArray.length; i++)
		{
			System.out.println(weekArray[i] + "\t\t" + intArray[i]);
		}//end loop
	}
	public static void printArray2(int[] intArray) //arrays are objects .: passed by reference; do not need to return them back.
	{
		/**USING ENHANCED FOR LOOP**/
		/*
		 * intArray[o] adress is at 100
		 * 
		 * INDEX: 	intArray[0]			intArray[1]			intArray[2]
		 * VALUES:      5                   7                   8
		 * ADDRESS:    100                 132                 164            (32 bits)
		 */
		      //Tells the starting value, and type. The loop uses that to jump the right amount of bits to reach each value.
		for(int value : intArray)   //NO COUNTER
		{
			System.out.println(value+5);  // Value IS JUST A COPY OF THE VALUE AT AN INDEX, NOT THE ACTUAL LOCATION like array[i]
		}//end loop
		/** DISADVANTAGES **/
		//Cannot change values inside the array
		//Cannot iterate through a sub-portion of the array, iterate through every array element
		
		/** ADVANTAGES **/
		//Simple syntax
		//BIGGEST ADVANTAGE = AVOIDS OutOfBound errors
		
	}//printArray2()
}//end class()
