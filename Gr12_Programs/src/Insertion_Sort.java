/*
 * D. Carreira
 * Mon, April 25th, 2022
 * Insertion Sort (Sort-in-place algorithm)
 * 		 - Sorted Subarray (ex LS) and Unsorted Subarray (ex BS) within the array.
 *       - Repeatedly compares the key (i) to each element in the subarray
 *         and "INSERTS" the key in the proper order
 *         
 *         5	8	1	3	9	6;  5 --> sorted    key = 8 (key is 1 element after sorted subarray)
 *         5	8	1	3	9	6;  5, 8 --> Sorted; key = 1
 *         1	5	8	3	9	6;  1, 5, 8 --> Sorted; key = 3
 *         1	3	5	8	9	6;  1, 3, 5, 8 --> key = 9;
 *         1	3	5	8	9	6;  1, 3, 5, 8, 9 --> key = 6;
 *         1	3	5	6	8	9;  1, 3, 5, 6, 8, 9 --> key = 6;  algorith ends when i = arr.length
 */
public class Insertion_Sort 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		int[] nums1 = {22, 30, 15, 1, 7, 87, 65, 24, 22, 0};
		@SuppressWarnings("unused")
		int[] nums2 = {22, 30, 15, 1, 7, 87, 65, 24, 22, 0};
		System.out.println("Original Unsorted List: ");
		printArray(nums1);
		System.out.println("\n\nCalling Insertion Sort... \n");
		//call it bruhther
		insertionSort(nums1); //Reference/ address to array is sent to method
		System.out.println("Sorted List: ");
		printArray(nums1);
		System.out.println("\n\nSecond Original Unsorted List: ");
		printArray(nums1);
		System.out.println("\n\nCalling Descending Selection Sort... \n");
		//call it bruhther
		insertionSort(nums1); //Reference/ address to array is sent to method
		System.out.println("Sorted List: ");
		printArray(nums1);
	}//end main()
	public static void insertionSort(int[] arr)
	{
		int key, j, temp;
		//to start, we have a subarray of 1 element; assumption is it's sorted
		//Outer loop will iterate through the array, key will = i as it iterates
		for(int i = 1; i < arr.length; i++)
		{
			
			//Inner loop: Swaps/Inserts within the sorted subarray
			//while Loop: keep swapping as IFF there are elements > key && j >= 0 
			                      //(ie there are still subarray elements to check)
			key = arr[i];
			j = i-1;
			while(j >= 0 && key < arr[j])//shifting routine
			{
				//if you eneter here, shifting needs to happen
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				j--; // decrement j to check the element before
			}//end inner loop for j sorted elements being checked against key
		}//end outer for loop/ unsorted elements
	}
	public static void selSortDes(int[] arr)
	{
		int num = arr.length; //n tracks size of unsorted list
		int maxPos;
		while (num > 1)
		{
			maxPos = 0; //set max to 1st element of unsorted subarray
			for(int i = 0; i < num; i++)
			{
				if(arr[i] > arr[maxPos])
				{
					maxPos = i;
				}//end if
				swap(arr, maxPos, num-1);
			}//end loop through unsorted subarray
			num--;
		}//end outer loop
	}//end selSortDes
	public static void printArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + "  ");
		}//end loop
	}//end printArray()
	public static void swap(int[] arr, int idx1, int idx2)
	{
		int temp = arr[idx1]; //save one of the values before swapping
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}//end swap()
}//end class