/*
 * D. Carreira
 * April 13th, 2022
 * Recursion Quiz
 * This program has 3 recursive methods. countHi will count the number of times
 * that "hi" occurs in a string. count7 will count the number of times a 7 occurs in
 * an int, and count double if a 77 occurs. numDigits will count the number of digits in 
 * an int, counting every 3 as triple.
 */
public class Recursion_Quiz 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		System.out.println("\nProblem 1: ");
		System.out.println("countHi(\"xxhixx\") -> " + countHi("xxhixx"));
		System.out.println("countHi(\"xhixhix\") -> " + countHi("xhixhix"));
		System.out.println("countHi(\"hi\") -> " + countHi("hi"));
		System.out.println("\nProblem 2: ");
		System.out.println("count7(7) -> " + count7(7));
		System.out.println("count7(717) -> " + count7(717));
		System.out.println("count7(7717) -> " + count7(7717));
		System.out.println("count7(77777777) -> " + count7(77777777));
		System.out.println("\nProblem 3: ");
		System.out.println("numDigits(136) -> " + numDigits(136));
		System.out.println("numDigits(49) -> " + numDigits(49));
		System.out.println("numDigits(13) -> " + numDigits(13));
	}//end main()
	public static int countHi(String str)
	{
		if(str.length()<2)
		{
			return 0;
		}
		else
		{
			if(str.substring(0,2).equals("hi"))
			{
				return 1 + countHi(str.substring(1));
			}
			else
			{
				return 0 + countHi(str.substring(1));
			}//end if
		}//end if
	}//end countHi()
	public static int count7(int number)
	{
		if(number<7)
		{
			return 0;
		}
		else
		{
			if(number%100 == 77)
			{
				return 2 + count7(number/10);
			}
			else if(number%10 == 7)
			{
				return 1 + count7(number/10);
			}
			else
			{
				return 0 + count7(number/10);
			}//end if
		}//end if
	}//end count7()
	public static int numDigits(int num)
	{
		if(num < 10)
		{
			return 1;
		}
		else
		{
			if(num%10 == 3)
			{
				return 3 + numDigits(num/10);
			}
			else
			{
				return 1 + numDigits(num/10);
			}//end if
		}//end if
	}//end numDigits()
}//end class