/*
 * D. Carreira
 * February 3, 2022
 * Unit 1: Activity 2: Question 4: Palindrome2
 * This program will use String functions and loops to determine the number of palindromes within a sentence.
 */
import javax.swing.JOptionPane;
public class Palindrome2
{
	public static void main(String[] args)
	{
		//Variable Declarations & Initializations
		int count = 0;
		String sentence = "";
		String backWord = "";
		String word= "";
		String palindromes = "";
		sentence = JOptionPane.showInputDialog("Words that are the same forwards and backwards are called palindromes.\nThis program determines the number of palindromes in a sentence.\n\nEnter a sentence (do not include punctuation)");
		String[] wordsArray = sentence.split(" ");
		for(int i = 0; i<wordsArray.length; i++)
		{
			backWord="";
			word=wordsArray[i];
			for(int d = word.length()-1; d>=0; d--)
			{
				backWord += word.charAt(d);
			}//end loop
			if ((backWord.toUpperCase()).equals(word.toUpperCase()))
			{
				palindromes += (word+ "\n");
				count++;
			}
			else
			{
				
			}//end if
		}//end loop
		System.out.println("There are " + count + " palindromes in the sentence.\n\nThe palindromes are:");
		System.out.println(palindromes);
	}//end main()
}//end class()