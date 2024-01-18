/*
 * D. Carreira
 * March 24th, 2022
 * Quiz 5 Modules & Classes Program
 * This program will use the methods in a Date object class in order to print 
 * a numerical date, and a String month. It will also use the get and set methods to change the date.
 */
public class DateClient 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		Date newYear = new Date();
		Date today = new Date(3,24,2022);
		System.out.println("Printing Date 1 that used Default Constructor:\n" + "The Date is: " +newYear);
		System.out.println("Printing Date 2 that used Regular Constructor:\n" + "Today's date is: " + today);
		System.out.println("Update today's date to tomorrow's date using SET methods.\n");
		today.setDay(25);
		System.out.println("Print the newly updated date using GET methods\nTomorrow's Date is: " +
							today.getMonth() + "/" + today.getDay() + "/" + today.getYear());
		System.out.println("\nThe month of the year is: " + today.month());
		System.out.println("\nPrinting the Date Object:\nThe date is now: " + today);
	}//end main()
}//end class