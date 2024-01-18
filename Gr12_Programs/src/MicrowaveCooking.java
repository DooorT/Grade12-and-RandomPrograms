/*
 * D.Carreira
 * Feb 3, 2022
 * This program will assign a random number up to 60, and determine if the microwave will burn the food in that time.
 */
import java.lang.Math; 
public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       int seconds = (int)(Math.random()*61);
       System.out.println("Microwaving for " + seconds + " seconds");
       if(seconds<=20)
       {
           System.out.println("Perfect cooking time!");
       }
       else
       {
           System.out.println("Your roll will catch fire!");
       }//end if
    }//end main()
}//end class()
