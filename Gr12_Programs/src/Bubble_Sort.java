/*
 * D. Carreira
 * Tues, May 10, 2022
 * Bubble Sort: SORT-IN-PLACE algortighm- as efficient as selection sort
 * 				Repeatedly compare adjacent elements
 *              - If the element to the Right is less than the element to the Left
 *              - For a list of n elements, there are n passes through the list.
 *              - NOTE: Can be made more effiient as in every pass, 
 *              the largest element is pushed to the rightmost correct postiiont
 *              OUTER LOOP = # pases = $ elemnts
 *              INNER LOOP = # elements -- since we compare all neighbours
 *              
 *              BIG O: n^2  <== NOTE: that BIG O tales the largest exponenet for equation
 *              represneting number of comparisons: n^2 + 3n + 5, then constants removed
 *              and BIG O remains as n^2
 *              
 *              
 *              
 * Homework exercise: adapt the algorithm to use ArrayList<>
 * 					  - add the sort method to the client menu
 * 					  - create a similar method using an Alpha List
 * 					  - ie. should have sort for ints and for word list (using unicode)
 */
public class Bubble_Sort 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		int[] nums = {22, 30, 15, 1, 7, 87, 65, 24, 22, 0};
		System.out.println("UNSORTED:");
		printArray(nums);
		System.out.println("SORTED:");
		bubbleSort(nums);
		printArray(nums);
	}//end main
	public static void bubbleSort(int[] array)
	{
		//outer loop detemines the # passes through the entire array
		//this algorith will have # pass = # elements
		int counter = 0;
		boolean swapped = false;
		for(int pass = 0; pass < array.length; pass++)
		{
			swapped = false;
			for(int element = 0; element < array.length - 1; element++ )
			{
				//if the L element is > R neighboring elementl; swap
				if(array[element] > array[element + 1])
				{
					swap(array, element, element + 1);
					swapped = true;
					counter ++;
				}//end if
				if(!swapped)
				{
					break;
				}//end if
			}//end inner loop for 
		}//end outer loop for # passes
		System.out.println(counter);
	}//end bubbleSort()
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