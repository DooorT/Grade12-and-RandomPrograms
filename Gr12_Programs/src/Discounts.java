/*
 * D.Carreira
 * Feb 3, 2022
 * This program will determine the cost of parking, up to $20.
 */
import java.util.Scanner;
public class Discounts
{
    public static void main(String[] args)
    {
        int hours = 0;
        double cost = 0;
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.println("How many hours have you been parked?");
        hours = input.nextInt();
        cost = 3.50*hours;
        if(cost>20)
        {
            cost = 20;
            System.out.println("You owe $" + cost);
        }
        else
        {
            System.out.println("You owe $" + cost);
        }//end if
    }//end main()
}//end class()