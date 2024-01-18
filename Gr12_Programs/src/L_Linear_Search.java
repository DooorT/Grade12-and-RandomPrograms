/*
 * D. Carreira
 * April 12, 2022
 * Linear Search
 * Purpose: To find a *KEY* within a unsorted list.
 * (Binary search relies on a SORTED list)
 * BIG O: n  <== WORST CASE SEARCH TIME == n checks for n items.
 * LINEAR SEARCH: there is no preconition on the order of the list
 *       -check each element until we find the key
 *       
 */
public class L_Linear_Search 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		int index = 0;
				int key = 24;
		int[] unsIntArr = {65, 77, 12, 34, 98, 22, 1, 67, 30, 24};
		System.out.println("Search for value " + key + ": ");
		printArray(unsIntArr);
		index = linearSearch(unsIntArr, key);
		if(index == -1)
		{
			System.out.println("The value " + key + " was not found.");
		}
		else
		{
			System.out.println("\nThe value " + key + " is at position " + (linearSearch(unsIntArr, key) + 1));
		}//end if
	}//end main()
	//LINEAR SEARCH -- will return the index of the key if found, otherwise -1
	public static int linearSearch(int[] numbers, int key)
	{
		int index = -1;
		for(int i = 0; i<numbers.length; i++)
		{
			if(numbers[i] == key)
			{
				return i;
			}//end if
		}//end loop
		return index;
	}//end linearSearch()
	public static void printArray(int[] numbers)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}//end loop
	}//end printArray()
}//end class