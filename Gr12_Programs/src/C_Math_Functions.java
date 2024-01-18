/*
 * D. Carreira
 * Tues, Feb 8, 2022
 * Inputs & Math Methods
 * 2 Types of Inputs: 1. Scanner (not as user friendly but efficient
 * 					  2. JOptionPane GUI & Felxible 
 */
import javax.swing.JOptionPane;
import java.util.Scanner; //will be given in a test
//swing library: gamers, rich forms; inout reports; animatuion; drawubgs ex chess board
public class C_Math_Functions 
{
	public static void main(String[] args) 
	{
		//Variable Declarations & Initializations
		//Declare a Scanner Object -- RECALL: Objects are created with the use of "new" keyword
		//                             "new" indicates INSTATIATION OF AN OBJECT
		//		CLASS FILE: Template for an object (definition file)
		@SuppressWarnings("unused")
		int age = 0, num = 0; //primitive come before object declarations
		String selectionInput;
		double heightIn = 0;
		int tryAgain = JOptionPane.YES_OPTION;
		String name = "", firstName = "", lastName = "";
	
		Scanner myScanner = new Scanner(System.in); //Scanner object creation
		//Menu OPTIONF FOR JOptionPane()
		Object [] options = {"Option 1", "Option 2", "Option 3"};
		Object selectionObject;
		//When using scanner, indicate the input before 
		System.out.println("Please enter your name:");
		//THERE ARE ISSUES WITH SCANNER WHEN TRYING TO GET DIFF DATA TYPES INPUT
		//RECCOMENDATIONL DO NOT USE .nextInt(), next(), nextDouble() etc
		//ALWAYS USE: nextLine() and then cast the input to the appropriate type    (LINE 27 and 32)
		//CASTING: converting from one data type to another
		name = myScanner.nextLine();
		// age = myScanner.nexInt()
		System.out.println("Please enter your age:");
		age= Integer.parseInt(myScanner.nextLine());
		//height = myScanner.nextDouble()
		System.out.println("Please enter your height:");
		heightIn= Double.parseDouble(myScanner.nextLine());
		System.out.println("Your name is: " + name + " you are " + age + " years old. You are " + heightIn + " inches tall");
		myScanner.close(); //close the scanner
		
		//INPUT USING JOptionPane
		//****JOptionPane -- always assumes String input (like Scanner.nectLine()) Must cast
		firstName = JOptionPane.showInputDialog(null, "Please enter your first name", "NAME INPUT", JOptionPane.QUESTION_MESSAGE);
		lastName = JOptionPane.showInputDialog(null, "Please enter your last name", "NAME INPUT", JOptionPane.QUESTION_MESSAGE);
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age ", JOptionPane.QUESTION_MESSAGE));
		System.out.println("FirstName: " + firstName + "\nLast Name: " + lastName + " You are " + age + " years old");
		
		//TRY AGAIN LOOP
		do//always executes once
		{
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number ","NUM INPUT", JOptionPane.QUESTION_MESSAGE));
			tryAgain = JOptionPane.showConfirmDialog(null, "Enter another number.", "Try again?", JOptionPane.YES_NO_OPTION);
		}while(tryAgain == JOptionPane.YES_OPTION);
		//Menu options with JOptionPane()
		selectionObject = JOptionPane.showInputDialog(null, "Choose an option", "MENU", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		selectionInput = selectionObject.toString();
		System.out.println("The option you chose is " + selectionInput);
	}//end main()
}//end class()
