//D. Carreira
//February 3, 2022
//Sugar Tax - This program will tell the user if they are allowed to eat more sugar for the day.
import java.util.Scanner;
public class AddedSugar
{
    public static void main(String[] args)
    {
        //Variables
        int sugar = 0;
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        // Ask the user for the grams of sugar
        System.out.println("How many grams of sugar have you eaten today?");
        sugar = input.nextInt();
        // Use a boolean expression to print if they can eat more sugar
        boolean moreSugar = sugar<30;
        System.out.println("You can eat more sugar: " + moreSugar);
    }//end main()
}//end class()