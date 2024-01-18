/*
 * D. Carreira
 * February 1, 2022
 * Java Review Lesson
 * This is a java review lesson.
 */
public class JavaReviewLesson 
{
	public static void main(String[] args) 
	{
		//Variable Declarations & Initializations
		//Data types int(32), double(64), String, boolean(1), char, long
		//char is also an int --> interchangeable
		//char's integer value represents a characters unicode value
		char letter = 97;
		int numLetter = 97;
		System.out.println("The letter is " + letter); // + ==> concatenator/operation: Concatenation
		System.out.println("The letter is " + numLetter); //Literal string + int ???  --> Implicit Casting - changes number into a String and adds it
														  //Implicit casting converts a number to a string for concatenation
		System.out.println("The letter is " + (char)(numLetter)); //can cast an int as a char
		
		for(int i=97;                 i<=101;                i++)// i++ is i= i+1 or i+=1. i+= will run through even numbers
		//initialized counter,   a loop condition,   and loop condition
		//PYTHON- for i in range 5:    //PYTHON- for i in range(0,5,1):
		{
			System.out.print((char)i+" "); //TRACE: i=i
		}//end loop     //TRACE: i=i+2  //The last value of i will be 12, and it will not re-iterate the loop
		System.out.println("\n");
		for(letter = 'a'; letter <=101; letter++ );
		{
			System.out.println(letter + " ");
		}//end loop
	}//end main()
}//end class()