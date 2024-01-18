/*
 * C. Annetta
 * Linear Search & Binary Search
 * Purpose: is to find a KEY within a sorted or unsorted list.
 * LINEAR SEARCH: NO precondition wrt the order of the list
 * 			- simply check each element until we find the key
 * 			- has a subtle difference with a sorted vs unsorted list IFF 
 * 			  you are looking for the last instance of the key in the list
 * BINARY SEARCH: PRECONDITION: list is sorted
 * - we repeatedly check the middle value of a set for the key, & repeatedly remove one half
 * - ex: if the value is greater than mid value, then eliminate the first half of set
 * - and then check the middle value of the remaining set
 * - repeat
 * - if the value/key is less than the middle element, then eliminate the second half
 * - and repeatedly search in this manner
 * 
 */
public class Searching_Linear_Binary 
{
	public static void main(String[] args) 
	{
		//Variable Declarations & Initializations
		int key = 24;
		int index = -1;
		int [] intUnsArray = { 65, 77, 12, 34, 98, 22, 1, 67, 30, 24 };
		int [] intSortArray = {1, 12, 22, 24, 30, 34, 65, 67, 77, 98};
		System.out.println("Search for value " + key);
		printArray(intUnsArray);
		index = unsLinearSearch(intUnsArray, key);
		if(index != -1)//found
		{
			System.out.println("The element " + key + " has been found at position " + (index+1));
		}
		else
		{
			System.out.println("The element has not been found");
		}//end if
		System.out.println("Search for value " + key + " using Binary Search");
		index = binarySearch(intSortArray, key);
		if(index != -1)//found
		{
			System.out.println("The element " + key + " has been found at position " + (index+1));
		}
		else
		{
			System.out.println("The element has not been found");
		}//end if
		index = binSearchRec(intSortArray, key, 0, intSortArray.length-1);
		if(index != -1)//found
		{
			System.out.println("The element " + key + " has been found at position " + (index+1));
		}
		else
		{
			System.out.println("The element has not been found");
		}//end if
	}//end main()
	//Binary Search: Iterative approach
	//Precondition: the array is sorted in ascending order
	public static int binarySearch (int[] intArray, int key)
	{
		//declare indeces that determine start, end, & middle index of list
		int start=0, end = intArray.length-1, mid=-1;
		while(start<=end)//if start>end then we exhausted the list & value doesn't exist<= -1 returned
		{
			mid = (start + end)/2; //middle value
			//check if mid is the key, return mid
			if(key == intArray[mid])
			{
				return mid;
			}//end if
			//check if key is < mid, adjust beg & end: beg = beg, end = mid - 1
			if(key < intArray[mid])
			{
				end = mid - 1;
			}//end if
			//check if key > mid, adjust beg & end: beg = mid + 1; end = end
			if(key > intArray[mid])
			{
				start = mid + 1;
			}//end if
		}//loop search
		return -1;
	}//end binarySearch
	
	public static int binSearchRec(int[] intArray, int key, int start, int end)
	{
		//base cases: 1. item found (key == mid) OR 2. exhausted the list
		int mid = (start + end)/2;
		if(start > end)//not found
		{
			return -1;
		}
		if(key == intArray[mid])
		{
			return mid;
		}
		else if(key > intArray[mid])
		{
			start = mid + 1;
			return binSearchRec(intArray, key, start, end);
		}
		else//bottom half
		{
			end = mid - 1;
			return binSearchRec(intArray, key, start, end);
		}
		
	}//endbinSearchRec
	
	
	public static int unsLinearSearch(int[] intArray, int value)
	{
		for(int i = 0; i<intArray.length; i++)
		{
			if(intArray[i] == value)
			{
				return i;
			}//end if
		}//end loop
		return -1; //-1 indicates key not found
	}//end 
	public static void printArray(int [] intArr)
	{
		for(int i = 0; i < intArr.length; i++)
		{
			System.out.print(intArr[i] + "  ");
		}//end loop
		System.out.println();
	}//end printArray()
}//end class()
