/*
 * D. Carreira
 * February 2, 2022
 * Unit 1: Activity 2: Question 3: Palindrome
 * This program will use String functions and loops to determine if an input is a Palindrome.
 */

//make a loop that turns the whole sentence backwards, then make a new sentence with only the equal values. Then split the words somehow
import javax.swing.JOptionPane;
public class Palindrome2_First 
{
	public static void main(String[] args)
	{
		//Variable Declarations & Initializations
		@SuppressWarnings("unused")
		int count = 0;
		String sentence = "";
		String backWord = "";
		String word= "";
		sentence = JOptionPane.showInputDialog("Please enter a sentence");
		String[] wordsArray = sentence.split(" ");
		for(int i = 0; i<=wordsArray.length; i++)
		{
			backWord="";
			word=wordsArray[i];
			for(int d = word.length()-1; d>=0; d--)
			{
				backWord += word.charAt(d);
			}
			if ((backWord.toUpperCase()).equals(word.toUpperCase()))
			{
				System.out.println(word + " in reverse is " + backWord + ".\nIt IS a palindrome.");
				count++;
			}
			else
			{
				System.out.println(word + " in reverse is " + backWord + ".\nIt is NOT a palindrome.");
			}//end if
		}//end loop
	}//end main()
}//end class()