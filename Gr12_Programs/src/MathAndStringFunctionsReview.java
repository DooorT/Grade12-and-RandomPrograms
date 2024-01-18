/*
 * D. Carrreira
 * February 2, 2022
 * Math and String functions
 * 1. Data types -- Ranges
 * 2. Input and Output
 * 3. Math functions
 * 4. String Functions
 */
public class MathAndStringFunctionsReview 
{
	public static void main(String[] args) 
	{
		int indexOfSpace = 0;
		//Variable Declarations & Initializations
		//int num = 0;
		//strings are objects; primitive Data Types are int, long, char, boolean, double
		//ALL OBJECTS ARE NAMED STARTING WITH A CAPITAL LETTER -- ALWAYS
		//When we declare an object, what we actually stored in the variablke is the ADRESS/REFERENCE
		//When we declare a pdt -- what is actially stored is the VALUE
		//NOTION OF : Reference VS Value
		String str1 = "Radar";
		String str2 = ""; // can also use null. BUT cannot add letters or words to null
		String fullName = "Java Cocks";
		@SuppressWarnings("unused")
		String firstName = "", lastName="";
		/*
		 * 1. Data types
		 * int --> 32 bits --> _ _  0 0; 0 1; 1 0; 1 1 --> 4 possibilities for 2 bits
		 *                     _ _ _ 0 0 0; 0 0 1; 0 1 1; 1 1 1; 1 1 0; 1 0 0; 1 0 1;  --> 8 possibilites
		 *                              1 Bit = 2^1poss      2 Bits = 2^2 poss       3 bits = 2^3 poss 
		 *                              2^x bits      x= number of bits
		 * Therefore how big can an int be? it's not 2^32 because we have negative and positive integers: 
		 * we need one bit to determine the sign. So the largest number of an int is 2^31 
		 * 
		 *                     2^32 divided by 2 is the min value (negative)
		 *                     
		 *                     The range is actually -2147483648 to 2147483647   <--- 7 is one less to denote the sign
		 *  -(2^32)/2 to (2^32)/2 -1
		 */
		System.out.println("The minimum value for an int: " + Integer.MIN_VALUE);
		System.out.println("The maximum value for an int: " + Integer.MAX_VALUE);
		
		//DOUBLES: 64-BIT PRECISION:   DECIMAL:  OPERAND.SIGNIFICAND
		/*
		 * Eleven bits are used for the exponent that is stored as base 2
		 * The remaining 52 bits are used to store the significand, which is the number that is raised to the power indicated by the exponent
		 */
		System.out.println("\nThe minimum value for a double: " + Double.MIN_VALUE);
		System.out.println("The maximum value for a double: " + Double.MAX_VALUE);
		
		/*
		 * A long is a 64-Bit integer. For very long integers.
		 * Like integers, the maximum value has one less on the last digit, because of the bit assigned to the sign.
		 * uint.MAX_VALUE = 9223372036854775807
		 * uint.MIN_VALUE = -9223372036854775808
		 */
		System.out.println("\nThe minimum value for a long: " + Long.MIN_VALUE);
		System.out.println("The maximum value for a long: " + Long.MAX_VALUE);
		
		//What is 2^49. Will yield the max positive value for an int: BE CAREFUL CUH!
		System.out.println("\nWhat is the value of 2^49? " + (int)Math.pow(2,49) ); //returns max value 2^31
		
		
		/*STRING FUNCTIONS - Strings are objects that have Behaviour Methods:
		 *  
		 *  .substring(x)  -- overloaded method: 2 versions with different parameters
		 *                   overloaded method: Methods with the same name but different parameter list
		 *  .substring(x,y)
		 *  .equals()  WE CANNOT USE == on objects   //using == will compare the address, not the string
		 *  .toLowerCase()
		 *  .equalsIgnoreCase()
		 *  .toUpperCase()
		 *  .compareTo() -- compares the ASCII value of strings -- how we order & sort Strings.
		 *  .replace()
		 *  .indexOf("xyz")
		 * .length()
		 * .charAt(index)
		 * .split()  <== Will split a String based on a seperator (space) & and put seperate words into an array
		 * 
		 */
		 System.out.println("The length of the string \"Iluv Rats!\" is: " + str1.length());  // IT COUNTS SPACES
		 //ITERATE through all letters
		 // Letters start index from 0, which is why .length needs to be -1, otherwise out of bounds.
		 for(int i= 0; i<str1.length();i++)
		 {
			 System.out.println(str1.charAt(i));
		 }//end loop
		//ITERATE through all letters backwards
		 for(int i= str1.length()-1; i>=0;i--)
		 {
			 System.out.println(str1.charAt(i));
			 str2 += str1.charAt(i);
		 }//end loop
		 System.out.println(str2);
		 //to.UpperCase
		 System.out.println(str2.toLowerCase().equals(str1.toLowerCase()));
		 System.out.println(str2.equalsIgnoreCase(str1));
		 System.out.println("What is the index of the letter A?" + str1.indexOf(" a"));
		 
		 //^^^^^^^^^^ TO COMPARE STRINGS WE CANNOT SAY IS STR1 == STR2 <===== NOOOO SO BAD NOT GOOD MAN!
		 //TO COMPARE STRINGS: str1.equals(str2);
		 
		 //CONDENSED IF STATEMENT: if(bollean comparison)?do this if true:do this if false
		 System.out.println(str1.equals(str2)?"Yes, they are equal":"No they are not equal");
		 
		 indexOfSpace = fullName.indexOf(" ");
		 System.out.println("The space is locatied at index: " + indexOfSpace);
		 
		 //To print the last name use .substring(x): Will return the string starting from index x
		 lastName = fullName.substring(indexOfSpace+1);
		 System.out.println(lastName);
		 
		 //.substring(x,y) <== x is INCLUSIVE but the y is NON INCLUSIVE: returns string starting at x, ending at y-1
	}//end main()
}//end class()
