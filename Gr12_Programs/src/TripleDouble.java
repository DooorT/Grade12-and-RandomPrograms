//D. Carreira
//Feb 3, 2022
//This program will determine if a user got 10 or more points, assists, or rebounds
import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        int points = 0;
        int rebounds= 0;
        int assists = 0;
       System.out.println("How many points did you score?");
       points = input.nextInt();
       System.out.println("How many rebounds did you get?");
       rebounds = input.nextInt();
       System.out.println("How many assists did you have?");
       assists = input.nextInt();
        boolean tenPoints = points>=10;
        boolean tenRebounds = rebounds>=10;
        boolean tenAssists = assists>=10;
        System.out.println("You got 10 or more points: " + tenPoints);
        System.out.println("You got 10 or more rebounds: " + tenRebounds);
        System.out.println("You got 10 or more assists: " + tenAssists);
    }//end main()
}//end class()