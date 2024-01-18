/*
 * D. Carreira
 * April 20, 2022
 * 5 Sorting Algorithms:  1. Selection Sort
 *                        2. Bubble
 *                        3. Insterstion
 *                        4. Quick
 *                        5. Merge
 *                        
 * 2 Types of sorting: - In-place Sorting - original array is sorted, no other array required
 * 										    ex. elements are swapped around until they are sorted
 * 										   - saves alot of memory
 *                     - Sub-arrays used (merge)
 * MERGE SORT: Requires addition auxillary arrays
 * SELETION SORT: Sort-in-Place algorithm
 *                - Sorts an array by repeatedly finding the minimum element.
 *                from the unsorted part & puts it at the beguinning in ascenting order. 
 *                1. Completely Sorted.
 *                2. Unsorted portion that we iteratively compare each element to sort.
 *                Example:	 5	10	12	77	13	80	22	100
 *                          ^ SORTED ^  ^    UNSORTED     ^
 *                BIG O (worst case scenario): n^2 comparisons
 *                n + (n-1) + (n-2) + (n-3) ... n(n-2)/2 ==> n*n
 */
public class Selection_Sort 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		int[] nums = {22, 30, 15, 1, 7, 87, 65, 24, 22, 0};
		printArray(nums);
		selSortAsc(nums);
		System.out.println("\nSort List using Selection Sort Ascending: ");
		printArray(nums);
	}//end main()
	
	public static void selSortAsc(int[] arr)
	{
		@SuppressWarnings("unused")
		int smallest = 0;
		//Need a nested loop to track both subarrays
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] < arr[i])
				{
					swap(arr, i, j);
				}//end comparing values
			}//end inner loop
		}//end outer loop
	}//end selSortAsc()
	public static void swap(int[] arr, int idx1, int idx2)
	{
		int temp = arr[idx1]; //save one of the values before swapping
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}//end swap()
	public static void printArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + "  ");
		}//end loop
	}//end printArray()
}//end class