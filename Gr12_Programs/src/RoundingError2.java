/*
 * D. Carreira
 * January 31, 2022
 * Unit 1: Assignment 1: Question 3: RoundingError
 * This program will determine the rounding error when the square root of an input is squared.
 */
import javax.swing.JOptionPane;
public class RoundingError2 
{
	public static void main(String[] args) 
	{
		//Variable Declarations & Initializations
		double input = 0;
		input = Double.parseDouble(JOptionPane.showInputDialog("Please enter a number"));
		System.out.println("You entered the number " + input + "\n");
		System.out.println("The square of the square root = " +  Math.sqrt(input)* Math.sqrt(input));
		System.out.println("The round off error = " + (input-(Math.pow(Math.sqrt(input), 2))));
	}//end main()
}//end class()
