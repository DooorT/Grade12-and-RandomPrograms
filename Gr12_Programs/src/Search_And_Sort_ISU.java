import javax.swing.JOptionPane;
import java.util.ArrayList;
/*
 * D. Carreira
 * April 20, 2022
 * Search and Sort ISU
 * This program will use searching and sorting algorithms such as binary search,
 * linear search, binary recursive shirt, selection sort and more.
 */
public class Search_And_Sort_ISU 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		int retry = 0;
		boolean dataType = true; //int if true, String if false
		boolean search = true; //search if true, sort if false
		Object[] options = {"Search", "Sort"};
		Object[] typeOptions = {"Numeric", "Alphabetical"};
		int[] numArray = {22, 65, 1, 98, 30, 77, 12, 67, 34, 24};
		String[] stringArray = {"James", "Robert", "Alex", "Kayla", "Thomas", "Charles", "Matthew", "Daniel", "Paul", "Stephen"};
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		ArrayList<String> names = new ArrayList<String>();
		for(int i = 0; i < numArray.length; i++)
		{
			numbers.add(numArray[i]);
			names.add(stringArray[i]);
		}//end loop
		do
		{
			search = JOptionPane.showOptionDialog(null, "Which function would you like to perform?", "User Menu", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == 0;
			dataType = JOptionPane.showOptionDialog(null, "Would you like to search/sort an Alpha list or Num list?", "Data Type", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, typeOptions, typeOptions[0]) == 0;
			if(search)
			{
				searchSelect(numbers, names, dataType);
			}
			else
			{
				sortSelect(numbers, names, dataType);
				System.out.println("Sorted array: ");
				if(dataType)
				{
					printArray(numbers);
					System.out.println();
				}
				else
				{
					printArrayAlpha(names);
					System.out.println();
				}//end if
			}//end if
			retry = JOptionPane.showConfirmDialog(null, "Would you like to perform another function?", "Retry?", JOptionPane.YES_NO_OPTION);
		}while(retry == JOptionPane.YES_OPTION);
	}//end main()
	public static int linearSearch(ArrayList<Integer> numbers, int key)
	{
		int index = -1;
		for(int i = 0; i < numbers.size(); i++)
		{
			if(numbers.get(i) == key)
			{
				return i;
			}//end if
		}//end loop
		return index;
	}//end linearSearch()
	public static int linearSearchAlpha(ArrayList<String> names, String key)
	{
		int index = -1;
		for(int i = 0; i < names.size(); i++)
		{
			if(names.get(i).equals(key))
			{
				return i;
			}//end if
		}//end loop
		return index;
	}//end linearSearchAlpha()
	public static int binarySearch(ArrayList<Integer> numbers, int key)
	{
		selSort(numbers, true);
		int start = 0, end = numbers.size()-1, mid = -1;
		while(start <= end)
		{	
			mid = (start + end)/2;
			if(key == numbers.get(mid))
			{
				return mid;
			}
			if(key < numbers.get(mid))
			{
				end = mid-1;
			}
			if(key > numbers.get(mid))
			{
				start = mid + 1;
			}//end if
		}//end loop
		return -1;
	}//end binarySearch()
	public static int binarySearchAlpha(ArrayList<String> names, String key)
	{
		selSortAlpha(names, true);
		int start = 0, end = names.size()-1, mid = -1;
		while(start <= end)
		{	
			mid = (start + end)/2;
			if(key.equals(names.get(mid)))
			{
				return mid;
			}
			if(key.compareToIgnoreCase(names.get(mid)) < 0)
			{
				end = mid-1;
			}
			if(key.compareToIgnoreCase(names.get(mid)) > 0)
			{
				start = mid + 1;
			}//end if
		}//end loop
		return -1;
	}//end binarySearchAlpha()
	public static int binarySearchRec(ArrayList<Integer> numbers, int key, int start, int end)
	{
		selSort(numbers, true);
		int mid = ((start + end)/2);
		if(start>end)
		{
			return -1;
		}//end if
		if(key == numbers.get(mid))
		{
			return mid;
		}//end if
		if(key < numbers.get(mid))
		{
			return binarySearchRec(numbers, key, start, (mid-1));
		}
		else
		{
			return binarySearchRec(numbers, key, (mid+1), end);
		}//end if
	}//end binarySearchRec()
	public static int binarySearchRecAlpha(ArrayList<String> names, String key, int start, int end)
	{
		selSortAlpha(names, true);
		int mid = ((start + end)/2);
		if(start>end)
		{
			return -1;
		}//end if
		if(key.equals(names.get(mid)))
		{
			return mid;
		}//end if
		if(key.compareToIgnoreCase(names.get(mid)) < 0)
		{
			return binarySearchRecAlpha(names, key, start, (mid-1));
		}
		else
		{
			return binarySearchRecAlpha(names, key, (mid+1), end);
		}//end if
	}//end binarySearchRecAlpha()
	public static void selSort(ArrayList<Integer> array, boolean ascending)
	{
		for(int i = 0; i < array.size(); i++)
		{
			for(int j = 0; j < array.size(); j++)
			{
				if(ascending)
				{
					if(array.get(i) < array.get(j))
					{
						swap(array, i, j);
					}//end if
				}
				else //descending
				{
					if(array.get(i) > array.get(j))
					{
						swap(array, i, j);
					}//end if
				}//end if
			}//end inner loop
		}//end loop
	}//end selSort()
	public static void selSortAlpha(ArrayList<String> array, boolean ascending)
	{
		for(int i = 0; i < array.size(); i++)
		{
			for(int j = 0; j < array.size(); j++)
			{
				if(ascending)
				{
					if(array.get(i).compareToIgnoreCase(array.get(j)) < 0)
					{
						swapAlpha(array, i, j);
					}//end if
				}
				else //descending
				{
					if(array.get(i).compareToIgnoreCase(array.get(j)) > 0)
					{
						swapAlpha(array, i, j);
					}//end if
				}//end if
			}//end inner loop
		}//end loop
	}//end selSortAlpha()
	public static void insertionSort(ArrayList<Integer> array, boolean ascending)
	{
		int key, j;
		for(int i = 1; i < array.size(); i++)
		{
			key = array.get(i);
			j = i-1;
			if(ascending)
			{
				while(j >= 0 && key < array.get(j))
				{
					swap(array, j, j+1);
					j--;
				}//end inner loop
			}
			else
			{
				while(j >= 0 && key > array.get(j))
				{
					swap(array, j, j+1);
					j--;
				}//end inner loop
			}//end if
		}//end outer loop
	}//end insertionSort()
	public static void insertionSortAlpha(ArrayList<String> array, boolean ascending)
	{
		String key;
		int j;
		for(int i = 1; i < array.size(); i++)
		{
			key = array.get(i);
			j = i-1;
			if(ascending)
			{
				while(j >= 0 && key.compareToIgnoreCase(array.get(j)) < 0)
				{
					swapAlpha(array, j, j+1);
					j--;
				}//end inner loop
			}
			else
			{
				while(j >= 0 && key.compareToIgnoreCase(array.get(j)) > 0)
				{
					swapAlpha(array, j, j+1);
					j--;
				}//end inner loop
			}//end if
		}//end outer loop
	}//end insertionSortAlpha()
	public static void bubbleSort(ArrayList<Integer> array, boolean ascending)
	{
		boolean swapped = false;
		for(int i = 0; i < array.size(); i++)
		{
			swapped = false;
			for(int j = 0; j < array.size()-1; j++)
			{
				if(ascending)
				{
					if(array.get(j) > array.get(j+1))
					{
						swap(array, j, j+1);
						swapped = true;
					}//end if
				}
				else
				{
					if(array.get(j) < array.get(j+1))
					{
						swap(array, j, j+1);
						swapped = true;
					}//end if
				}//end if
			}//end inner loop
			if(!swapped)
			{
				break;
			}//end if
		}//end outer loop
	}//end BubbleSort()
	public static void bubbleSortAlpha(ArrayList<String> array, boolean ascending)
	{
		boolean swapped = false;
		for(int i = 0; i < array.size(); i++)
		{
			swapped = false;
			for(int j = 0; j < array.size()-1; j++)
			{
				if(ascending)
				{
					if(array.get(j).compareToIgnoreCase(array.get(j+1)) > 0)
					{
						swapAlpha(array, j, j+1);
						swapped = true;
					}//end if
				}
				else
				{
					if(array.get(j).compareToIgnoreCase(array.get(j+1)) < 0)
					{
						swapAlpha(array, j, j+1);
						swapped = true;
					}//end if
				}//end if
			}//end inner loop
			if(!swapped)
			{
				break;
			}//end if
		}//end outer loop
	}//end BubbleSortAlpha()
	public static int partition(ArrayList<Integer> array, int start, int end, boolean ascending)
	{
		int partitionIndex = start;
		int pivot = array.get(end);
		for(int i = start; i < end; i++)
		{
			if(ascending)
			{
				if(array.get(i) <= pivot)
				{
					swap(array, i, partitionIndex);
					partitionIndex++;
				}//end if
			}
			else
			{
				if(array.get(i) >= pivot)
				{
					swap(array, i, partitionIndex);
					partitionIndex++;
				}//end if
			}//end if
		}//end loop
		swap(array, partitionIndex, end);
		return partitionIndex;
	}//end partition()
	public static int partitionAlpha(ArrayList<String> array, int start, int end, boolean ascending)
	{
		int partitionIndex = start;
		String pivot = array.get(end);
		for(int i = start; i < end; i++)
		{
			if(ascending)
			{
				if(array.get(i).compareToIgnoreCase(pivot) <= 0)
				{
					swapAlpha(array, i, partitionIndex);
					partitionIndex++;
				}//end if
			}
			else
			{
				if(array.get(i).compareToIgnoreCase(pivot)  >= 0)
				{
					swapAlpha(array, i, partitionIndex);
					partitionIndex++;
				}//end if
			}//end if
		}//end loop
		swapAlpha(array, partitionIndex, end);
		return partitionIndex;
	}//end partitionAlpha()
	public static void quickSort(ArrayList<Integer> array, int start, int end, boolean ascending)
	{
		if(start < end)
		{
			int partitionIndex = 0;
			partitionIndex = partition(array, start, end, ascending);
			quickSort(array, start, partitionIndex-1, ascending);
			quickSort(array, partitionIndex+1, end, ascending);
		}//end if
	}//end quickSort()
	public static void quickSortAlpha(ArrayList<String> array, int start, int end, boolean ascending)
	{
		if(start < end)
		{
			int partitionIndex = 0;
			partitionIndex = partitionAlpha(array, start, end, ascending);
			quickSortAlpha(array, start, partitionIndex-1, ascending);
			quickSortAlpha(array, partitionIndex+1, end, ascending);
		}//end if
	}//end quickSortAlpha()
	public static void mergeSort(ArrayList<Integer> array, boolean ascending)
	{
		int mid = array.size() / 2;
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		if(array.size() >1)
		{
			for(int i = 0; i < mid; i++)
			{
				left.add(array.get(i));
			}//end loop
			for(int j = mid; j < array.size(); j++)
			{
				right.add(array.get(j));
			}//end loop
			mergeSort(left, ascending);
			mergeSort(right, ascending);
			merge(array, left, right, ascending);
		}//end if
	}//end mergeSort()
	public static void merge(ArrayList<Integer> array, ArrayList<Integer> left, ArrayList<Integer> right, boolean ascending)
	{
		ArrayList<Integer> temp = new ArrayList<>();
		int arrayIdx =0, leftIdx=0, rightIdx=0, tempIdx = 0;
		while(leftIdx < left.size() && rightIdx < right.size())
		{
			if(ascending)
			{
				if(left.get(leftIdx) < right.get(rightIdx))
				{
					array.set(arrayIdx, left.get(leftIdx));
					leftIdx++;
				}
				else
				{
					array.set(arrayIdx, right.get(rightIdx));
					rightIdx++;
				}//end if
				arrayIdx++;
			}
			else
			{
				if(left.get(leftIdx) > right.get(rightIdx))
				{
					array.set(arrayIdx, left.get(leftIdx));
					leftIdx++;
				}
				else
				{
					array.set(arrayIdx, right.get(rightIdx));
					rightIdx++;
				}//end if
				arrayIdx++;
			}//end if
		}//end loop
		if (leftIdx >= left.size())
		{
			temp = right;
			tempIdx = rightIdx;
		}//end loop
		else
		{
			temp = left;
			tempIdx = leftIdx;
		}//end if
		for(int i = tempIdx; i < temp.size(); i++)
		{
			array.set(arrayIdx, temp.get(i));
			arrayIdx++;
		}//end loop
	}//end merge()
	public static void mergeSortAlpha(ArrayList<String> array, boolean ascending)
	{
		int mid = array.size() / 2;
		ArrayList<String> left = new ArrayList<String>();
		ArrayList<String> right = new ArrayList<String>();
		if(array.size() >1)
		{
			for(int i = 0; i < mid; i++)
			{
				left.add(array.get(i));
			}//end loop
			for(int j = mid; j < array.size(); j++)
			{
				right.add(array.get(j));
			}//end loop
			mergeSortAlpha(left, ascending);
			mergeSortAlpha(right, ascending);
			mergeAlpha(array, left, right, ascending);
		}//end if
	}//end mergeSortAlpha()
	public static void mergeAlpha(ArrayList<String> array, ArrayList<String> left, ArrayList<String> right, boolean ascending)
	{
		ArrayList<String> temp = new ArrayList<String>();
		int arrayIdx =0, leftIdx=0, rightIdx=0, tempIdx = 0;
		while(leftIdx < left.size() && rightIdx < right.size())
		{
			if(ascending)
			{
				if(left.get(leftIdx).compareToIgnoreCase(right.get(rightIdx)) < 0)
				{
					array.set(arrayIdx, left.get(leftIdx));
					leftIdx++;
				}
				else
				{
					array.set(arrayIdx, right.get(rightIdx));
					rightIdx++;
				}//end if
				arrayIdx++;
			}
			else
			{
				if(left.get(leftIdx).compareToIgnoreCase(right.get(rightIdx)) > 0)
				{
					array.set(arrayIdx, left.get(leftIdx));
					leftIdx++;
				}
				else
				{
					array.set(arrayIdx, right.get(rightIdx));
					rightIdx++;
				}//end if
				arrayIdx++;
			}//end if
		}//end loop
		if (leftIdx >= left.size())
		{
			temp = right;
			tempIdx = rightIdx;
		}//end loop
		else
		{
			temp = left;
			tempIdx = leftIdx;
		}//end if
		for(int i = tempIdx; i < temp.size(); i++)
		{
			array.set(arrayIdx, temp.get(i));
			arrayIdx++;
		}//end loop
	}//end mergeAlpha()
	public static void swap(ArrayList<Integer> array, int index1, int index2)
	{
		int temp = array.get(index1);
		array.set(index1, array.get(index2));
		array.set(index2, temp);
	}//end swap()
	public static void swapAlpha(ArrayList<String> array, int index1, int index2)
	{
		String temp = array.get(index1);
		array.set(index1, array.get(index2));
		array.set(index2, temp);
	}//end swapAlpha()
	public static void printArray(ArrayList<Integer> array)
	{
		for (int i = 0; i<array.size(); i++)
		{
			System.out.print(array.get(i) + "  ");
		}//end loop
		System.out.println();
	}//end printArray()
	public static void printArrayAlpha(ArrayList<String> array)
	{
		for (int i = 0; i<array.size(); i++)
		{
			System.out.print(array.get(i) + "  ");
		}//end loop
		System.out.println();
	}//end printArrayAlpha()
	public static void searchSelect(ArrayList<Integer> nums, ArrayList<String> names, boolean dataType)
	{
		int key = 0;
		String strKey = "";
		Object[] options = {"Linear Search", "Binary Search", "Recursive Binary Search"};
		Object selectionObject = null;
		String selectionString = null;
		if(dataType)
		{
			System.out.println("Number Array:");
			printArray(nums);
			key = Integer.parseInt(JOptionPane.showInputDialog(null, "What number do you want to find?", ""));
		}
		else
		{
			System.out.println("Name Array:");
			printArrayAlpha(names);
			strKey = JOptionPane.showInputDialog(null, "What word do you want to find?", "");
		}//end if
		selectionObject = JOptionPane.showInputDialog(null, "Which search algorithm would you like to use?", "Search", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		selectionString = selectionObject.toString();
		if(selectionString.equals("Linear Search"))
		{
			String position = "";
			System.out.println("Calling Linear Search...");
			if(dataType)
			{
				position = (linearSearch(nums, key)==-1)?"The number could not be found.":("The number " + key + " is at position: " + (linearSearch(nums, key) + 1));
			}
			else 
			{
				position = (linearSearchAlpha(names, strKey)==-1)?"The word could not be found.":("The word \"" + strKey + "\" is at position: " + (linearSearchAlpha(names, strKey) + 1));
			}//end if
			System.out.println(position);
		}
		else if(selectionString.equals("Binary Search"))
		{
			String position = "";
			System.out.println("Calling Binary Search...");
			if(dataType)
			{
				position = (binarySearch(nums, key)==-1)?"The number could not be found.":("When sorted, the number " + key + " is at position: " + (binarySearch(nums, key) + 1));
			}
			else
			{
				position = (binarySearchAlpha(names, strKey)==-1)?"The word could not be found.":("When sorted, the word \"" + strKey + "\" is at position: " + (binarySearchAlpha(names, strKey) + 1));
			}//end if
			System.out.println(position);
		}
		else
		{
			String position = "";
			System.out.println("Calling Recursive Binary Search...");
			if(dataType)
			{
				position = (binarySearchRec(nums, key, 0, nums.size()-1)==-1)?"The number could not be found.":("When sorted, the number " + key + " is at position: " + (binarySearchRec(nums, key, 0, nums.size()-1)+ 1));
			}
			else
			{
				position = (binarySearchRecAlpha(names, strKey, 0, nums.size()-1)==-1)?"The word could not be found.":("When sorted, the word \"" + strKey + "\" is at position: " + (binarySearchRecAlpha(names, strKey, 0, nums.size()-1)+ 1));
			}//end if
			System.out.println(position);
		}//end if
	}//end searchSelect()
	public static void sortSelect(ArrayList<Integer> nums, ArrayList<String> names, boolean dataType)
	{
		boolean ascending = true;
		int choice = 0;
		Object selectionObject = null;
		String selectionString = null;
		Object[] orderOptions = {"Ascending", "Descending"};
		Object[] options = {"Selection Sort", "Insertion Sort", "Bubble Sort", "Quick Sort", "Merge Sort"};
		choice = JOptionPane.showOptionDialog(null, "Would you like to sort ascending or descending?", "Sort", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, orderOptions, orderOptions[0]);
		ascending = (choice == 0);
		selectionObject = JOptionPane.showInputDialog(null, "Which sort algorithm would you like to use?", "Sort", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		selectionString = selectionObject.toString();
		if(selectionString.equals("Selection Sort"))
		{
			System.out.println("Calling Selection Sort...");
			if(dataType)
			{
				selSort(nums, ascending);
			}
			else
			{
				selSortAlpha(names, ascending);
			}//end if
		}
		else if(selectionString.equals("Insertion Sort"))
		{
			System.out.println("Calling Insertion Sort...");
			if(dataType)
			{
				insertionSort(nums, ascending);
			}
			else
			{
				insertionSortAlpha(names, ascending);
			}//end if
		}
		else if(selectionString.equals("Bubble Sort"))
		{
			System.out.println("Calling Bubble Sort...");
			if(dataType)
			{
				bubbleSort(nums, ascending);
			}
			else
			{
				bubbleSortAlpha(names, ascending);
			}//end if
		}
		else if(selectionString.equals("Quick Sort"))
		{
			System.out.println("Calling Quick Sort...");
			if(dataType)
			{
				quickSort(nums, 0, nums.size()-1, ascending);
			}
			else
			{
				quickSortAlpha(names, 0, names.size()-1, ascending);
			}//end if
		}
		else if(selectionString.equals("Merge Sort"))
		{
			System.out.println("Calling Merge Sort...");
			if(dataType)
			{
				mergeSort(nums, ascending);
			}
			else
			{
				mergeSortAlpha(names, ascending);
			}//end if
		}//end if
	}//end sortSelect()
}//end class