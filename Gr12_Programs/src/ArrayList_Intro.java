/*
 *D. Carreira
 *Feb 22, 2022
 *ArrayLists have scattered memory because they don't have a set number of indeces
 *Array Lists<>
 *Static Arrays[]   --> STATIC  --> Requires pre-determined number of elements
 *ArrayLists<> ----> DYNAMIC ---> number of elements cane change AT RUN TIME
 ***IMPORTANT: ArrayLists can only hold Objects
 *			Static Arrays can hold objects and PDTs
 *		-can direactly add a PDT BUT a PDT will not be stored <==Autoboxing
 *		Autoboxing -> Will convert an int or double to an int or double object
 *
 *Retrieval and Access is different for ArrayLists<>
 *ArrayList<> Methods/Functions:
 *	AL.add() -- adds elements to AL<>  ; overloaded method
 *	AL.get() -- retrieve elements
 *	AL.size() -- 
 *	AL.set() ??
 *	AL.remove()  -- overloaded method (Object or index)
 *	AL.replace() -- 
 *
 *Object: 	1. State
 *			2. Behaviour (methods)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_Intro 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		int retry = 1;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		//RECALL ArrayLists can only hold objects, not PDTs, ex. "Integer" not "int"
		ArrayList<Integer> jerseyNum = new ArrayList<>();
		/**name is an OBJECT that holds an address/reference**/
		// can put number within round brackets () to force 
		//contiguous memory allocation for fast retrieval
		//	Likely use a while or do..while for AL<> since we dont know ahead of time how many elements
		//	will be populated
		do
		{
			System.out.println("Please enter a player name:");
			names.add(scan.nextLine()); // user inputed name will be directly stored via .add
			//.add will add an element to the end of an AL<>
			System.out.println("Please enter the player's jersey number:");
			jerseyNum.add(new Integer(Integer.parseInt(scan.nextLine())));
			//if you dont use (new Integer) the ints will be autoboxed into Integers
			//new Integer makes each int to an object (java does it automatically, but AP exam asks for it)
			System.out.println("Press 1 if you want to continue: ");
			retry = Integer.parseInt(scan.nextLine());
		}while(retry == 1);
		printArrayNames(names, jerseyNum);
		avgNum(jerseyNum); 	// THIS CALL WILL NOT RESULT IN ANY OUTPUT
							//RETURN IS NEITHER STORED NOR PRINTED.
		System.out.println("\nThe average of the jersey numbers is: " + avgNum(jerseyNum));  //
		scan.close();
	}//end main()
	public static void printArrayNames(ArrayList<String> names, ArrayList<Integer> num)
	{
		System.out.println("Player Name \t\t Jersey Number ");
		System.out.println("--------------------------------------");
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i) + " \t\t " + num.get(i) );
		}//end loop
	}//end printArray()
	public static double avgNum(ArrayList<Integer> numbers)
	{
		return (sumNums(numbers)/numbers.size());
	}//end avgNum()
	/** METHODS CAN CALL OTHER METHODS **/
	public static double sumNums(ArrayList<Integer> numbers)
	{
		double total = 0;
		for(int i = 0; i< numbers.size(); i++)
		{
			total += numbers.get(i);
		}//end loop
		return total;
	}//end sumNums
}//end class()
