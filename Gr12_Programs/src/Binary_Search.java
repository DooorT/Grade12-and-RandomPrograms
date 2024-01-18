import java.util.Arrays;

/*
 * D. Carreira
 * April 14th, 19th, 2022
 * BINARY SEARCH: akin to high low guess a number game
 *     precondition: list must be SORTED
 *     - Progressively half the list and continue searching on the appropriate side
 *     - algorithm end when      1. key is found (ie. key == mid)   2. Exhausted the list
 *     -repeatedlt remove one half of the list after checking whether the middle value = key
 *     -remove the half that is either too low or too high
 *     -continue searching on the remaining set (half)
 *     -RECURVISE algorithm is most commonly used
 */
@SuppressWarnings("unused")
public class Binary_Search 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		int key = 24;
		int position = 0;
		int[] intUnsArray = {1, 12, 22, 24, 30, 34, 65, 67, 77, 98};
		System.out.println("List of Values: ");
		printArray(intUnsArray);
		System.out.println("\nBinary Search: ");
		position = binarySearch(intUnsArray, key);
		System.out.println(position == -1?"Not Found":"Key is at position " + (position + 1));
		System.out.println("\nRecursive Binary Search: ");
		position = recursiveBinarySearch(intUnsArray, key, 0, intUnsArray.length-1);
		System.out.println(position == -1?"Not Found":"Key is at position " + (position + 1));
	}//end main()
	public static int recursiveBinarySearch(int[] array, int key, int start, int end)
	{
		int mid = (start + end)/2;
		if(start>end)
		{
			return -1;
		}//end if
		if(key == array[mid])
		{
			return mid;
		}//end if
		if(key>array[mid])
		{
			start = mid + 1;
			return recursiveBinarySearch(array, key, start, end);
		}
		else
		{
			end = mid-1;
			return recursiveBinarySearch(array, key, start, end);
		}//end if
	}//end recursiveBinarySearch
	public static int binarySearch(int[] array, int key)
	{
		//Need to have start, end, and mid indeces
		int start = 0, end = array.length-1, mid = -1;
		while(start<=end)
		{
			mid = (start + end)/2;
			if(key==array[mid])
			{
				return mid;
			}//end if
			if(key<array[mid])
			{
				end = mid-1;
			}
			else if(key>array[mid])
			{
				start = mid+1;
			}//end if
		}//end loop
		return -1;
	}//end binarySearch()
	public static void printArray (int[] array)
	{
		for (int i = 0; i<array.length; i++)
		{
			System.out.print(array[i] + "  ");
		}//end loop
		System.out.println();
	}//end printArray()
}//end class