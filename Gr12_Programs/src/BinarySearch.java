/*
 * Cuts search list in half repeatedly until the search element is found
 * List must be sorted
 */
public class BinarySearch 
{
	public static void main(String[] args) {
		// Variable Declarations & Initializations
		@SuppressWarnings("unused")
		int position = 0;
		int [] intSortArray = {1, 12, 22, 24, 30, 34, 65, 67, 77, 98};
		printArray(intSortArray);
		
		System.out.println("Key 65's position is: " + (binarySearch(intSortArray, 65)+1));

	}

	public static int binarySearch(int[] intArray, int key)
	{
		//need to know the beninging and the end
		int start = 0;
		int mid = 0;
		int end = intArray.length-1;
		//loop until the key is found in the list
		while(start<=end)
		{
			mid = (start+end)/2;
			//if key equal to middle element --> found --> return mid
			//else if key < middle element --> end = mid-1
			//else ==> (start key > middle element ==> start just before middle: start = mid+1
			if(key == intArray[mid])
			{
				return mid;
			}
			else if (key<intArray[mid])
			{
				end = mid-1;
			}
			else
			{
				start = mid+1;
			}
		}
		return 0;
	}
	public static void printArray (int[] intArr)
	{
		for (int i = 0; i<intArr.length; i++)
		{
			System.out.print(intArr[i] + "  ");
		}//end loop
		System.out.println();
	}//end printArray()
}