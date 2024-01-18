/*
 * D. Carreira
 * I'm screwed for this :)
 */
public class LinearBinarySearches 
{
	public static void main(String[] args) 
	{
		// Variable Declarations and Initializations
		int value = 34;
		int [] intUnsArray = { 65, 77, 12, 34, 98, 22, 1, 67, 30, 24};
		@SuppressWarnings("unused")
		int [] intSortArray = {1, 12, 22, 24, 30, 34, 65, 67, 77, 98};
		printArray(intUnsArray);
		System.out.println(sortLinearSearching(intUnsArray, value));
		
		/** LINEAR/SEQUENCEIAL SEARCH: go through the list one element at a time & search**/
		//String strArray[] = ( "Johnny", "Anna", "Anika", ....
	}//end main()
	public static int sortLinearSearching(int[] intArray, int value)
	{
		for(int i=0; i<intArray.length;i++)
		{
			if(intArray[i] == value)
			{
				return i;
			}//end if
			//if(intArray[i] > value)
			//{
			//	return -1;
			//}//end if
		}//end loop
		return -1; //default to indicate not found.
	}
	public static void printArray (int[] intArr)
	{
		for (int i = 0; i<intArr.length; i++)
		{
			System.out.println(intArr[i] + "  ");
		}//end loop
		System.out.println();
	}//end printArray()
}//end class()
