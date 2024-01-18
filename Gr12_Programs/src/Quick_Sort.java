/*
 * D. Carreira
 * May 16th, 2022
 * QUICK SORT: RECURSIVE sorting algorithm; sort-in-place algorithm
 * 				- one element deemed the PIVOT is compared to all other elements
 * 				- PIVOT chosen arbitrary (but always the same index) ex. first or last element in list
 * 				- Today we will choose last element as PIVOT to be compared with all others in list
 * 				- COMPARISONS: we compare all elements to the Left to determine the correct position of PIVOT
 * 				- in each comparison if an elemnt is < PIVOT, we place the smaller element to the left.
 * 				- AT THE END: place the pivot in the correct index
 * 				-        at this point all elements to the left of PIVOT are smaller, 
 *                       and all to the right are larger.
 *              - TO WORK: We need to track the index where PIVOT may go (PARTITIONING INDEX) & 
 *                                                        i, which is iteration through the list
 *                                                        
 *              - PIVOT = PARTITIONING INDEX <-- we call Quick Sort again on elements to the L & elements
 *                to the right of PIVOT  <==RECURSION
 *                
 *                NOTE: the PIVOT at the PI is the only element sorted.
 *          	
 *          	EXAMPLE:  	10		80		30		90		40		50		70
 *          	            i                                              PIVOT
 *                        
 *                        MOST COMMON SORTING ALGORITHM: RECURSIVE
 *                        RUN TIME: on average: O(nlogn) -- Worst Case: O(n^2)
 *                        - we save run time since elemnts to L & R of PIVOT are partially sorted
 *                        - Generally faster than Insertion/Selection/Bubble
 */			
public class Quick_Sort 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		int nums[] = {22, 30, 15, 7, 87, 65, 24, 22, 0};
		System.out.println("UNSORTED:");
		printArray(nums);
		System.out.println("\n\nCalling Quick Sort...");
		quickSort(nums, 0, nums.length-1);
		printArray(nums);
	}//end main()
		//PARTITION: will sort the PIVOT and ensure all elements to the left of pivot are smaller,
		//and all elements to the right og PIVOT are larger.
		//At the end of partition, the pivot will be in the correct position.
		// We will arbitrarily choose the LAST element to be the pivot.
		// Will return the index/Partitioning index of where pivot has been placed.
	public static int partition(int[] arr, int start, int end)
	{
		//intialize the PI to be the start of the list
		int partitionIndex = start;
		//pivot is the last element in list
		int pivot = arr[end];
		//loop in the subarray to the end of the sublist to repeatedly check each element
		for(int i = start; i < end; i++)
		{
			//if we find an element < pivot we swap it w. elemend at PI <== then increase p[i] <== pI++
			if(arr[i] <= pivot)
			{
				swap(arr, i, partitionIndex); //allows elements to L of pivot to be smaller.
				partitionIndex++;
			}//end if
			//at the end put the pivot at Partition Index, at its correct sorted location
		}//end loop
		swap(arr, partitionIndex, end); //PIVOT is the element at end
		//return the position of pivot so we can recursively call the list to the Right,
		//and left of PIVOT. The PI determines how to split the list.
		return partitionIndex;
	}//end partition
	//Need to create QuickSort which is the algorithm that recursively calls Partition on sublists
	public static void quickSort(int[] arr, int start, int end)
	{
		//base case: List as not been consumed. The start is not >= end
		if(start<end)
		{
			int partitionIndex = partition(arr,start,end);
			//After we get PI, we call quickSort on L & R list
			quickSort(arr, start, partitionIndex-1);
			quickSort(arr, partitionIndex + 1, end);
		}//end if
	}//end quickSort()
	public static void swap(int[] array, int index1, int index2)
	{
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}//end swap()
	public static void printArray(int[] array)
	{
		System.out.println("The elements in the list are:");
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}//end loop
	}//end printArray()
}//end class