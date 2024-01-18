/*
 * D. Carreira
 * February 2, 2022
 * Unit 1: Activity 2: Question 3: Palindrome
 * This program will use String functions and loops to determine if an input is a Palindrome.
 */
import javax.swing.JOptionPane;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		//Variable Declarations & Initializations
		String word = "";
		String backWord = "";
		word = JOptionPane.showInputDialog("Words that are the same forwards and backwards are called palindromes.\nThis program determines if a word is a palindrome.\n\nEnter a word:");
		for (int i = word.length()-1; i>=0; i--)
		{
			backWord += (word.charAt(i));
		}//end loop
		if ((backWord.toUpperCase()).equals(word.toUpperCase()))
		{
			System.out.println(word + " in reverse is " + backWord + ".\nIt IS a palindrome.");
		}
		else
		{
			System.out.println(word + " in reverse is " + backWord + ".\nIt is NOT a palindrome.");
		}//end if
	}//end main()
}//end class()