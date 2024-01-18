/*
 * METHODS - SUBROUTINE - FUNTION: Performs a specific task; the code doesn't necessarily need to resude in the same class ex. System.out.println
 *  Syntax: meaningful_mthod_name(parameter_list) <--- parameter list may be empty
 *   - parameter list can entail objects or PDTs
 *   -can either return a value or not 
 *   			- PDT: passed by value - only a copy of the actual variable is passed - actual source value cannot be changed
 *   			- OBJECTS: passed by reference - this means the contents can be manipulated by a method
 *  
 *  -C Language: Any variable can be changed to a POINTER (reference type): ex int age; can pass reference *age
 *  
 *  Static Array Review
 *                -Array stores multiple items of the same type ex. List of names, grades, etc
 *   ****ARRAYS ARE OBJECTS****** : the name of the array is an alias to it's reference/address
 *   STSTIC ARRAY is arry_name[5]  <== number of elements is predetermined  -faster
 * ArrayLists<> are DYNAMIC ARRAYS <== size is not predetermined.   -slower retrieval, scattered across memory
 *   BIG IDEAS OF METHODS/SUBROUTINES/FUNCTION: REUSIBILITY; READIBILITY; MODULARITY
 *   
 *   MODULARITY: we have methods as building blocks to the overall code
 */
import java.util.Scanner;
public class Methods_Review
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		int numStudents = 5;
		String classCode = "ICS4U";
		//Create an Array of names and grades
		Scanner myScanner = new Scanner(System.in);
		//Literal Declaration- used for lists that don't change
		// Ex. Weekdays, months, years; teams; countries; provinces
		String[] names = {"Mary", "Saveeta", "Edward", "Wojtek", "Jano"};
		//"grades" is the address where the actual grades are located, java finds 5*32 bit memory space to store the Array
		//IF YOU KNOW HOW MANY ELEMENTS YOU NEED, THEN USE A STATIC ARRAY!! array lists have slower retrieval, memory is scattered
		int[] grades = new int[5];
		//Populate grades using an input loop
		for(int i =0; i<names.length; i++)
		{
			System.out.println("Enter the grade for " + names[i] + ": ");
			grades[i] = Integer.parseInt(myScanner.nextLine());
		}//end loop
		//Call printArrays() to print the arrays
		//printArrays has two PARAMETERS specified, the call must include 2 ARGUMENTS
		//ARGUMENTS MUST BE PLACED IN SAME ORDER AS PARAMETER LIST:
		//Parameters are demands, arguments are what you pass in a method call
		printArrays(names, grades);  //  <=== method is called; program execution pauses until method is complete
		System.out.println("\n\nUpdate the Grades for " + classCode);
		//Add 10 marks using method
		/**add10Marks(names, grades);**/
		printArrays(names, grades);
		//change the course code  --> will not change the course code. Strings immutable
		//change numStudents --> will not change int either.
		//But add10Marks was able to change values
		//METHODS CANNOT CHANGE PRIMITIVE DATA TYES BECAUSE THEY ARE PASSED BY VALUE
		/** VARIABLES PASSED BY VALUE ARE ONLY SENT A ***COPY*** OF THE VALUE TO THE METHOD
		/**OBJECTS EX ARRAYS ARE PASSED BY REFERENCE -- THEREFORE METHODS CAN UPDATE OBJECTS***/
		changeCourseCode(classCode, numStudents);
		System.out.println("\nPrint the average of class " + classCode + " for the " + numStudents + " students is: ");
		System.out.println("The class average is: " + avgGrade(grades) + "%");
		System.out.println("\nThe highest mark is: " + grades[highestNum(grades)] + "%");
		System.out.println("The lowest mark is: " + grades[lowestNum(grades)] + "%");
		myScanner.close();
	}//end main()


	/**** ALL STATIC METHODS MUST BE DECLARED OUTSIDE OF MAIN  ****/
	/*
	 * Two kinds of methods
	 * 			Void: does not return a value
	 * 			Non-void: Returns a value
	 * Print methods are usually void
	 */
	//THIRD ELEMENT IN MRTHOD SIGNATURE : return value (void, double, int, string)
	//METHODS LIVE IN THEIR OWN HOUSE, CANNOT SEE ANYTHING IN MAIN (DIFFERENT SCOPE)
	public static void printArrays(String[] names, int[] grades)
	{
		//Print a table - we need some escape characters
		//ESCAPE -- we have to escape characters that are otherwise key symbols in Java
		// tab: \t      paragraph: \n      quotes: \"      backslash: \\     start of line: \r     quote: \'    backspace: \b
		System.out.println("NAME \t\t GRADE");
		System.out.println("-------------------------");
		for (int i= 0; i<names.length; i++)
		{
			System.out.println(names[i] + "\t\t" + grades[i] + "%");
		}//end loop	
	}//end printArrays()
	//CREATE A METHOD TO ADD 10 MARKS TO EVERYONE'S GRADE:
	public static Double avgGrade(int[] grades) 
	{
		int total = 0;
		for (int i= 0; i<grades.length; i++) // = COUNTER
		{
			total+= grades[i]; //total = ACCUMULATOR
		}

		return ((double)total/grades.length);
	}
	public static void add10Marks(String[] names, int[] grades)
	{
		for(int i = 0; i <grades.length;i++)
		{
			grades[i] += 10;
		}//end loop
	}//end add10Marks()
	public static void changeCourseCode(String classCode, int numStudents)
	{
		classCode = "ICS3U";
		numStudents = 10;
	}//end changeCourseCode()
	public static int highestNum(int[] values)
	{
		int highest = 0;   //asssume 1st element is highest off the bat; element 0
		for(int i = 1; i<values.length;i++)
		{
			if(values[i]>values[highest])
			{
				highest = i;//store the LOCATION NOT VALUE of the highest
			}//end if
		}//end loop
		return highest;
	}//end highestNum()
	public static int lowestNum(int[] values)
	{
		int lowest = 0;
		for(int i =0; i < values.length; i++)
		{
			if(values[i]<values[lowest])
			{
				lowest = i;
			}//end if
		}//end loop
		return lowest;
	}//end lowestNum()
}//end class()