/*
 * D. Carreira
 * February 9, 2022
 * Strings2 Example CodingBat:
 * Math Functions
 */
import java.util.Scanner;
public class D_StringsandMath_Funtions 
{
	public static void main(String[] args) 
	{
		//Variable Declarations and Initializations
		/*
		 * HUGE, HUGE, BIG, GARGANTUAN idea in computer science: Iteration
		 *                        - loop thru array
		 *                        - loop through string characters
		 */

		//Let's count # x, y, z, in a string   - case insensitive
		//Loop through a string, look at each character, and count
		/**
		 * NEVER, EVER DECLARE A VARIABLE IN A LOOP
		 */
		int count = 0, number = 0;
		int countHi = 0;
		String sentence = "";
		String sentenceHi = "";
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter a word or sentence");
		//sentence = myScanner.nextLine();
		for(int i = 0; i<sentence.length() ; i++)
		{
			if (sentence.toLowerCase().charAt(i) == 'x' ||
					sentence.toLowerCase().charAt(i) == 'y' || 
					sentence.toLowerCase().charAt(i) == 'z')
			{
				count++;
			}//end if
		}//end loop
		System.out.println("\nYou entered: " + sentence);
		System.out.println("You have this many x,y,z's in the string: " + count);

		//Search within a String for another String example CodingBat: Strings2
		//Return the number of times that "hi" appears in a String
		//TESTCASES: with Sample Output
		//countHi("abc hi ho") --> 1
		//countHi("ABC HI HO") -->1
		sentenceHi = "abc Hi ho";
		//whenever looping through Strings/Arrays you must be careful of OOE's: OUT OF BOUND EXCEPTION ERRORS

		for (int i =0; i<sentenceHi.length()-1; i++)  //looking for 2 letter word, so length()-1 to not go out of bounds
		{
			if(sentenceHi.toLowerCase().substring(i,i+2).equals("hi"))
			{
				countHi++;
			}//end if
		}//end loop
		System.out.println("\n\n(\"" + sentenceHi + "\") --> " + countHi);
		myScanner.close();

		/** MATH FUNCTIONS note: function = subroutine = method
		 * Math operations: *, /, +, -, %
		 * 
		 */
		System.out.println("Modulus: 2%2 is: " + 2%2);
		System.out.println("Modulus: 4%2 is: " + 4%2);
		System.out.println("Modulus: 6%2 is: " + 6%2);
		System.out.println("Modulus: 3%2 is: " + 3%2);
		System.out.println("Modulus: 5%2 is: " + 5%2);
		System.out.println("Modulus: 7%2 is: " + 7%2);
		System.out.println("\nAddition: 2+2 is: " + 2+2);
		System.out.println("Addition: (2+2) is: " + (2+2));  //brackets enforce BEDMAS to do addition forst. `-`

		//How to check for an even number
		number = 7;
		if(number%2 == 0)
		{
			System.out.println("\nThe number " + number + " is an even number");
		}
		else
		{
			System.out.println("\nThe number " + number + " ain't an even number");
		}//end if

		/*
		 * MATH CLASS
		 * .abs ()
		 * .pow (x,y)
		 * .sqrt(x)
		 * .random()    <--- MOST IMPORTANT
		 * .ceil
		 * .floor
		 * .round
		 */
		//abs()  -- always returns the absolute value of the number
		System.out.println("The absolute value of -10 is: " + Math.abs(-10));
		System.out.println("The absolute value of 10 is: " + Math.abs(10));
		System.out.println("The absolute value of -10.5 is: " + Math.abs(-10.5));

		//pow (x,y) --> x^y
		System.out.println("pow(3,3): " + Math.pow(3,3)); //returns a double, cast as int
		System.out.println("pow(3,3) casted as int: " + (int)Math.pow(3,3));

		//sqrt(x)  -- takes the root of x
		System.out.println("sqrt(81): " + Math.sqrt(81)); //returns a double
		System.out.println("sqrt(81) cast as int: " + (int)Math.sqrt(81));

		//random()  --> default returns a number between 0 and 1, not including 1.
		for(int i = 0; i<3; i++)
		{
			System.out.println("Default Math.random(): " + Math.random());
		}//end loop
		//Casting Math.randoom as an int will always result in a 0, --> truncation
		System.out.println("Cast Math.random as an int (truncates): " + (int)Math.random());

		System.out.println("Math.Random for other numbers (0,9)  (*10): " + (int)(Math.random()*10));
		System.out.println("Math.Random for other numbers (1,10) (*10+ 1): " + (int)(Math.random()*10+1));
		
		//Numbers between 5 and 10
		System.out.println("Math.random for (5,10) formula in code " + (int)(Math.random()*(5+1)+5));
		
		/**
		 * GENERAL FORMULA FOR A RANGE
		 * (int)(Math.random() * (range/difference + 1) + start)
		 */
		
		//Math.ceil(value) --> Nearest integer >= value
		System.out.println("Ceiling of 10.2: " + Math.ceil(10.2)); //RETURNS DOUBLE
		System.out.println("Ceiling of 10: " + Math.ceil(10)); //RETURNS DOUBLE
		
		//Math.floor(value) -- Nearest integer <= value
		System.out.println("Floor of 10.2: " + Math.floor(10.2)); //RETURNS DOUBLE
		System.out.println("Floor of 10.9: " + Math.floor(10.9)); //RETURNS DOUBLE
		
		//Math.round(value) ---> rounds up or down depending on the decimal. If decimal >= 5, round up, else round down
		System.out.println("Round of 10.5 " + Math.round(10.5)); //RETURNS Int
		System.out.println("Round of 10.4 " + Math.round(10.4)); //RETURNS Int
		System.out.println("Round of 10.6 " + Math.round(10.6)); //RETURNS Int

	}//end main()
}//end class()
