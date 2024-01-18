/*
 * D. Carreira
 * February 1, 2022
 * Unit 1: Activity 2: Question 1: UnicodeChars
 * This program will list the unicode values corresponding to the letters/numbers A-Z, a-z, and 0-9 
 * using loops which cast chars to integers.
 */
public class UnicodeChars 
{
	public static void main(String[] args) 
	{
		//Variable Declarations & Initializations
		System.out.println("The unicode values of numbers \"0\" through \"9\" are:");
		for(char letter='0'; letter<='9'; letter++)
		{
			System.out.print((int)letter + " ");
		}//end loop
		System.out.println("\n\nThe unicode values of letters \"A\" through \"Z\" are:");
		for(char letter='A'; letter<='Z'; letter++)
		{
			System.out.print((int)letter + " ");
		}//end loop
		System.out.println("\n\nThe unicode values of letters \"a\" through \"z\" are:");
		for(char letter='a'; letter<='z'; letter++)
		{
			System.out.print((int)letter + " ");
		}//end loop
	}//end main()
}//end class()